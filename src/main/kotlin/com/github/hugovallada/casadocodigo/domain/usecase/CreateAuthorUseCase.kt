package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateAuthorGateway
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAuthorByEmailGateway
import com.github.hugovallada.casadocodigo.shared.rules.EntityNameRules.AUTHOR
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateAuthorUseCase(
    private val getAuthorByEmailGateway: GetAuthorByEmailGateway,
    private val createAuthorGateway: CreateAuthorGateway
) {
    operator fun invoke(author: AuthorDomain) {
        ValidateIfEntityExistsByUniqueFieldUseCase(getAuthorByEmailGateway).run {
            execute(author.email.value to AUTHOR)
        }
        createAuthorGateway.execute(author)
    }
}
