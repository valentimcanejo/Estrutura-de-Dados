/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.Iterator;





public class Main {
  public static void main (String[] args) {
   // Console.WriteLine ("Hello World");
    ArvoreSimples simples;
    simples = new ArvoreSimples(1);
    

    simples.addChild(simples.root(),2);
    simples.addChild(simples.root(),3);
    simples.addChild(simples.root(),4);
    simples.addChild(simples.root(),5);
    Iterator Nos = simples.Nos();
    
    Iterator Filhos=simples.elements();
    
    simples.children(simples.root());
    simples.swapElements(simples.root(), simples.root());
  
    
    Filhos = simples.elements();
    
    System.out.println(simples.root().element());
    System.out.println(simples.size()); 
   
    
    
    
  }
}