/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');// indice 0
        grafo.insertarNodo('B');// indice 1
        grafo.insertarNodo('C');// indice 2
        grafo.insertarNodo('D');// indice 3
        
        grafo.conectar(0, 1);//(A,B)
        grafo.conectar(0, 2);//(A,C)
        grafo.conectar(0, 0);//(B,D)
        grafo.conectar(1, 3);//(B,D)
        grafo.conectar(2, 3);//(C,D)
        
        System.out.println("Recorrido Depth First Search (DFS)  desde el nodo A");
        
        grafo.dfs(0);
        //teoricamente el recorrido es;
        //visitando a;
        //luego visita nodo b(seria el primer adyacente de a)
        //luego visita d(que seria el adyacente de b)
        //luego retrocede(vuelve a la rai) y visita c(que seria adyacente no visitado de a)
        
    }
    
}
