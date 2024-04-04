import com.ariel.estruturadados.base.EstruturaEstatica;
public class Pilha<T> extends EstruturaEstatica<T>{
public Pilha() {
super();
}
public Pilha(int capacidade) {
super();
}
public boolean adiciona(T elemento) {
return super.adiciona(elemento);
}
public void adiciona(int posicao, T elemento) {
super.adiciona(posicao, elemento);
}
}



Página
1
de 4
/*package com.ariel.estruturadados.vetor;
public class Vetor {
// criamos nosso array de elementos
private String[] elementos;
// criamos nosso construtor que passaremos a capacidade de elementos que ele
pode receber
public Vetor(int capacidade) {
this.elementos = new String[capacidade];
}
// criamos agora uma nova classe para adicionar um elemento em nosso vetor
public void adicionaV1(String elemento) {
// para adicionar um elemeto a um vetor, precisamos verificar quais
// elementos estão null, por padrão vetores de string terão valor null
//vamos então percorrer o vetor e verificar se tem posição nula, se
tiver adicionamos nosso elemento
for(int i=0; i<this.elementos.length; i++) {
if(this.elementos[i] == null) {
this.elementos[i] = elemento;
// para frear o loop do for usamos o break, dessa forma assim que ele
encontrar um valor null ele para
break;
}
}
}
}
*/
package com.ariel.estruturadados.vetor;
import java.util.Arrays;
import java.util.Iterator;
public class Vetor {
private String[] elementos;
private int tamanho;
public Vetor(int capacidade) {
this.elementos = new String[capacidade];
this.tamanho = 0;
}
public void adicionaV1(String elemento) {
for(int i=0; i<this.elementos.length; i++) {
if(this.elementos[i] == null) {
this.elementos[i] = elemento;
break;
}
}
}
public void adicionaV2(String elemento) throws Exception {
if(this.tamanho < this.elementos.length) {
this.elementos[this.tamanho] = elemento;
this.tamanho++;
} else {
throw new Exception("Vetor já está cheio, não é possivél
adicionar mais elementos");
}
}
public boolean adiciona(String elemento) {
this.aumentaCapacidade();
if(this.tamanho < this.elementos.length) {
this.elementos[this.tamanho] = elemento;
this.tamanho++;
return true;
} else {
return false;
}
}
public void adiciona(int posicao, String elemento) {
if (!(posicao >= 0 && posicao < tamanho)) {
throw new IllegalArgumentException("Posição invalida");
}
this.aumentaCapacidade();
for (int i = this.tamanho-1; i >= posicao; i--) {
this.elementos[i+1] = this.elementos[i];
}
this.elementos[posicao] = elemento;
this.tamanho++;
}
private void aumentaCapacidade() {
if (this.tamanho == this.elementos.length) {
String[] elementosNovos = new String[this.elementos.length * 2];
for (int i = 0; i < this.elementos.length; i++) {
elementosNovos[i] = this.elementos[i];
}
this.elementos = elementosNovos;
}
}
public void remove(int posicao) {
if (!(posicao >= 0 && posicao < tamanho)) {
throw new IllegalArgumentException("Posição invalida");
}
for (int i = posicao; i < this.tamanho-1; i++) {
this.elementos[i] = this.elementos[i+1];
}
this.tamanho--;
}
public int tamanho() {
return this.tamanho;
}
@Override
public String toString() {
return Arrays.toString(elementos);
}
/*
@Override
public String toString() {
//primeiros instanciamos a classe StringBuilder
StringBuilder s = new StringBuilder();
//ao inves de utilizar o += para concatenar usamos a classe append
s.append("[");
for(int i=0; i< this.tamanho -1; i++) {
s.append(this.elementos[i]);
s.append(", ");
}
if (this.tamanho > 0) {
s.append(this.elementos[this.tamanho -1]);
s.append("]");
}
return s.toString();
}
*/
public String busca (int posicao) {
//criamos uma condicional para negar todas as posições invalidas e
disparamos a exceção
if (!(posicao >= 0 && posicao < tamanho)) {
// no Java usamos a exeption IllegalArgumentException para tipos
de argumentos invalidos
throw new IllegalArgumentException("Posiçaõ invalida");
}
return this.elementos[posicao];
}
public int findIndex (String elemento) {
for (int i=0; i<this.tamanho; i++) {
if(this.elementos[i].equals(elemento)) {
return i;
}
}
return -1;
}
}



package com.ariel.estruturadados.pilha.teste;
import com.ariel.estruturadados.pilha.PilhaFinal;
public class PilhaTeste {
public static void main(String[] args) {
PilhaFinal<Integer> pilha = new PilhaFinal<Integer>();
System.out.println(pilha);
System.out.println(pilha.tamanho());
}
}
