package com.github.hugovallada.casadocodigo.infra.gateway.repository

import com.github.hugovallada.casadocodigo.infra.gateway.schema.Author
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class AuthorRepository : PanacheRepository<Author> {
    fun findByEmail(email: String) = find("email = ?1", email).firstResult()
}