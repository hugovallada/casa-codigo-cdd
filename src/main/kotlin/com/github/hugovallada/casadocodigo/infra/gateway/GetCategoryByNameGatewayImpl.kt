package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetCategoryByNameGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.CategoryRepository
import com.github.hugovallada.casadocodigo.infra.translator.toDomain
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetCategoryByNameGatewayImpl(private val categoryRepository: CategoryRepository) : GetCategoryByNameGateway {
    override fun execute(name: String): CategoryDomain? = categoryRepository.findByName(name)?.toDomain()
}
