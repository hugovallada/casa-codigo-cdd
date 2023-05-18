package com.github.hugovallada.casadocodigo.infra.resources.author

import com.github.hugovallada.casadocodigo.client.api.CreateAuthorAPI
import com.github.hugovallada.casadocodigo.client.model.request.AuthorRequest
import com.github.hugovallada.casadocodigo.client.model.response.AuthorResponse
import com.github.hugovallada.casadocodigo.domain.usecase.CreateAuthorUseCase
import com.github.hugovallada.casadocodigo.infra.translator.toDomain
import jakarta.validation.Valid
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode

@Path("/authors")
class CreateAuthorResource(private val createAuthorUseCase: CreateAuthorUseCase) : CreateAuthorAPI {

    @POST
    @ResponseStatus(StatusCode.CREATED)
    override fun execute(@Valid authorRequest: AuthorRequest): AuthorResponse {
        val persistedAuthor = createAuthorUseCase(authorRequest.toDomain())
        return AuthorResponse.of(persistedAuthor)
    }
}