package org.example.Datos;

public class arbol_Persona {

    private nodo_Persona raiz;

    public arbol_Persona(){
        this.raiz = null;
    }

    //El metodo que se ejecuta por defecto a la ora de ingresar el nodo raiz ================================
    public void insertar(Persona persona){
        if(this.raiz == null){
            this.raiz = new nodo_Persona(persona);
        }else {
            this.insertar(this.raiz, persona);
        }
    }

    // La segunda función que se ejecuta cuando ya hay un nodo raiz ============================
    private void insertar(nodo_Persona padre, Persona  persona){
        String numActual = String.valueOf(persona.getNumerotelefono());
        String numPadre = String.valueOf(padre.valornodo().getNumerotelefono());

        int resultado = compardigito(numActual, numPadre);

        if(resultado < 0){
            if(padre.getsubizq() == null) {
                padre.setramaizq(new nodo_Persona(persona));
            } else {
                insertar(padre.getsubizq(), persona);
            }
        }else{
            if(padre.getsubder() == null) {
                padre.setramader(new nodo_Persona(persona));
            } else {
                insertar(padre.getsubder(), persona);
            }
        }
    }

    //función que nos sirve para comparar los números digito por digito de los numeros de telefono, diciendonos así que valor va a la izquierda o derecha =====================================
    private int compardigito(String num1, String num2){
       int longitud = Math.min(num1.length(), num2.length());

       for(int i = 0; i<longitud; i++){
           char digito1=num1.charAt(i);
           char digito2=num2.charAt(i);

           if(digito1 != digito2){
               return digito1 - digito2;
           }
       }
       return num1.length() - num2.length();
    }
}
