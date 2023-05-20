package com.github.hugovallada.casadocodigo.domain.schema

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import java.math.BigDecimal
import java.time.LocalDate

interface BookDTO {
    val title: String
    val resume: String
    val description: String
    val price: BigDecimal
    val numberOfPages: Int
    val isbn: String
    val releaseDate: LocalDate
    val categoryName: String
    val authorEmail: String

    fun toDomain(authorDomain: AuthorDomain, categoryDomain: CategoryDomain) = BookDomain(
        title = title,
        resume = resume,
        description = description,
        price = price,
        numberOfPages = numberOfPages,
        isbn = isbn,
        releaseDate = releaseDate,
        category = categoryDomain,
        author = authorDomain
    )
}
