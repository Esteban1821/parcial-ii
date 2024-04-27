// Clase concreta para el tipo de comercio "DispositivosElectronicos"
public class DispositivosElectronicos extends Tienda {
    public DispositivosElectronicos(String nombreTienda, double descuento) {
        super(nombreTienda, descuento);
    }

    @Override
    public String getTipoDeComercio() {
        return "DispositivosElectronicos";
    }
}