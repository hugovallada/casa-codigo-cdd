package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetEntityByUniqueFieldGateway
import com.github.hugovallada.casadocodigo.shared.validator.isNull

typealias UniqueFieldAndEntityName = Pair<String, String>

class ValidateIfEntityExistsByUniqueFieldUseCase<T>(
    private val getEntityByUniqueFieldGateway: GetEntityByUniqueFieldGateway<T>
) {
    fun execute(data: UniqueFieldAndEntityName) {
        check(getEntityByUniqueFieldGateway.execute(data.first).isNull()) {
            "Já existe um ${data.second} com o valor ${data.first}"
        }
    }
}
