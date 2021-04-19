/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubro;

import java.util.Scanner;

public class Main {
    public static void opcoes() {
        System.out.println("____ INTERFACE PILHA ____");
        System.out.println("1- Adicionar objetos na pilha Preta");
        System.out.println("2- Adicionar objetos na pilha Vermelha");
        System.out.println("3- Remover objeto da pilha Preta");
        System.out.println("4- Remover objeto da pilha Vermelha");
        System.out.println("5- Mostrar último objeto da pilha Preta");
        System.out.println("6- Mostrar último objeto da pilha Vermelha");
        System.out.println("7- Tamanho da pilha Preta");
        System.out.println("8- Tamanho da pilha Vermelha");
        
        System.out.println("0- Sair do programa");
        
    }
    public static void main(String[] args) {
        PilhaArray pp;
        pp = new PilhaArray(1);
        
        Scanner input = new Scanner(System.in);
        int opcao;
    do {
        opcoes();
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
            
            for (int i=0; i<=10; i++) {
                System.out.println(i);
                pp.push_Preta(i);
            }
            case 2:
            
            for (int i=0; i<=10; i++) {
                System.out.println(i);
                pp.push_Vermelha(i);
            }
            
            case 3:
                pp.pop_preta();
            case 4:
                pp.pop_vermelha();
            case 5:
                System.out.println(pp.top_Preta());
            case 6:
                System.out.println(pp.top_Vermelha());
            case 7:
                System.out.println(pp.sizePreta());
            case 8:
                System.out.println(pp.sizeVermelha());
            
        }
    } while (opcao != 0); {
    input.close();
    }
 }
}