package org.example.arbolbinario;

public class nodo {
    protected  int dato;
    protected  nodo izdo;
    protected nodo dcho;

    public nodo(int valor) {
        dato= valor;
        izdo= dcho = null;
    }

    //segundo

    public nodo(nodo ramaIzdo, int valor, nodo ramaDcho) {
        dato= valor;
        izdo= ramaIzdo;
        dcho= ramaDcho;
    }

    //accesos:
    public int valornodo() {
        return dato;
    }

    public nodo GetSubarbolIzdo() {
        return izdo;
    }

    public nodo GetSubarbolDcho() {
        return dcho;
    }

    public void SetRamaIzdo(nodo n) {
        izdo= n;
    }

    public void SetRamaDcho(nodo n) {
        dcho= n;
    }

    public void imprimirDato(){
        System.out.println(dato);
    }

}
