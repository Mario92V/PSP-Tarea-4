package mariovelez.psptarea4;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Vista
{
    /**
     * Método que permite la visualización de resultados en pantalla
     * 
     * @param puntosMediosA Arreglo de elementos obtenidos para el primer conjunto de datos
     * @param puntosMediosB Arreglo de elementos obtenidos para el segundo conjunto de datos
     */
    public String mostrarResultados(double[] puntosMediosA, double[] puntosMediosB)
    {
        String resultado = "Valores obtenidos para LOC/Method: " + "<br/>" 
		+ "VS: " + puntosMediosA[0]+ " S: " + puntosMediosA[1]+ " M: " + puntosMediosA[2]+ " L: " + puntosMediosA[3]+ " VL: " + puntosMediosA[4] + "<br/>"
		+ "Valores obtenidos para Pgs/Chapter:" + "<br/>"
		+ "VS: " + puntosMediosB[0]+ " S: " + puntosMediosB[1]+ " M: " + puntosMediosB[2]+ " L: " + puntosMediosB[3]+ " VL: " + puntosMediosB[4];
		return resultado;
    }
}