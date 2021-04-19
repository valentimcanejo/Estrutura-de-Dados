/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;


import java.util.Scanner;
public class Main {
public static void opcoes() {
System.out.println("____ INTERFACE PILHA ____");
System.out.println("1- Adicionar objetos na pilha");
System.out.println("2- Remover objeto da pilha");
System.out.println("3- Mostrar último objeto da pilha");
System.out.println("4- Tamanho da pilha");
System.out.println("0- Sair do programa");

}
public static void main(String[] args) {
Pilha pp;
pp = new Pilha(1,0);

Scanner input = new Scanner(System.in);
int opcao;
do {
opcoes();
opcao = input.nextInt();
switch (opcao) {

case 1:
long tinicio = System.currentTimeMillis();
for (int i=0; i<=100; i++) {
System.out.println(i);
pp.push(i);
}
long tfinal = System.currentTimeMillis();
long tempo = tfinal - tinicio;
System.out.println("Tempo decorrido: "+tempo);
case 2:
pp.pop();
case 3:
System.out.println(pp.top());
case 4:
System.out.println(pp.size());
}
} while (opcao != 0); {
input.close();
}
}
}