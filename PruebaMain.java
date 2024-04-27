// Prueba Main
public class PruebaMain {
    public static void main(String[] args) {
        Comercio ropaDeNino = new RopaDeNiño("Ropa de Niño", 0.08);
        Comercio dispositivosElectronicos = new DispositivosElectronicos("Dispositivos Electronicos", 0.04);
        Comercio cocina = new Cocina("Cocina", 0.15);

        CentroComercial centroComercial1 = new CentroComercial(ropaDeNino);
        CentroComercial centroComercial2 = new CentroComercial(dispositivosElectronicos);
        CentroComercial centroComercial3 = new CentroComercial(cocina);

        centroComercial1.imprimirDetallesTiendas();
        centroComercial2.imprimirDetallesTiendas();
        centroComercial3.imprimirDetallesTiendas();
    }
}