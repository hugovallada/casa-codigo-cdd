package com.github.hugovallada.casadocodigo.infra.translator

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import com.github.hugovallada.casadocodigo.infra.gateway.schema.Book

fun Book.toDomain() = BookDomain(
    title = title,
    resume = resume,
    description = description,
    price = price,
    numberOfPages = numberOfPages,
    isbn = isbn,
    releaseDate = releaseDate,
    category = category.toDomain(),
    author = author.toAuthorDomain()
)
