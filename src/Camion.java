public class Camion extends Comparendo implements Validacion{
    public Camion() {
        super(75, 76, 95);
    }

    @Override
    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int comparendo = calcularComparendoVehiculo(velocidad, tipoVehiculo);
        String txt = enviarCorreoFotomultaVehiculo(tipoVehiculo);
        if(comparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + txt);
        }else {
            System.out.println("----el tipo de comparendo es: " + comparendo + " ----cuerpo del correo" + txt);
        }
    }

    @Override
    public int calcularComparendoVehiculo(int velocidad, String tipo) {
        if(velocidad<=limiteInferior) {
            return 0;
        }else if (velocidad >=limiteInferiorIntermedio && velocidad<=limiteSuperior) {
            return 1;
        } return 2;
    }
    @Override
    public String enviarCorreoFotomultaVehiculo(String tipoVehiculo) {
        if (tipoVehiculo == "camion") {
            String cuerpoMensaje = "//enviando correo para el tipo camion.";
            String asunto = "//asunto: comparendo camion";
            return asunto + cuerpoMensaje;
        } return "enviando correo con vehiculo desconocido";
    }
}