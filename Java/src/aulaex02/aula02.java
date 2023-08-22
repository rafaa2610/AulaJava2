/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaex02;

/**
 * Exercício 02
 * Aula:01/08/2023
 * Disciplina: Linguagem de programação
 * Matéria: Manipulação de string
 * @author Rafaela Campos
 */
public class aula02 {
    public static void main (String[] args) {
      String msg1 = "Ola";
      String msg2 = "Rafaela";
      String mensagem = msg1 + "," + msg2 + "!";
      System.out.println(mensagem);
      
      // Tamanho de uma string
      String texto = "Hello, World!";
      int tamanho = texto.length();
      System.out.println(tamanho);
      
      // Transformação de uma string em letras Maiusculas
      String txt = "Hello, World";
      System.out.println(txt.toUpperCase());
      System.out.println(txt.toLowerCase());   
}
}