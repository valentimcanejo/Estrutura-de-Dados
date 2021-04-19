/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.Iterator;
import java.util.ArrayList;
public class ArvoreSimples 
{
	//Atributos da árvore
	No raiz;
	int tamanho;
        ArrayList<Object> elementos = new ArrayList();
	//Construtor
	public ArvoreSimples(Object o)
	{
		raiz = new No(null, o);
		tamanho = 1;
	}
	/** Retorna a raiz da árvore */
	public No root()
	{
		return raiz;
	}
	/** Retorna o No pai de um No */
	public No parent(No v)
	{
		return (v.parent());
	}

	/** retorna os filhos de um No */
	public Iterator children(No v)
	{
		return v.children();
	}
	/** Testa se um No é interno */
	public boolean isInternal(No v)
	{
		return (v.childrenNumber() > 0);
	}
	/** Testa se um No é externo*/
	public boolean isExternal(No v)
	{
		return (v.childrenNumber() == 0);
	}
	/** Testa se um No é a raiz */
	public boolean isRoot(No v)
	{
		return v == raiz;
	}
	/** Adiciona um filho a um No */
	public void addChild(No v, Object o)
	{
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	/** Remove um No
	 *  Só pode remover Nos externos e que tenham um pai (não seja raiz)
	*/
	public Object remove(No v) throws InvalidNoException
	{
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new InvalidNoException("Erro!");
		Object o = v.element();
		tamanho--;
		return o;
	}
        
	/** Troca dois elementos de posição */
	public void swapElements(No v, No w)
	{
            Object elemento1 = v.element();
            Object elemento2 = w.element();
            
            elemento1 = w.element();
            elemento2 = v.element();
            
		
	}
	/** Retorna a profundidade de um No */
	public int depth(No v)
	{
		int profundidade = profundidade(v);
		return profundidade;
	}
	private int profundidade(No v)
	{
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}
	/** Retorna a altura da árvore */
	public int height()
	{
		// Método que serve de exercício
		int altura = altura(raiz);
		return altura;
	}
        private int altura(No v) {
            if (isExternal(v)) {
                return 0;
            }
            else {
                int h = 0;
                Iterator<No> it = v.children();
                while (it.hasNext()) {
                    No no = (No) it.next();
                    h = Math.max(h, altura(v));
                }
                return 1 + h;
            }
        }
        
	/** Retorna um iterator com os elementos armazenados na árvore */
	public Iterator elements()
	{
		return null;
	}
        
	/** Retorna um iterator com as posições (Nos) da árvore */
	public Iterator Nos()
	{
		// Método que serve de exercício
		return null;
	}
	/** Retorna o número de Nos da árvore
	 */
	public int size()
	{
	 // Método que serve de exercício
		return tamanho;
	}
	/** Retorna se a ávore está vazia. Sempre vai ser falso, pois não permitimos remover a raiz
	 */
	public boolean isEmpty()
	{
		return false;
	}
	public Object replace(No v, Object o) {
            No no;
            Object obj;
            no = v;
            obj = no.element();
            no.setElement(o);
            return obj;
        }

	
}
