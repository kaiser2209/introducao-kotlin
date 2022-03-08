package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFunconario

fun main() {
    val gerente = Gerente("Charles", "01243852658", salario = 8000.0)
    ImprimeRelatorioFunconario.imprime(gerente)
}