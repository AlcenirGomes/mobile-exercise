/**
 * 07 - Faça um programa em Kotlin que leia um número inteiro e mostre o seu
 * antecessor e seu sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 */

fun main(){
    println("Digite um número: ")
    var x = readln().toInt()

    println("Seu antecessor é ${x-1}, e seu sucessor é ${x+1}. ")

}

