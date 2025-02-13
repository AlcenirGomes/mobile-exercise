/**
 * 13 - Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
 * seu novo salário, com 15% de aumento.
 */

fun main() {
    println("Digite seu salário: ")
    var salario = readln().toDouble()
    var aumento = salario * 0.15
    var salformatado = String.format("%.2f", salario + aumento).toString()

    println("Seu salário com aumento de 15% é: $salformatado")
}