public class Main {
    public static void main(String[] args) {
        Comparendo comparendo =  new Carro();
        Comparendo comparendo2 =  new Camion();
        Comparendo comparendo3 =  new Mula();
        comparendo.construirFotoMulta(80, "carro");
        comparendo3.construirFotoMulta(200, "mula");
        comparendo2.construirFotoMulta(40, "camion");
        comparendo.construirFotoMulta(40, "avion");
    }
}