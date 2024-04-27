// Clase concreta para el tipo de comercio "RopaDeNiño"
public class RopaDeNiño extends Tienda {
    public RopaDeNiño(String nombreTienda, double descuento) {
        super(nombreTienda, descuento);
    }

    @Override
    public String getTipoDeComercio() {
        return "RopaDeNiño";
    }
}