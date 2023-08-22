/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex12;

import java.util.Scanner;

/**
 * Exercício 1: Maior ou menor de idade
 * Aula:22/08/2023
 * Disciplina: Linguagem de programação
 * @author Rafaela Campos
 */
public class aula12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int idade;
        
        System.out.println("Qual sua idade:");
        idade= ler.nextInt();
        
        if (idade>= 18){
        System.out.println("Maior de Idade");
    }else{
            System.out.println("Menor de Idade");
            }
    }
    
}
