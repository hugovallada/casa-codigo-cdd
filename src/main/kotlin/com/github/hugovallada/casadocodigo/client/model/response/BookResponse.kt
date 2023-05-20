package com.github.hugovallada.casadocodigo.client.model.response

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import java.math.BigDecimal
import java.time.LocalDate

@JvmRecord
data class BookResponse(
    val title: String,
    val resume: String,
    val description: String,
    val price: BigDecimal,
    val numberOfPages: Int,
    val isbn: String,
    val releaseDate: LocalDate,
    val category: CategoryResponse,
    val author: AuthorResponse
) {
    companion object {
        fun of(book: BookDomain) = BookResponse(
            title = book.title,
            resume = book.resume,
            description = book.description,
            price = book.price,
            numberOfPages = book.numberOfPages,
            isbn = book.isbn,
            releaseDate = book.releaseDate,
            category = CategoryResponse(book.category.name),
            author = AuthorResponse.of(book.author)
        )
    }
}
