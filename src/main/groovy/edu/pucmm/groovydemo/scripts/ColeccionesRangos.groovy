package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

def rango = 1..5;
println "En tipo del dato es: "+rango.class

//iterando el rango.
println "Recorriendo el rango:"
rango.each({
    println "\t El rango es $it";
});

println "";
//La forma de bucle
for(int contador in 1..5) {
    println "El contador en la forma bucle: "+contador;
}

println "";
//metodos propios y atributos.
println "Rango desde: "+rango.from
println "Rango hasta: "+rango.to
println "Contiene valores en 4: "+rango.contains(4)
println "Total de elementos: "+rango.size()
println "El elemento en 3: "+rango.get(3)
println "Otra forma para los mismos: "+rango[3]

println "";
//reversando el rango.
def rango_reversa=rango.reverse();
println "Recorriendo el rango reversa:"
rango_reversa.each({
    println "\t El rango es $it";
});

println "";
println "Poder de los Rangos.";
//poder de los rangos, aplicado a cualquier clase que implemente la interfase Comparable
def hoy = new Date();
def dentroDeSieteDias = hoy + 7
(hoy..dentroDeSieteDias).each { dia ->
    println "El día es: "+dia
}

println "";
('a'..'z').each { letra ->
    print letra
}

println "Otra forma de trabajar con ellos.";
println "Comparando los valores de los rangos";
def sueldo = 1700;
switch(sueldo) {
    case 600..<1200:
        println 'nivel 1'
        break
    case 1200..<1800:
        println 'nivel 2'
        break
    case 1800..<2400:
        println 'nivel 3'
        break
}
