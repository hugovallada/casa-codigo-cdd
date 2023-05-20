package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain

fun interface CreateBookGateway {
    fun execute(book: BookDomain)
}
