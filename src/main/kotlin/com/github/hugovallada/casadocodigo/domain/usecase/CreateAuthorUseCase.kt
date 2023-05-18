package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateAuthorGateway
import jakarta.inject.Named

@Named
class CreateAuthorUseCase(
    private val validateIfAuthorExistsByEmailUseCase: ValidateIfAuthorExistsByEmailUseCase,
    private val createAuthorGateway: CreateAuthorGateway
) {

    operator fun invoke(author: AuthorDomain): AuthorDomain {
        validateIfAuthorExistsByEmailUseCase(author.email.value)
        return createAuthorGateway.execute(author)
    }

}