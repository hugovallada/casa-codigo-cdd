package com.github.hugovallada.casadocodigo.infra.translator

import com.github.hugovallada.casadocodigo.client.model.request.AuthorRequest
import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.entity.value.Description
import com.github.hugovallada.casadocodigo.domain.entity.value.Email

fun AuthorRequest.toDomain() = AuthorDomain(
    name = name,
    email = Email(email),
    description = Description(description)
)