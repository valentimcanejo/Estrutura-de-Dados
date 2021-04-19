/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pilha;

import java.util.LinkedList;

public class Pilha implements InterfacePilha {
    Queue<T> q1 = new LinkedList<T>();
    Queue<T> q2 = new LinkedList<T>();
private int capacidade;
private Object[] a;
private int t;
private int FC;

public Pilha(int capacidade, int crescimento) {
this.capacidade=capacidade;
t=-1;
FC=crescimento;
if (crescimento<=0)
FC=0;
a=new Object[capacidade];
}
public void push(Object o) {

if(t>=capacidade-1){
if(FC==0)
capacidade*=2;
else
capacidade+=FC;
Object b[]=new Object[capacidade];
for(int f=0;f<a.length;f++)
b[f]=a[f];
a=b;
}
a[++t]=o;
}
public Object pop() throws PilhaVaziaExcecao {
if(isEmpty())
throw new PilhaVaziaExcecao("A pilha está vazia");
Object r=a[t--];
return r;
}
public Object top() throws PilhaVaziaExcecao {
if(isEmpty())
throw new PilhaVaziaExcecao("A pilha está vazia");
return this.a[t];
}
public boolean isEmpty() {
return t == -1;
}
public int size() {
return t+1;
}

}