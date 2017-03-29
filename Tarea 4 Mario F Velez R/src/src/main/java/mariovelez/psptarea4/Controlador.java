package mariovelez.psptarea4;

import static spark.Spark.*;

/**
 *
 * @author Mario F. Vélez R.
 */
public class Controlador
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
        
        get("/", (request, response) -> {
        Vista controladorVista = new Vista();
        Modelo controladorModelo = new Modelo();
        double[] proceso = controladorModelo.divisionArrays(controladorModelo.classLOC, controladorModelo.numberMethods);
        proceso = controladorModelo.calcularLogN(proceso);
        double promedio = controladorModelo.calcularMedia(proceso);
        double varianza = controladorModelo.calcularVarianza(proceso, promedio);
        double desvEstandar = controladorModelo.calcularDesvEstandar(varianza);
        double[] puntosMediosA = controladorModelo.calcularRangLog(promedio, desvEstandar);
        puntosMediosA = controladorModelo.calcularAntiLog(puntosMediosA);
        proceso = controladorModelo.calcularLogN(controladorModelo.pages);
        promedio = controladorModelo.calcularMedia(proceso);
        varianza = controladorModelo.calcularVarianza(proceso, promedio);
        desvEstandar = controladorModelo.calcularDesvEstandar(varianza);
        double[] puntosMediosB = controladorModelo.calcularRangLog(promedio, desvEstandar);
        puntosMediosB = controladorModelo.calcularAntiLog(puntosMediosB);
        return controladorVista.mostrarResultados(puntosMediosA, puntosMediosB);
    });
    }
}