package com.github.hugovallada.casadocodigo.domain.entity

import java.math.BigDecimal
import java.time.LocalDate

data class BookDomain(
    val title: String,
    val resume: String,
    val description: String,
    val price: BigDecimal,
    val numberOfPages: Int,
    val isbn: String,
    val releaseDate: LocalDate,
    val category: CategoryDomain,
    val author: AuthorDomain
)
