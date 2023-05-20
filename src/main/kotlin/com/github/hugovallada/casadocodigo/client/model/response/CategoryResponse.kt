package com.github.hugovallada.casadocodigo.client.model.response

import com.fasterxml.jackson.annotation.JsonCreator

@JvmRecord
data class CategoryResponse @JsonCreator constructor(val name: String)
