/**
 * 1 - [DESAFIO] Escreva um programa em kotlin para calcular a redução do tempo de vida
 * de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
 * ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.
 */

package desafio

fun main() {
    println("Digite a quantidade de cigarros fumados por dia: ")
    var cigarros = readln().toInt()

    println("Digite a quantidade de anos fumados: ")
    var anos = readln().toInt()

    var total = (cigarros * 10) * (anos * 365)

    println("Um fumante perde $total dias de vida.")
}