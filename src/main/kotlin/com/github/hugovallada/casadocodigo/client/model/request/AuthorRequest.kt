package com.github.hugovallada.casadocodigo.client.model.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@JvmRecord
data class AuthorRequest(
    @field:NotBlank
    val name: String,
    @field:NotBlank
    @field:Email
    val email: String,
    @field:NotBlank
    @field:Size(min = 1, max = 400)
    val description: String,
)
