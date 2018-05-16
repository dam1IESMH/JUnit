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
public class ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        double tCelsius;
        double tFharenheit;
        double tReamur;
        try {  
            //Clase de equivalencia válida: tCelsius>=-273
            tCelsius = 25.5;
            System.out.println("Ha introducido el valor "+ tCelsius +" para la temperatura en ºC");
            tFharenheit = conversor.celsiusAFharenheit(tCelsius);
            System.out.println("En grados Fharenheit: "+ tFharenheit +".");
            tReamur = conversor.celsiusAReamur(tCelsius);
            System.out.println("En grados Reamur: "+ tReamur +".");

            tFharenheit = 100.0;
            tCelsius = conversor.fharenheitACelsius(tFharenheit);
            System.out.println(tFharenheit + " en grados Celsius es: "+ tCelsius +".");
     
        } 
        catch (TemperaturaNoValidaException e) {
            System.out.println("Se ha producido una TemperaturaNoValidaException");
            e.printStackTrace();
        }
        finally{
            System.out.println("Seguimos ejecución...");
        }

        
        try{
            //Clase de equivalencia no válida: tCelsius <-273
            tCelsius = -300;
            tReamur = conversor.celsiusAReamur(tCelsius); //provocará una TemperaturaNoValidaException
        }
        catch (TemperaturaNoValidaException e) {
            System.out.println("Se ha producido una TemperaturaNoValidaException");
            e.printStackTrace();
        }    
        finally{
            System.out.println("Seguimos ejecución...");
        }

        try{
            //Clase de equivalencia no válida: tCelsius <-273
            tCelsius = -300;
            tFharenheit = conversor.celsiusAFharenheit(tCelsius); //provocará una TemperaturaNoValidaException //provocará una TemperaturaNoValidaException
        }
        catch (TemperaturaNoValidaException e) {
            System.out.println("Se ha producido una TemperaturaNoValidaException");
            e.printStackTrace();
        }    
        finally{    
            System.out.println("Seguimos ejecución...");
        }
        
        System.out.println("--FIN--");
        
    }
    
}
