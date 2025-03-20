package org.example;

import org.example.Datos.Persona;
import org.example.Datos.arbol_Persona;
import org.example.arbolbinario.arbol;
import org.example.arbolcadena.arbolcadena;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        arbol aarbol = new arbol();
        aarbol.insertar(6);
        aarbol.insertar(10);
        aarbol.insertar(4);
        aarbol.insertar(8);
        aarbol.insertar(5);
        aarbol.insertar(3);
        aarbol.insertar(15);
        // aarbol.insertar(8);
        //aarbol.insertar(11);

         */

        /*
        arbolcadena ar = new arbolcadena();
        ar.insertar("Farore");
        ar.insertar("Impa");
        ar.insertar("Navi");
        ar.insertar("Farore");

         */

        arbol_Persona perso = new arbol_Persona();

        Persona p1 = new Persona();
        p1.setNumerotelefono(100);  // Nodo padre
        p1.setNombre("Juan");
        p1.setDireccion("Calle A");

        Persona p2 = new Persona();
        p2.setNumerotelefono(150);  // Irá a la derecha del padre
        p2.setNombre("María");
        p2.setDireccion("Calle B");

        Persona p3 = new Persona();
        p3.setNumerotelefono(50);   // Irá a la izquierda del padre
        p3.setNombre("Pedro");
        p3.setDireccion("Calle C");

        Persona p4 = new Persona();
        p4.setNumerotelefono(175);  // Irá a la derecha de p2
        p4.setNombre("Ana");
        p4.setDireccion("Calle D");

        Persona p5 = new Persona();
        p5.setNumerotelefono(25);   // Irá a la izquierda de p3
        p5.setNombre("Luis");
        p5.setDireccion("Calle E");

        // Insertando en el orden deseado
        perso.insertar(p1);
        perso.insertar(p2);
        perso.insertar(p3);
        perso.insertar(p4);
        perso.insertar(p5);


        System.out.println("fin!");
    }
}