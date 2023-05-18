package com.github.hugovallada.casadocodigo.infra.gateway.schema

import com.github.hugovallada.casadocodigo.domain.entity.CategoryDomain
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
class Category(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long? = null,
    val internalId: String = UUID.randomUUID().toString(),
    val name: String
) {
    companion object {
        fun of(category: CategoryDomain) = Category(name = category.name)
    }
}
