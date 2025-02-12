/**
 * 02 - Faça um programa que leia o nome de uma
 * pessoa e mostre uma mensagem de boas-vindas para ela:
 * Ex:
 * Qual é o seu nome? Alcenir Gomes.
 * Olá Alcenir Gomes, é um prazer te conhecer!
 */

fun main(){
    println("Digite seu nome: ")
    val nome = readLine()
    println("Olá ${nome}, é um prazer e conhecer. ")
}