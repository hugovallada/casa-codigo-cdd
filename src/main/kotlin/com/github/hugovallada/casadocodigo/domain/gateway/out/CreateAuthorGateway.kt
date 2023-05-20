package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain

fun interface CreateAuthorGateway {
    fun execute(authorDomain: AuthorDomain)
}
