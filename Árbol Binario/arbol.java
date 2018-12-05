/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import árbol.Nodo;

/**
 *
 * @author RodriguezRosas
 */
public class arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Nodo raíz = new Nodo("+");
     Nodo nodo2 = new Nodo("-");
     Nodo nodo3 = new Nodo("/");
     Nodo nodo4 = new Nodo("*");
     
     raíz.setNodoIzquierdo(new Nodo("5"));
     raíz.setNodoDerecho(nodo2);
     nodo2.setNodoDerecho(new Nodo("4"));
     nodo2.setNodoIzquierdo(nodo3);
     nodo3.setNodoDerecho(new Nodo("3"));
     nodo3.setNodoIzquierdo(nodo4);
     nodo4.setNodoIzquierdo(new Nodo("9"));
     nodo4.setNodoDerecho(new Nodo("6"));
     
     System.out.println("Preorden");
     preOrden(raíz);
     System.out.println("");
     System.out.println("PostOrden");
     postOrden(raíz);
     System.out.println("");
     System.out.println("inOrden");
     inOrden(raíz);
     System.out.println("");

    }
     private static void preOrden(Nodo raiz){
     if(raiz != null){
     System.out.print(raiz.getDato());
     preOrden(raiz.getNodoIzquierdo());
     preOrden(raiz.getNodoDerecho());
        }
    }
     private static void postOrden(Nodo raiz){
     if(raiz != null){
     postOrden(raiz.getNodoIzquierdo());
     postOrden(raiz.getNodoDerecho());
     System.out.print(raiz.getDato());
       }
    }
      private static void inOrden(Nodo raiz){
        if(raiz != null){
            inOrden(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato());
            inOrden(raiz.getNodoDerecho());
    }
      }
}
