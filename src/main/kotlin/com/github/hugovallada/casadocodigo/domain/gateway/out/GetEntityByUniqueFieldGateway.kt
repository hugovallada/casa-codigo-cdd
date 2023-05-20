package com.github.hugovallada.casadocodigo.domain.gateway.out

fun interface GetEntityByUniqueFieldGateway<T> {
    fun execute(field: String): T?
}
