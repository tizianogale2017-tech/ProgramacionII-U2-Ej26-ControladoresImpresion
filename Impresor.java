package Ejercicio26_controladoresImpresion;

public abstract class Impresor {
    protected String modelo;
    protected int resolucion;

    public Impresor(String modelo, int resolucion) {
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public abstract void imprimirDocumento(String documento);

    public abstract void mostrarEstado();
}
