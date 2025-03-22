package org.example.Datos;

public class Persona {


    //En esta clase definimos todos los datos que va llevar toda persona ============================
    public int numerotelefono;
    public String nombre;
    public String direccion;

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
