package com.github.hugovallada.casadocodigo.domain.entity.value

import com.github.hugovallada.casadocodigo.shared.rules.SizeRule.DESCRIPTION_SIZE

@JvmInline
value class Description(val value: String) {
    init {
        require(value.length <= DESCRIPTION_SIZE)
    }
}