/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

public class Main {
    public static void main(String[] args)
    {
        ArvoreBinaria binaria = new ArvoreBinaria();
       
        
     // inserindo dados na árvore binária
        binaria.inserir(10);
        binaria.inserir(5);
        binaria.inserir(15);
        binaria.inserir(11);
        binaria.inserir(25);       
        binaria.inserir(4);
 
     // Ordenando árvore
        System.out.println("\nÁrvore Binária:");
        binaria.ordenar();
     // Removendo elemento
        System.out.println("\nretirando elemento 4");
        binaria.remover(4);
        System.out.println("\nÁrvore Binária:");
        binaria.ordenar();      
        System.out.println("\nRetirando elemento 25");
        binaria.remover(25);     
        System.out.println("\nÁrvore Binária:");
        binaria.ordenar();
        
    }
}

