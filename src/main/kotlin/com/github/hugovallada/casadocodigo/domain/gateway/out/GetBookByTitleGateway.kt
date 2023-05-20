package com.github.hugovallada.casadocodigo.domain.gateway.out

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain

fun interface GetBookByTitleGateway {
    fun execute(title: String): BookDomain?
}
