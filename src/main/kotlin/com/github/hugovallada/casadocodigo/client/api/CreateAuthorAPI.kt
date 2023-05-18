package com.github.hugovallada.casadocodigo.client.api

import com.github.hugovallada.casadocodigo.client.model.request.AuthorRequest
import com.github.hugovallada.casadocodigo.client.model.response.AuthorResponse
import jakarta.validation.Valid

interface CreateAuthorAPI {
    fun execute(@Valid authorRequest: AuthorRequest): AuthorResponse
}