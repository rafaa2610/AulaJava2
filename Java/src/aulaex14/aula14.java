/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex14;

import java.util.Scanner;

/**
 * Exercício 3: Menu de valores no cardápio
 * Aula:22/08/2023
 * Disciplina: Linguagem de Programação
 *@author Rafaela Campos
 */
public class aula14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int escolha;
        
        
       do{
           System.out.println("CARDAPIO");
           System.out.println("1 - Hamburguer");
           System.out.println("2 - Cheeseburger");
           System.out.println("3 - Fritas");
           System.out.println("4 - Refrigerante");
           System.out.println("5 - Milkshake");
           System.out.println("0 - Sair");
           System.out.println("Escolha seu Lanche");
           escolha = ler.nextInt();
           switch (escolha){
               
               case 1:
                   System.out.println("1 - Hamburguer:...........30,00");
                   break;
               case 2:
                   System.out.println("2 - Cheeseburguer:........35,00");
                   break;
               case 3:
                   System.out.println("3 - Fritas:...............20,50");
                   break;
               case 4:
                   System.out.println("4 - Refrigerante:.........10,00");
                   break;
               case 5:
                   System.out.println("5 - Milkshake:............30,00");
                   break;
               default:
                   System.out.println("Opcao Invalida");
                   break;
}  
                   System.out.println("----------------------------");
                   
       } while (escolha != 0);
      }
   }
        
    
    

