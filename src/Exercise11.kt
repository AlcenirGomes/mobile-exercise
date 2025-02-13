/**
 * 11 - Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
 * equação do segundo grau e mostre o valor de Delta. (formula Δ = b2 – 4ac)
 */

fun main() {
    println("Digite o valor de A: ")
    var a = readln().toInt()

    println("Digite o valor de B: ")
    var b = readln().toInt()

    println("Digite o valor de C: ")
    var c = readln().toInt()

    var delta = b * b - 4 * a * c

    println("Delta: $delta")
}