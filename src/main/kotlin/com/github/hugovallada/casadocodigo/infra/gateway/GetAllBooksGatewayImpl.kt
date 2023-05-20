package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAllBooksGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.BookRepository
import com.github.hugovallada.casadocodigo.infra.translator.toDomain
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetAllBooksGatewayImpl(private val booksRepository: BookRepository) : GetAllBooksGateway {
    override fun execute() = booksRepository.listAll().map { it.toDomain() }.toSet()
}
