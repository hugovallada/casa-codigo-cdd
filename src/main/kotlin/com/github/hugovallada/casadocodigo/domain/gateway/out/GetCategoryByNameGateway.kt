package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain

interface GetCategoryByNameGateway {
    fun execute(name: String): CategoryDomain?
}
