package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

lista = [1, true, "Hola Mundo"];
println "El tipo es: "+lista.class;
assert lista.size()==3;
println "La cantida de elementos en la lista es $lista.size";
println "El elemento en lista[2]="+lista[2];

//anadiendo nuevo elemento.
lista.add("Nuevo elemento, tradicional");
lista << "Forma Groovy";
println "La cantida de elementos en la lista es $lista.size"; //5

//definiendo asignado a posiciones fijas.
lista[8]="las posiciones 5,6,7 tiene valores nulos";
println lista;

def otraLista=[];//vacia.
otraLista << 23
otraLista << 50
otraLista << -1
otraLista << 10
println "Lista sin ordenar: "+otraLista;
otraLista.sort();
println "Lista ordenada: "+otraLista;

//obteniendo los valores maximos.
println "Valor Minimo: "+otraLista.min();
println "Valor Maximo: "+otraLista.max();

