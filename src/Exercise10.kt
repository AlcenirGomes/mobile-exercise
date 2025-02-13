/**
 * 10 - Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */

fun main(){
    println("Digite a largura: ")
    var largura = readln().toDouble()

    println("Digite a altura: ")
    var altura = readln().toDouble()
    var total = String.format("%.2f", (largura*altura) /2)

    println("Será necessario ${total} litros de tinta.")
}