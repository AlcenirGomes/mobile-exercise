/**
 * 09 - Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
 * R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
 * cotação atual)
 */

fun main(){
    println("Digite quanto dinheiro tem na carteira: ")
    var real = readln().toDouble()
    var dollar = String.format("%.2f",real * 3.45)

    println("Pode comprar US$$dollar")
}