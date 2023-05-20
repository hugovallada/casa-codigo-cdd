package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain

fun interface CreateCategoryGateway {
    fun execute(categoryDomain: CategoryDomain)
}
