/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaparvorebinaria;

public class Main {
    public static void main(String[] args)
    {
        ArvoreBinaria binaria = new ArvoreBinaria();
       
        
     // inserindo dados na árvore binária
        binaria.inserir(1);
        binaria.inserir(2);
        binaria.inserir(3);
        binaria.inserir(4);
        binaria.inserir(5);       
        binaria.inserir(6);
 
        // mostrando min
        System.out.println(binaria.min());
        // removendo min
        System.out.println(binaria.removeMin());
        // tamanho do heap
        System.out.println(binaria.size());
        // mostrando min com valor alterado
        System.out.println(binaria.min());
        
        
    }
}
