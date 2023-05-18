package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import com.github.hugovallada.casadocodigo.domain.gateway.out.CreateCategoryGateway
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateCategoryUseCase(
    private val createCategoryGateway: CreateCategoryGateway,
    private val validateIfCategoryExistsByNameUseCase: ValidateIfCategoryExistsByNameUseCase
) {
    operator fun invoke(category: CategoryDomain) {
        validateIfCategoryExistsByNameUseCase(category.name)
        createCategoryGateway.execute(category)
    }
}
