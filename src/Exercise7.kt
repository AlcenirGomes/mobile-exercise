/**
 * 07 - Crie um programa em Kotlin que leia um número real e mostre na
 * tela o seu dobro e a sua terça parte.
 * Ex:
 * Digite um número: 3.5
 * O dobro de 3.5 é 7.0
 * A terça parte de 3.5 é 1.16666
 */

fun main() {
    println("Digite o primeiro número: ")
    var num1 = readln().toDouble()
    var terca = String.format("%.2f", num1/3)

    println("O dobro é: ${num1*2}")
    println("A terça parte é: $terca")
}
