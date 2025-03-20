package org.example.Datos;

public class arbol_Persona {
    private nodo_Persona raiz;

    public arbol_Persona(){
        this.raiz = null;
    }

    public void insertar(Persona persona){
        if(this.raiz == null){
            this.raiz = new nodo_Persona(persona);
        }else {
            this.insertar(this.raiz, persona);
        }
    }

    private void insertar(nodo_Persona padre, Persona  persona){
        if(persona.getNumerotelefono() < padre.valornodo().getNumerotelefono()){
            if(padre.getsubizq()== null){
                padre.setramaizq(new nodo_Persona(persona));
            }else{
                insertar(padre.getsubizq(), persona);
            }
        }else{
            if(padre.getsubder() == null){
              padre.setramader(new nodo_Persona(persona));
            }else{
                insertar( padre.getsubder(), persona);
            }
        }
    }
}
