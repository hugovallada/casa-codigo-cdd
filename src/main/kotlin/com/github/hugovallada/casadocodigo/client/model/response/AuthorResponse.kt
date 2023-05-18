package com.github.hugovallada.casadocodigo.client.model.response

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import java.time.format.DateTimeFormatter

data class AuthorResponse(
    val name: String,
    val email: String,
    val description: String,
    val registryTime: String
) {
    companion object {
        fun of(author: AuthorDomain) = AuthorResponse(
            name = author.name,
            email = author.email.value,
            description = author.description.value,
            registryTime = author.registryTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        )
    }
}