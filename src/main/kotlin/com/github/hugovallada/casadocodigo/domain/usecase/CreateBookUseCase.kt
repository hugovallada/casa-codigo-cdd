package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateBookGateway
import com.github.hugovallada.casadocodigo.domain.schema.BookDTO
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateBookUseCase(
    private val validateIfBookExistsByTitleUseCase: ValidateIfBookExistsByTitleUseCase,
    private val getAuthorByEmailUseCase: GetAuthorByEmailUseCase,
    private val getCategoryByNameUseCase: GetCategoryByNameUseCase,
    private val createBookGateway: CreateBookGateway
) {
    operator fun invoke(bookRequest: BookDTO) {
        validateIfBookExistsByTitleUseCase(bookRequest.title)
        val author = getAuthorByEmailUseCase(bookRequest.authorEmail)
        val category = getCategoryByNameUseCase(bookRequest.categoryName)
        with(bookRequest.toDomain(author, category)) {
            createBookGateway.execute(this)
        }
    }
}
