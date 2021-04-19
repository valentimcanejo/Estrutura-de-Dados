/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

public interface InterfacePilha {
public int size();
public boolean isEmpty();
public Object top() throws PilhaVaziaExcecao;
public void push(Object o);
public Object pop() throws PilhaVaziaExcecao;

}