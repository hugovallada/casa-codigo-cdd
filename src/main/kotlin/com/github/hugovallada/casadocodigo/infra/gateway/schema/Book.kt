package com.github.hugovallada.casadocodigo.infra.gateway.schema

import com.github.hugovallada.casadocodigo.domain.entity.BookDomain
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    val resume: String,
    val description: String,
    val price: BigDecimal,
    val numberOfPages: Int,
    val isbn: String,
    val releaseDate: LocalDate,
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val category: Category,
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val author: Author
) {
    companion object {
        fun of(book: BookDomain) = Book(
            title = book.title,
            resume = book.resume,
            description = book.description,
            price = book.price,
            numberOfPages = book.numberOfPages,
            isbn = book.isbn,
            releaseDate = book.releaseDate,
            category = Category.of(book.category),
            author = Author.of(book.author)
        )
    }
}
