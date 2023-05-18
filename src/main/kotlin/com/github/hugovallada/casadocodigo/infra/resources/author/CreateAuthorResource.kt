package com.github.hugovallada.casadocodigo.infra.resources.author

import com.github.hugovallada.casadocodigo.client.api.CreateAuthorAPI
import com.github.hugovallada.casadocodigo.client.model.request.AuthorRequest
import com.github.hugovallada.casadocodigo.client.model.response.AuthorResponse
import com.github.hugovallada.casadocodigo.domain.entity.AuthorDomain
import com.github.hugovallada.casadocodigo.domain.entity.value.Description
import com.github.hugovallada.casadocodigo.domain.entity.value.Email
import jakarta.validation.Valid
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode

@Path("/authors")
class CreateAuthorResource : CreateAuthorAPI {

    @POST
    @ResponseStatus(StatusCode.CREATED)
    override fun execute(@Valid authorRequest: AuthorRequest): AuthorResponse {
        val author = AuthorDomain(
            name = authorRequest.name,
            email = Email(authorRequest.email),
            description = Description(authorRequest.description)
        )
        return AuthorResponse.of(author)
    }
}