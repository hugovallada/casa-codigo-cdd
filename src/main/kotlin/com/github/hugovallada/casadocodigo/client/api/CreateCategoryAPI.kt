package com.github.hugovallada.casadocodigo.client.api

import com.github.hugovallada.casadocodigo.infra.gateway.schema.Category
import jakarta.validation.Valid

interface CreateCategoryAPI {
    fun execute(@Valid category: Category)
}
