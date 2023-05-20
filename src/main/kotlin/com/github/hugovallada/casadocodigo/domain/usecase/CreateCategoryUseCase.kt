package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateCategoryGateway
import com.github.hugovallada.casadocodigo.domain.gateway.out.GetCategoryByNameGateway
import com.github.hugovallada.casadocodigo.shared.rules.EntityNameRules.CATEGORY
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateCategoryUseCase(
    private val getCategoryByNameGateway: GetCategoryByNameGateway,
    private val createCategoryGateway: CreateCategoryGateway,
) {
    operator fun invoke(category: CategoryDomain) {
        ValidateIfEntityExistsByUniqueFieldUseCase(getCategoryByNameGateway).run {
            execute(category.name to CATEGORY)
        }
        createCategoryGateway.execute(category)
    }
}
