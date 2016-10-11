package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

def cuadrado = {
    it*it; //La variable it es carga por defecto.
}

println "Ejecutando el cuadrado de 9 = "+cuadrado(9);

def lista=[1,2,3,4].collect(cuadrado); //Es pasada al closure y retorna una nueva lista.
println "La lista nueva es: "+lista;

//indicando los parametros.
def closure1={nombre ->
    println "El nombre es: ${nombre}"
}

closure1("Carlos");

//indicando mas de un parametro.
def closure2={nombre, apellido ->
    println "El nombre es: ${nombre} ${apellido}"
}

closure2 "Carlos", "Camacho"

//ClosureEjemplo como parametro.
def repetirClosure(int cantidadRepeticiones, closure){
    for(int i=0; i< cantidadRepeticiones;i++){
        closure.call(i);
    }
}

//realizando la llamada.
def closure3={ it ->
    println "Ejecutando desde el closure  #${it}";
}

repetirClosure(5, closure3);

//otra forma de hacerlo.
repetirClosure(3, { it ->
    def otro={
        it=it+1;
    }

    println "Desde la otra forma ${otro(it)}";

});
