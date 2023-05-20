package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetCategoryByNameGateway
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetCategoryByNameUseCase(private val getCategoryByNameGateway: GetCategoryByNameGateway) {
    operator fun invoke(name: String) = getCategoryByNameGateway.execute(name) ?: error("O author não existe")
}
