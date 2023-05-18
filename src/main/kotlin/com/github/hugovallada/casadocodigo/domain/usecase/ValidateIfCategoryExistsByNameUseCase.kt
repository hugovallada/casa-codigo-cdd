package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetCategoryByNameGateway
import com.github.hugovallada.casadocodigo.shared.validator.isNull
import jakarta.enterprise.context.ApplicationScoped

// Agnostic Implementation?
@ApplicationScoped
class ValidateIfCategoryExistsByNameUseCase(private val getCategoryByNameGateway: GetCategoryByNameGateway) {
    operator fun invoke(name: String) {
        check(getCategoryByNameGateway.execute(name).isNull()) { "O nome não pode ser duplicado" }
    }
}
