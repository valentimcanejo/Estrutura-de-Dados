/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;



class Heap {
    int [] heapArray;
    int capacidade = 10;
    int tamanho;
    public Heap(){        
        heapArray = new int[capacidade];        
        tamanho = 0;
    }   
    public void insert(int data){
        if (tamanho >= capacidade) {
            System.out.println("HEAP CHEIO");
            return;
        }
        heapArray[tamanho] = data;
        tamanho = tamanho + 1;          
    }
    public int min(){
        if(isEmpty())
            return 0;
        else
        return heapArray[0];
    }
    public int removeMin() {
        int min = heapArray[0];       
        heapArray[0] = heapArray[tamanho - 1];
        tamanho = tamanho - 1;    
        return min;
    }   
    public int size(){
        return tamanho;
    }   
    public boolean isEmpty(){
        return false;
   }
}
