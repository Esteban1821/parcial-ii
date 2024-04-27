// Clase concreta para un nuevo tipo de comercio (por ejemplo, "Cocina")
public class Cocina extends Tienda {
    public Cocina(String nombreTienda, double descuento) {
        super(nombreTienda, descuento);
    }

    @Override
    public String getTipoDeComercio() {
        return "Cocina";
    }
}
