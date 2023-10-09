import java.util.Scanner;

public abstract class Comparendo {
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;

    public Comparendo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }
    public Comparendo(){}

    public abstract void construirFotoMulta(int velocidad, String tipoVehiculo);

}
