package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateAuthorGateway
import jakarta.enterprise.context.ApplicationScoped


@ApplicationScoped
class CreateAuthorUseCase(
    private val validateIfAuthorExistsByEmailUseCase: ValidateIfAuthorExistsByEmailUseCase,
    private val createAuthorGateway: CreateAuthorGateway
) {

    operator fun invoke(author: AuthorDomain) {
        validateIfAuthorExistsByEmailUseCase(author.email.value)
        createAuthorGateway.execute(author)
    }

}