// Clase para el Centro Comercial que maneja diferentes tipos de comercio
public class CentroComercial {
    private Comercio comercio;

    public CentroComercial(Comercio comercio) {
        this.comercio = comercio;
    }

    public void imprimirDetallesTiendas() {
        switch (comercio.getTipoDeComercio()) {
            case "RopaDeNiño":
                System.out.println("Tipo de comercio: Ropa de Niño");
                break;
            case "DispositivosElectronicos":
                System.out.println("Tipo de comercio: Dispositivos Electronicos");
                break;
            case "Cocina":
                System.out.println("Tipo de comercio: Cocina");
                break;
            default:
                System.out.println("Tipo de comercio no reconocido");
        }
        System.out.println(comercio.imprimirDetallesTiendas());
    }
}
