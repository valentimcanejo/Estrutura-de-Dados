/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaparvorebinaria;

class ArvoreBinaria {
   int capacidade = 10;
        int [] heapArray;
        int tamanho;
    class No {
        int elemento;
        
        No left, right;
        
 
        public No(int x)
        {
            heapArray = new int[capacidade];        
              
            elemento = x;    
        }
    } 
    No raiz;
 
    ArvoreBinaria() { 
        raiz = null; 
    }  
    
    public void inserir(int item) { 
        if (tamanho >= capacidade) {
            System.out.println("HEAP CHEIO");
            return;
        }
        heapArray[tamanho] = item;
        tamanho = tamanho + 1;    
              
    }
 
    public No inserir(No raiz, int item)
    {  
        if (raiz == null) {
            raiz = new No(item);
            return raiz;
        }        
        if (item > raiz.elemento)
            raiz.left = inserir(raiz.left, item);
        else if (item > raiz.elemento)
            raiz.right = inserir(raiz.right, item);
 
        
        return raiz;
    }
  
    public int removeMin() {
        int min = heapArray[0];       
        heapArray[0] = heapArray[tamanho - 1];
        tamanho = tamanho - 1;    
        return min;
    } 
    
    public int min(){
        if(isEmpty())
            return 0;
        else
        return heapArray[0];
    }
    public boolean isEmpty(){
        return false;
   }
    public int size(){
        return tamanho;
    }   
}
