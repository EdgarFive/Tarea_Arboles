package org.example.arbolcadena;

public class nodocadena {


    protected  String dato;
    protected nodocadena izdo;
    protected nodocadena dcho;


    public nodocadena(String valor) {
        dato= valor;
        izdo= dcho = null;
    }

    //segundo

    public nodocadena(nodocadena ramaIzdo, String valor, nodocadena ramaDcho) {
        dato= valor;
        izdo= ramaIzdo;
        dcho= ramaDcho;
    }

    //accesos:
    public String valornodo() {
        return dato;
    }

    public nodocadena GetSubarbolIzdo() {
        return izdo;
    }

    public nodocadena GetSubarbolDcho() {
        return dcho;
    }

    public void SetRamaIzdo(nodocadena n) {
        izdo= n;
    }

    public void SetRamaDcho(nodocadena n) {
        dcho= n;
    }

    public void imprimirDato(){
        System.out.println(dato);
    }

}
