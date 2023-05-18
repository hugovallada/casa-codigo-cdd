package com.github.hugovallada.casadocodigo.infra.translator

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.entity.value.Description
import com.github.hugovallada.casadocodigo.domain.entity.value.Email
import com.github.hugovallada.casadocodigo.infra.gateway.schema.Author

fun Author.toAuthorDomain() = AuthorDomain(
    name = name, email = Email(email), description = Description(description),
    registryTime = registryTime ?: error("Creation timestamp cant be null")
)