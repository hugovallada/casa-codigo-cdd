package com.github.hugovallada.casadocodigo.domain.entity

import com.github.hugovallada.casadocodigo.domain.entity.value.Description
import com.github.hugovallada.casadocodigo.domain.entity.value.Email
import java.time.LocalDateTime

data class AuthorDomain(
    val name: String,
    val email: Email,
    val description: Description,
    val registryTime: LocalDateTime = LocalDateTime.now()
)