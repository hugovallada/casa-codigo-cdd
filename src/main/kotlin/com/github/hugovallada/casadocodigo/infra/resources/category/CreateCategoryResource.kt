package com.github.hugovallada.casadocodigo.infra.resources.category

import com.github.hugovallada.casadocodigo.client.model.request.CategoryRequest
import com.github.hugovallada.casadocodigo.domain.usecase.CreateCategoryUseCase
import com.github.hugovallada.casadocodigo.infra.translator.toDomain
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import org.jboss.resteasy.reactive.ResponseStatus
import org.jboss.resteasy.reactive.RestResponse.StatusCode

@Path("/categories")
class CreateCategoryResource(private val createCategoryUseCase: CreateCategoryUseCase) {

    @POST
    @ResponseStatus(StatusCode.CREATED)
    fun execute(category: CategoryRequest) {
        createCategoryUseCase(category.toDomain())
    }
}
