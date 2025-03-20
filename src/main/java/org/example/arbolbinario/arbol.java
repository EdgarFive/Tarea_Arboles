package org.example.arbolbinario;

public class arbol {

    private nodo raiz;

    public arbol() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        if(this.raiz == null){
            this.raiz = new nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(nodo padre, int dato) {
        if(dato< padre.valornodo()){

            if(padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new nodo(dato));
            }else{
                insertar(padre.GetSubarbolIzdo(), dato);
            }

        }else if(dato>padre.valornodo()){
            if(padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new nodo(dato));
            }else{
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }

}
