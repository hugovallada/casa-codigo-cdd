package com.github.hugovallada.casadocodigo.infra.resources.book

import com.github.hugovallada.casadocodigo.client.api.CreateBookAPI
import com.github.hugovallada.casadocodigo.client.model.request.BookRequest
import com.github.hugovallada.casadocodigo.domain.usecase.CreateBookUseCase
import jakarta.validation.Valid
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode

@Path("/books/create")
class CreateBookResource(private val createBookUseCase: CreateBookUseCase) : CreateBookAPI {
    @POST
    @ResponseStatus(StatusCode.CREATED)
    override fun execute(@Valid bookRequest: BookRequest) {
        createBookUseCase(bookRequest)
    }
}

