package com.github.hugovallada.casadocodigo.domain.entity.value

@JvmInline
value class Email(val value: String) {
    init {
        require(value.matches("""^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$""".toRegex()))
    }
}