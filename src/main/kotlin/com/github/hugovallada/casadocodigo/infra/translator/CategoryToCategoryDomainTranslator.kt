package com.github.hugovallada.casadocodigo.infra.translator

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import com.github.hugovallada.casadocodigo.infra.gateway.schema.Category

fun Category.toDomain() = CategoryDomain(name = name)
