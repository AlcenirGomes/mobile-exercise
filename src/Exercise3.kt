/**
 * 03- Crie um programa que leia o nome e o salário de um
 * funcionário, mostrando no final uma mensagem.
 * Ex:
 * Nome do Funcionário: Alcenir Costa Salário: 2581,80
 * O funcionário Alcenir Costa tem um salário de 2581,80 em junho.
 */

fun main(){
    println("Digite seu nome: ")
    var nome = readLine()

    println("Digite seu salário: ")
    var salario = readLine()!!.toDouble()
    var salformatado = String.format("%.2f", salario).toString()

    println("Nome do Funcionário: \n$nome \nSalário: \n$salformatado")

}