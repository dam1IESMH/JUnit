/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author LBB
 */
public class CaminoBasico {
    /**
     * 
     * Camino 1: I, 1, 2, 4, 5, F   -> Entradas: a=T, b=F, c=T  -> Salida: ret=2
     * Camino 2: I, 1, 2, 4, F      -> Entradas: a=T, b=F, c=F  -> Salida: ret=0
     * Camino 3: I, 1, 2, 3, F      -> Entradas: a=T, b=T, c=?  -> Salida: ret=1
     * Camino 4: I, 1, 4, F         -> Entradas: a=F, b=F, c=F  -> Salida: ret=0
     */
    public int aMethod(boolean a, boolean b, boolean c){
        int ret = 0;    //nodoI
        if(a && b){     //nodo1 && nodo2
            ret = 1;    //nodo3
        }
        else
            if (c){     //nodo4
                ret = 2;//nodo5
            }
        return ret;     //nodoF    
    }
}
