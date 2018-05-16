package ed;

/**
 *
 * @author LBB
 * Clase para covertir valores de temperaturas en diferentes medidas
 * Fórmulas obtenidas desde http://www.elosiodelosantos.com/sergiman/div/formulas_conversion_de_temperaturas.htm  (Enlace válido a 16/05/2018)
 */
public class ConversorTemperaturas {
    
    public ConversorTemperaturas() {
    }

    /**
     * Función que transforma un valor de temperatura en grados Celsius a grados Fharenheit
     * F = (9C / 5) + 32
     * @param celsius valor real de la temperatura en grados Celsius
     * @return el valor real de la temperatura en grados Fharenheit
     * @throws TemperaturaNoValidaException si el valor del parámetro es inferior a 273º Kelvin (CERO ABSOLUTO)
     */
    public double celsiusAFharenheit(double celsius) throws TemperaturaNoValidaException{
        if(celsius < -273) 
            throw new TemperaturaNoValidaException();
        return ((9.0* celsius) + (5.0 * 32)) /5;
    }

    /**
     * Función que transforma un valor de temperatura en grados Fharenheit a grados Celsius
     * C = 5 (F -32) /9
     * @param fahrenheit valor real de la temperatura en grados Fharenheit
     * @return el valor real de la temperatura en grados Celsius
     */
    public double fharenheitACelsius(double fahrenheit){
        return (5.0 * (fahrenheit - 32))/9.0;
    }
    
    /**
     * Función que transforma un valor de temperatura en grados Celsius a grados Reamur
     *  Re = 4C / 5
     * @param celsius valor real de la temperatura en grados Celsius
     * @return el valor real de la temperatura en grados Reamur
     * @throws TemperaturaNoValidaException si el valor del parámetro es inferior a 273º Kelvin (CERO ABSOLUTO)
     */
    public double celsiusAReamur(double celsius) throws TemperaturaNoValidaException{
        if(celsius < -273) 
            throw new TemperaturaNoValidaException();
        return (4.0* celsius) /5;
    }
}
