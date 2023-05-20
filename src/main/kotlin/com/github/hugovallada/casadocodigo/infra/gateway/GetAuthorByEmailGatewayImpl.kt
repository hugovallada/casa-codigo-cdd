package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAuthorByEmailGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.AuthorRepository
import com.github.hugovallada.casadocodigo.infra.translator.toAuthorDomain
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetAuthorByEmailGatewayImpl(private val authorRepository: AuthorRepository) : GetAuthorByEmailGateway {
    override fun execute(field: String): AuthorDomain? =
        authorRepository.findByEmail(field)?.toAuthorDomain()
}
