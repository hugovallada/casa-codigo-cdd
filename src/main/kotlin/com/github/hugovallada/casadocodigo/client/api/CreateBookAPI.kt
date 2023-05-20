package com.github.hugovallada.casadocodigo.client.api

import com.github.hugovallada.casadocodigo.client.model.request.BookRequest
import jakarta.validation.Valid

fun interface CreateBookAPI {
    fun execute(@Valid bookRequest: BookRequest)
}
