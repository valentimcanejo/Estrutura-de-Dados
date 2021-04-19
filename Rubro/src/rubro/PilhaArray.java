/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubro;

/**
 *
 * @author valen
 */
public class PilhaArray {

    private Object vetor[];
    private int top_preta;
    private int top_vermelha;
    private int capacidade;
    private int size;
    
    public PilhaArray(int capacidade_pilha){
        vetor = new Object[capacidade_pilha];
        top_preta = -1;
        top_vermelha = capacidade_pilha;
        capacidade = 0;
        size = 0;
    }
    
    public int sizePreta(){
        return top_preta + 1;
    }
    public boolean isEmptyPreta(){
        return top_preta == -1;
    }
    public int sizeVermelha(){
        return vetor.length - top_vermelha;
    }
    public boolean isEmptyVermelha(){
        return top_vermelha == vetor.length;
    }
    public Object top_Preta(){
        if(isEmptyPreta()) {
            throw new RuntimeException("pilha vazia");
            
        }
        return vetor[top_preta];
    }
    public Object top_Vermelha(){
        if(isEmptyVermelha()) {
            throw new RuntimeException("pilha vazia");
            
        }
        return vetor[top_vermelha];
    }
    
    public void push_Preta(int objeto_preto){
        if (size == vetor.length){
            int tamanho_pilha = vetor.length;
            
            Object novo_vetor[] = new Object[tamanho_pilha * 2];
            
            for(int i=0; i<=top_preta; i++){
                novo_vetor[i] = vetor[i];
            }
            int new_size = novo_vetor.length;
            for(int i=0; i < capacidade; i++){
                novo_vetor[--new_size] = vetor[--tamanho_pilha];
            }
            vetor = novo_vetor;
        }
        size++;
        vetor[++top_preta] = objeto_preto;
    }
    public void push_Vermelha(int objeto_vermelho){
        if (size == vetor.length){
            int tamanho_pilha = vetor.length;
            
            Object novo_vetor[] = new Object[tamanho_pilha * 2];
            
            for(int i=0; i<=top_preta; i++){
                novo_vetor[i] = vetor[i];
            }
            int new_size = novo_vetor.length;
            for(int i=0; i < capacidade; i++){
                novo_vetor[--new_size] = vetor[--tamanho_pilha];
            }
            top_vermelha = novo_vetor.length - (vetor.length - top_vermelha);
            vetor = novo_vetor;
        }
        capacidade++;
        size++;
        vetor[++top_preta] = objeto_vermelho;
    }
    public Object pop_preta(){
        if(isEmptyPreta()) {
            throw new RuntimeException("pilha vazia");           
        }
        Object ultimo_elemento = vetor[top_preta];
        vetor[top_preta] = null;
        top_preta--;
        size--;
        return ultimo_elemento;
    }
    public Object pop_vermelha(){
        if(isEmptyVermelha()) {
            throw new RuntimeException("pilha vazia");           
        }
        Object ultimo_elemento = vetor[top_vermelha];
        vetor[top_vermelha] = null;
        top_vermelha--;
        size--;
        return ultimo_elemento;
    }
}
