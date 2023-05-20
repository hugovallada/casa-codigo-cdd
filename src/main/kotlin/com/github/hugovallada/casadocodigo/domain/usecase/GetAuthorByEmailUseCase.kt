package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetAuthorByEmailGateway
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GetAuthorByEmailUseCase(private val getAuthorByEmailGateway: GetAuthorByEmailGateway) {
    operator fun invoke(email: String) = getAuthorByEmailGateway.execute(email) ?: error("O autor não foi encontrado")
}
