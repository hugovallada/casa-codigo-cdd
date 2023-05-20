package com.github.hugovallada.casadocodigo.infra.gateway.repository

import com.github.hugovallada.casadocodigo.infra.gateway.schema.Book
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class BookRepository : PanacheRepository<Book> {
    fun findByTitle(title: String) = find("title = ?1", title).firstResult()
}
