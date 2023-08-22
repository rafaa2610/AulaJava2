/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex10;

import java.util.Scanner;

/**E
 *
 * @author 14310207618
 */
public class aula10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        int escolha;
        
        do{
            System.out.println("MENU");
            System.out.println("1. Opcao 1");
            System.out.println("2. Opcao 2");
            System.out.println("3. Opcao 3");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opcao:");
            escolha = scanner.nextInt();
            
switch (escolha) {
    case 1:
        System.out.println("Voce escolheu a opcao 1");
        break;
        
    case 2:
        System.out.println("Voce escolheu a opcao 2");
        break;
        
    case 3:
        System.out.println("Voce escolheu a opcao 3");
        break;
        
    case 0:
        System.out.println("Saindo do programa.");
        break;
        
    default:
        System.out.println("Opcao Invalida");
        break;
}       
        System.out.println();
        // Linha em branco para separar as iterações
} while (escolha != 0);
        }
}
