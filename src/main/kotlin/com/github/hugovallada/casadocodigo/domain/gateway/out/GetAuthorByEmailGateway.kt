package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import jakarta.inject.Named

@Named
interface GetAuthorByEmailGateway {
    fun execute(email: String): AuthorDomain?
}