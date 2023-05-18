package com.github.hugovallada.casadocodigo.infra.gateway

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateCategoryGateway
import com.github.hugovallada.casadocodigo.infra.gateway.repository.CategoryRepository
import com.github.hugovallada.casadocodigo.infra.gateway.schema.Category
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
@Transactional
class CreateCategoryGatewayImpl(private val categoryRepository: CategoryRepository) : CreateCategoryGateway {
    override fun execute(categoryDomain: CategoryDomain) {
        with(Category.of(categoryDomain)) { categoryRepository.persist(this) }
    }
}
