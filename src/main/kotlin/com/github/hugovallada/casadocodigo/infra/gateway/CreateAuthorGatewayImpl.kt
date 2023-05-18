package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateAuthorGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.AuthorRepository
import com.github.hugovallada.casadocodigo.infra.gateway.schema.Author
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
@Transactional
class CreateAuthorGatewayImpl(private val authorRepository: AuthorRepository) : CreateAuthorGateway {
    override fun execute(authorDomain: AuthorDomain) {
        with(Author.of(authorDomain)) {
            authorRepository.persist(this)
        }
    }
}