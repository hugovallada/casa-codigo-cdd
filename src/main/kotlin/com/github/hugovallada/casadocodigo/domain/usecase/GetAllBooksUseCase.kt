package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAllBooksGateway
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetAllBooksUseCase(private val getAllBooksGateway: GetAllBooksGateway) {
    operator fun invoke() = getAllBooksGateway.execute()
}
