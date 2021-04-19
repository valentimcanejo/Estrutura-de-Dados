/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

class ArvoreBinaria {

    public class No {

        int elemento;
        No left, right;

        public No(int x) {
            elemento = x;
            left = right = null;

        }
    }
    No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int item) {
        raiz = inserir(raiz, item);

    }

    No inserir(No raiz, int item) {
        if (raiz == null) {
            raiz = new No(item);
            return raiz;
        }
        if (item < raiz.elemento) {
            raiz.left = inserir(raiz.left, item);
        } else if (item > raiz.elemento) {
            raiz.right = inserir(raiz.right, item);
        }

        return raiz;
    }

    public void remover(int elemento) {
        raiz = remover(raiz, elemento);
    }

    No remover(No raiz, int elemento) {

        if (elemento < raiz.elemento) {
            raiz.left = remover(raiz.left, elemento);
        } else if (elemento > raiz.elemento) {
            raiz.right = remover(raiz.right, elemento);
        } else {

            if (raiz.left == null) {
                return raiz.right;
            } else if (raiz.right == null) {
                return raiz.left;
            }
            raiz.right = remover(raiz.right, raiz.elemento);

        }

        return raiz;
    }

    public void ordenar() {
        ordenar(raiz);
    }

    public void ordenar(No raiz) {
        if (raiz != null) {
            ordenar(raiz.left);
            System.out.print(raiz.elemento + "\n");
            ordenar(raiz.right);
        }
    }

}
