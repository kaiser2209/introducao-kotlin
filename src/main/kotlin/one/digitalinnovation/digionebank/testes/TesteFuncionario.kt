package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val funcionario = Analista(nome = "Charles", cpf = "01243852658", salario = 4000.0)
    imprimeRelatorio(funcionario)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())