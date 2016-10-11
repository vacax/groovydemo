package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

int entero=1;
//definicion dinamica entero.
def dinamico=1;
println "El tipo de datos de la variable dinamico es: "+dinamico.class
dinamico=12.45;
println "El tipo de datos de la variable dinamico es: "+dinamico.class
dinamico=true;
println "El tipo de datos de la variable dinamico es: "+dinamico.class
dinamico=new Date();
println "El tipo de datos de la variable dinamico es: "+dinamico.class
//asignacion no valida.
//entero="12.45";
