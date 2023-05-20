package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateBookGateway
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetBookByTitleGateway
import com.github.hugovallada.casadocodigo.domain.schema.BookDTO
import com.github.hugovallada.casadocodigo.shared.rules.EntityNameRules.BOOK
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateBookUseCase(
    private val getBookByTitleGateway: GetBookByTitleGateway,
    private val getAuthorByEmailUseCase: GetAuthorByEmailUseCase,
    private val getCategoryByNameUseCase: GetCategoryByNameUseCase,
    private val createBookGateway: CreateBookGateway
) {
    operator fun invoke(bookRequest: BookDTO) {
        ValidateThatEntityDoesNotExistsByUniqueFieldUseCase(getBookByTitleGateway).run {
            execute(bookRequest.title to BOOK)
        }
        val author = getAuthorByEmailUseCase(bookRequest.authorEmail)
        val category = getCategoryByNameUseCase(bookRequest.categoryName)
        with(bookRequest.toDomain(author, category)) {
            createBookGateway.execute(this)
        }
    }
}
