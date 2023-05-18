package com.github.hugovallada.casadocodigo.infra.gateway.schema

import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import java.time.ZonedDateTime
import java.util.*

@Entity
class Author(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long? = null,
    val internalId: String,
    val name: String,
    val email: String,
    val description: String,
    @CreationTimestamp
    val registryTime: ZonedDateTime? = null
) {
    companion object {
        fun of(author: AuthorDomain) = Author(
            internalId = UUID.randomUUID().toString(), name = author.name,
            email = author.email.value, description = author.description.value
        )
    }
}