package Ejercicio26_controladoresImpresion;

public class Main {
    public static void main(String[] args) {
        Impresor[] impresores = {
            new ImpresoraLaser("HP LaserJet Pro", 1200, 60),
            new ImpresoraTinta("Epson EcoTank", 5760, 50)
        };

        for (Impresor impresor : impresores) {
            for (int i = 1; i <= 3; i++) {
                impresor.imprimirDocumento("Informe " + i + ".pdf");
            }
            impresor.mostrarEstado();
        }
    }
}
