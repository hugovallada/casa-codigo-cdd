package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAuthorByEmailGateway
import com.github.hugovallada.casadocodigo.shared.validator.isNull
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ValidateIfAuthorExistsByEmailUseCase(private val getAuthorByEmailGateway: GetAuthorByEmailGateway) {

    operator fun invoke(email: String) {
        check(getAuthorByEmailGateway.execute(email).isNull()) { "O email não pode ser duplicado!" }
    }
}
