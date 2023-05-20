package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain

fun interface GetAuthorByEmailGateway : GetEntityByUniqueFieldGateway<AuthorDomain> {
    override fun execute(field: String): AuthorDomain?
}
