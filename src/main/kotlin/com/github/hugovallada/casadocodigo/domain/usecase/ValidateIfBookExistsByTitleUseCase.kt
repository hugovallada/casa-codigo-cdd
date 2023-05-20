package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetBookByTitleGateway
import com.github.hugovallada.casadocodigo.shared.validator.isNull
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ValidateIfBookExistsByTitleUseCase(private val getBookByTitleGateway: GetBookByTitleGateway) {
    operator fun invoke(title: String) = check(getBookByTitleGateway.execute(title).isNull()) {
        "Já há um livro cadastrado com esse título"
    }
}
