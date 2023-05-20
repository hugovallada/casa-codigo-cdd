package com.github.hugovallada.casadocodigo.infra.resources.book

import com.github.hugovallada.casadocodigo.client.api.GetAllBooksAPI
import com.github.hugovallada.casadocodigo.client.model.response.BookResponse
import com.github.hugovallada.casadocodigo.domain.usecase.GetAllBooksUseCase
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode

@Path("/books/all")
class GetBooksResource(private val getAllBooksUseCase: GetAllBooksUseCase) : GetAllBooksAPI {
    @GET
    @ResponseStatus(StatusCode.OK)
    override fun execute() = getAllBooksUseCase().map { BookResponse.of(it) }.toSet()
}
