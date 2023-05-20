package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain

fun interface GetCategoryByNameGateway : GetEntityByUniqueFieldGateway<CategoryDomain> {
    override fun execute(field: String): CategoryDomain?
}
