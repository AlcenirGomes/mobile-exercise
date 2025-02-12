/**
 * 04 - Desenvolva um programa em Kotlin que leia dois números inteiros
 * e mostre o somatório entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */

fun main() {
    println("Digite o primeiro valor: ")
    var num1 = readln().toInt()

    println("Digite o segundo valor: ")
    var num2 = readln().toInt()

    var total = sum(num1,num2)

    println("Total: $total")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}