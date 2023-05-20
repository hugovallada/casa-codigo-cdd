package com.github.hugovallada.casadocodigo.infra.gateway.schema

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateBookGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.BookRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
@Transactional
class CreateBookGatewayImpl(private val bookRepository: BookRepository) : CreateBookGateway {
    override fun execute(book: BookDomain) {
        bookRepository.persist(Book.of(book))
    }
}
