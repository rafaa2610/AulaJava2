/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex04;

/**Exercício 04
 * Aula:
 * Disciplina: Linguagem de programação
 * Matéria: Operadores distribuição e Aritméticos
 *@author Rafaela Campos
 */
public class aula04 {
    public static void main(String[] args) {
        int a = 10;
        String b = "10";
        int c = 2;
        
        int resultadoA = a + c;
        int resultadoB = a - c;
        int resultadoC = a * c;
        int resultadoD = a / c;
        int resultadoE = a % c;
        int resultadoF = (int)a / c;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("Soma: " + resultadoA);
        System.out.println("Subtracao: " + resultadoB);
        System.out.println("Multiplicacao: " + resultadoC);
        System.out.println("Divisao: " + resultadoD);
        System.out.println("Resto: " + resultadoE);
        System.out.println("Resultado como Inteiro: " + resultadoF);
        
    }
    
}
