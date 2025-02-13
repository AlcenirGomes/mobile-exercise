/**
 * 14 - A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um
 * programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
 * e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.
 */

fun main() {
    println("Digite a quantidade de Km percorridos: ")
    var km = readln().toInt()

    println("Digite a quantidade de dias: ")
    var dias = readln().toInt()

    var total = (dias * 90) + (km * 0.20)

    println("O total a pagar é de: R$%.2f".format(total))