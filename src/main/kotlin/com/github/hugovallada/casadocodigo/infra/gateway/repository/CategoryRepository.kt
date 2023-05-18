package com.github.hugovallada.casadocodigo.infra.gateway.repository

import com.github.hugovallada.casadocodigo.infra.gateway.schema.Category
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CategoryRepository : PanacheRepository<Category> {
    fun findByName(name: String) = find("name = ?1", name).firstResult()
}
