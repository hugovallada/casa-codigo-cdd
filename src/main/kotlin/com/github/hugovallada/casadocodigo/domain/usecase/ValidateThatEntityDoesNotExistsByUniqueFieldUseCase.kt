package com.github.hugovallada.casadocodigo.domain.usecase

import com.github.hugovallada.casadocodigo.domain.gateway.out.GetEntityByUniqueFieldGateway
import com.github.hugovallada.casadocodigo.shared.validator.isNull

typealias PairOfUniqueFieldAndEntityName = Pair<String, String>

class ValidateThatEntityDoesNotExistsByUniqueFieldUseCase<T>(
    private val getEntityByUniqueFieldGateway: GetEntityByUniqueFieldGateway<T>
) {
    fun execute(data: PairOfUniqueFieldAndEntityName) {
        check(getEntityByUniqueFieldGateway.execute(data.first).isNull()) {
            "Já existe um ${data.second} com o valor ${data.first}"
        }
    }
}
