/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author valen
 */
public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();
        
        // inserindo elementos
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        
        // mostrando min
        System.out.println(heap.min());
        // removendo min
        System.out.println(heap.removeMin());
        // tamanho do heap
        System.out.println(heap.size());
        // mostrando min com valor alterado
        System.out.println(heap.min());
        
    }
    
}
