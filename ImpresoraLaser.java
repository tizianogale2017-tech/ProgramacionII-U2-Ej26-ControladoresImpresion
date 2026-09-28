package Ejercicio26_controladoresImpresion;

public class ImpresoraLaser extends Impresor {
    private int nivelToner;

    public ImpresoraLaser(String modelo, int resolucion, int nivelToner) {
        super(modelo, resolucion);
        this.nivelToner = nivelToner;
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (nivelToner <= 0) {
            System.out.println("[" + modelo + "] ERROR: tóner agotado, no se puede imprimir \"" + documento + "\".");
            return;
        }
        nivelToner -= 40;
        if (nivelToner < 0) {
            nivelToner = 0;
        }
        System.out.println("[" + modelo + "] Imprimiendo \"" + documento + "\" a " + resolucion + " dpi con tecnología láser.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Estado " + modelo + ": tóner al " + nivelToner + "%");
    }
}
