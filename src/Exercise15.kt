/**
 * 15 - Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
 * hora trabalhada.
 */

fun main() {
    println("Digite o número de dias trabalhados no mês: ")
    var dias = readln().toDouble()

    var salario = 8 * 25

    var salarioTotal = dias * salario

    println("O salário total é: R$%.2f".format(salarioTotal))
}