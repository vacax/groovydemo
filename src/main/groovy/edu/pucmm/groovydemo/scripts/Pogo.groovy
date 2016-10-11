package edu.pucmm.groovydemo.scripts

/**
 * Created by vacax on 10/10/16.
 */

class Estudiante{

    String nombre;
    int matricula;
    def dinamico;

    Estudiante(){

    }

    Estudiante(String nombre, int matricula, def dinamico="Por defecto"){
        this.nombre=nombre;
        this.matricula=matricula;
        this.dinamico=dinamico;
    }

    String toString(){
        return " Estudiante: ${matricula} - ${nombre}";
    }
}

//Instanciando.
Estudiante estudiante=new Estudiante();
//estan creado de manera automatico los operadores set y get y pueden ser
//visto como un mapa.
estudiante.matricula=20011136;
estudiante.nombre="Carlos Camacho";
println estudiante;

//de forma implicita tenemos creado el contructor para recibir un mapa.
def estudiante2=new Estudiante(nombre: "Mario Perez", matricula: 20110101);
println estudiante2;

def estudiante3=new Estudiante("Otro Estudiante", 123332);
println estudiante3;
println "El valor de dinamico es: "+estudiante3.dinamico;
