package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

def capitales = ['Republica_Dominicana':'Santo Domingo', 'Haiti':'Puerto Principe'];
def mapa=[:]; //vacio.
println "El tipo de datos es: "+capitales.getClass();

//obteniendo valores.
println "La capital de Republica Dominicana: "+capitales.Republica_Dominicana
println "La capital de Haiti: "+capitales['Haiti']; //capitales.get("key")

//anadiendo nuevos elementos.
capitales.put("Argentina", "Buenos Aires"); //forma tradicional.
capitales.Venezuela="Caracas";

println "El mapa: "+capitales;

//iterando.
capitales.each({
    println "La capitales[$it.key] = $it.value";
});
