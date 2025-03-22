package org.example.Datos;

public class nodo_Persona {

    private Persona persona;
    private nodo_Persona izquierdo;
    private nodo_Persona derecho;

    public nodo_Persona(Persona persona){
        this.persona = persona;
        this.izquierdo = null;
        this.derecho = null;
    }

    public nodo_Persona(nodo_Persona ramaizdo, Persona persona, nodo_Persona ramadcho) {
        this.persona = persona;
        this.izquierdo = ramaizdo;
        this.derecho = ramadcho;
    }

    public Persona valornodo(){
        return persona;
    }

    public nodo_Persona getsubizq(){
        return izquierdo;
    }

    public nodo_Persona getsubder(){
        return derecho;
    }

    public void setramaizq (nodo_Persona n){
        izquierdo = n;
    }
    public void setramader (nodo_Persona n){
        derecho = n;
    }

    public void imprimirDato() {

        System.out.println("Teléfono: " + persona.getNumerotelefono() + ", Nombre: " + persona.getNombre() + ", Dirección: " + persona.getDireccion());

    }

}
