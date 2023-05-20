package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import jakarta.inject.Named

@Named
fun interface GetAuthorByEmailGateway : GetEntityByUniqueFieldGateway<AuthorDomain> {
    override fun execute(field: String): AuthorDomain?
}
