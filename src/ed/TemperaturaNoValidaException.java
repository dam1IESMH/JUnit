/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author LBB
 * Excepción que se produce al tratar con un valor para la temperatura menor a 273º Kelvin (CERO ABSOLUTO)
 */
public class TemperaturaNoValidaException extends Exception{
   
    public TemperaturaNoValidaException(){
        super("La temperatura no puede ser inferior a -273º Kelvin.");
    }
    
}
