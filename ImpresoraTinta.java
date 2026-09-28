package Ejercicio26_controladoresImpresion;

public class ImpresoraTinta extends Impresor {
    private int nivelCartucho;

    public ImpresoraTinta(String modelo, int resolucion, int nivelCartucho) {
        super(modelo, resolucion);
        this.nivelCartucho = nivelCartucho;
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (nivelCartucho <= 0) {
            System.out.println("[" + modelo + "] ERROR: cartucho vacío, no se puede imprimir \"" + documento + "\".");
            return;
        }
        nivelCartucho -= 30;
        if (nivelCartucho < 0) {
            nivelCartucho = 0;
        }
        System.out.println("[" + modelo + "] Imprimiendo \"" + documento + "\" a " + resolucion + " dpi por inyección de tinta.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado " + modelo + ": cartucho al " + nivelCartucho + "%");
    }
}
