/**
 * 12 - Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
 * seu PREÇO PROMOCIONAL, com 5% de desconto.
 */

fun main() {
    println("Digite o preço do produto: ")
    val preco = readln().toDouble()

    val desconto = 0.05
    val precoPromocional = preco * (1 - desconto)

    println("O preço promocional é: R$%.2f".format(precoPromocional))
}