package org.example.arbolcadena;

public class arbolcadena {


    private org.example.arbolcadena.nodocadena raiz;

    public arbolcadena() {
        this.raiz = null;
    }

    public void insertar(String dato) {
        if(this.raiz == null){
            this.raiz = new nodocadena(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(nodocadena padre, String dato) {
        if(dato.compareTo(padre.valornodo()) < 0){

            if(padre.GetSubarbolIzdo() == null){
                padre.SetRamaIzdo(new nodocadena(dato));
            }else{
                insertar(padre.GetSubarbolIzdo(), dato);
            }

        }else{
            if(padre.GetSubarbolDcho() == null){
                padre.SetRamaDcho(new nodocadena(dato));
            }else{
                insertar(padre.GetSubarbolDcho(), dato);
            }
        }
    }
    //=========================================================================00

}
