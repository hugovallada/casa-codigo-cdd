package com.github.hugovallada.casadocodigo.infra.translator

import com.github.hugovallada.casadocodigo.client.model.request.CategoryRequest
import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain

fun CategoryRequest.toDomain() = CategoryDomain(name = name)
