package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

println "Contador de palabras en Groovy"
filename = "indicar la ruta...";
chars=0; lines=0; words=0;
new File(filename).eachLine {
    chars += it.length() + 1
    words += it.tokenize().size();
    lines++;
}
//imprimiendo.
println "\t Lineas: ${lines} \t Palabras: ${words} \t Caracteres: ${chars} \t Archivo: ${filename}"

