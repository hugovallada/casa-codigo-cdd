package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetBookByTitleGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.BookRepository
import com.github.hugovallada.casadocodigo.infra.translator.toDomain
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetBookByTitleGatewayImpl(private val bookRepository: BookRepository) : GetBookByTitleGateway {
    override fun execute(title: String): BookDomain? = bookRepository.findByTitle(title)?.toDomain()
}
