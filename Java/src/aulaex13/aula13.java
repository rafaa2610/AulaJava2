/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex13;

import java.util.Scanner;

/**
 * Execício 2: Impar ou par
 * Aula: 22/08/2023
 * Disciplina: Linguagem de programação
 * @author Rafaela Campos
 */
public class aula13 {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int numero;
      
        System.out.println("Digite um numero inteiro:");
        numero= ler.nextInt();
        
        numero = numero%2;
        
        if(numero != 0){
            System.out.println("O numero e Impar!");
            
        }else{
        System.out.println("O numero e Par!");
        }
        
       }  
    }
    


