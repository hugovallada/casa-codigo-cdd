package com.github.hugovallada.casadocodigo.client.model.response

data class AuthorResponse(
    val name: String,
    val email: String,
    val description: String,
    val registryTime: String
)