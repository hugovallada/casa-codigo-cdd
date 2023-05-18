package com.github.hugovallada.casadocodigo.client.model.request

import com.fasterxml.jackson.annotation.JsonCreator
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CategoryRequest @JsonCreator constructor(
    @field:NotBlank
    @field:Size(min = 3, max = 50)
    val name: String
)
