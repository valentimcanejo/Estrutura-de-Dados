/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

public class PilhaVaziaExcecao extends RuntimeException {
    public PilhaVaziaExcecao(String err){
    super(err);
    }
}