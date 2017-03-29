package mariovelez.psptarea4;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Modelo
{
    public double[] classLOC = {18,18,25,31,37,82,82,87,89,230,85,87,558};
    public double[] numberMethods = {3,3,3,3,3,5,4,4,4,10,3,3,10};
    public double[] pages = {7,12,10,12,10,12,12,12,12,8,8,8,20,14,18,12};
    
    /**
     * Método que permite calcular la división de dos arrays del mismo tamaño
     * 
     * @param arreglo1 Primer arreglo para calcular la división
     * @param arreglo2 Segundo arreglo para calcular la división
     * @return         Arreglo con la división de los elementos de los dos
     *                 parametros ingresados
     */
    public double[] divisionArrays(double[] arreglo1, double[] arreglo2)
    {
        double[] division = new double[arreglo1.length];
        if (arreglo1.length==arreglo2.length)
        {
            for(int i=0; i<arreglo1.length;i++)
            {
                division[i]=arreglo1[i]/arreglo2[i];
            }
        }
        else
        {
            System.out.println("Los arreglos ingresados no son del mismo tamaño");
            System.exit(0);
        }
        return division;
    }
    
    /**
     * Método que permite calcular el logaritmo natural de los elementos de una lista
     * 
     * @param arreglo Arreglo del cual se desea calcular el Log Nat
     * @return        Arreglo con el Log Nat para cada elemento de la lista ingresada
     */
    public double[] calcularLogN(double[] arreglo)
    {
        double[] resultado = new double[arreglo.length];
        for(int i=0; i<arreglo.length;i++)
        {
            resultado[i] = Math.log(arreglo[i]);
        }
        return resultado;
    }
    
    /**
     * Método que permite calcular la media aritmetica de un arreglo
     * 
     * @param arreglo Arreglo del que se desea obtener el promedio de sus elementos
     * @return        Valor promedio de los elementos del arreglo ingresado
     */
    public double calcularMedia(double[] arreglo)
    {
        double media=0.0;
        for(int i =0; i<arreglo.length; i++)
        {
            media=media+arreglo[i];
        }
        media=media/arreglo.length;
        return media;
    }
    
    /**
     * Método que permite el cálculo de la varianza de los elementos de un arreglo
     * 
     * @param arreglo  Arreglo con los elementos a determinar la varianza
     * @param promedio Valor promedio de los elementos del arreglo a calcular
     * @return         Valor de la varianza de los elementos ingresados
     */
    public double calcularVarianza(double[] arreglo, double promedio)
    {
        double varianza=0.0;
        for(int i=0; i<arreglo.length; i++)
        {
            varianza = varianza + Math.pow(arreglo[i]-promedio, 2);
        }
        varianza = varianza/(arreglo.length-1);
        return varianza;
    }
    
    /**
     * Método que permite calcular la desviación estándar a partir de la varianza
     * 
     * @param varianza Varianza de la que se obtendrá la desviación estándar
     * @return         Valor de la desviación estándar
     */
    public double calcularDesvEstandar(double varianza)
    {
        double desvEstandar = Math.sqrt(varianza);
        return desvEstandar;
    }
    
    /**
     * Método que permite calcular los rangos logarítmicos
     * 
     * @param promedio     Valor del promedio
     * @param desvEstandar Valor de la desviación estándar
     * @return             Arreglo con los rangos logarítmicos en orden (VS, S, M, L, VL)
     */
    public double[] calcularRangLog(double promedio, double desvEstandar)
    {
        double[] rangLog = new double[5];
        for(int i=0; i<rangLog.length; i++)
        {
            rangLog[i] = promedio + ((i-2)*desvEstandar);
        }
        return rangLog;
    }
    
    /**
     * Método que permite obtener los puntos medios de los rangos logarítmicos
     * 
     * @param rangLog Arreglo con los valores de los rangos logarítmicos
     * @return        Arreglo con los puntos medios obtenidos
     */
    public double[] calcularAntiLog(double[] rangLog)
    {
        double[] puntosMedios = new double[rangLog.length];
        for(int i=0; i<rangLog.length; i++)
        {
            puntosMedios[i] = Math.exp(rangLog[i]);
        }
        return puntosMedios;
    }
}