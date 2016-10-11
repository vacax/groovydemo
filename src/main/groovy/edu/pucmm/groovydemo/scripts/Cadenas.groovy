package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

def cadena1 = "Esto es válido en Java y Groovy"
def cadena2 = 'Esto es válido solo en Groovy'

println cadena1.class
println cadena2.class

//No es necesario escapar los caracteres.
def cadena3 = "Hola 'Usuario'"
def cadena4 = 'Hola "Usuario"'

//Uso de Gstring
def matricula = 20011136
def mensaje = "La fecha es ${new Date()} > Matricula: ${matricula} - Carlos Camacho";
println mensaje
println mensaje.class;

//Lo heredocs
def multilinea = """
Primera linea
Segunda linea
Tercera linea con "comillas dobles" y 'comillas simples'
"""
println multilinea
println multilinea.class;

multilinea = """
Veamos el cambio en esta ocasion.
${matricula}
"""
println multilinea
println multilinea.class;