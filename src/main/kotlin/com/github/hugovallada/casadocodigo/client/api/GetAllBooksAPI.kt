package com.github.hugovallada.casadocodigo.client.api

import com.github.hugovallada.casadocodigo.client.model.response.BookResponse

fun interface GetAllBooksAPI {
    fun execute(): Set<BookResponse>
}
