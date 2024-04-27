// Clase abstracta que implementa la interfaz Comercio
public abstract class Tienda implements Comercio {
    protected String nombreTienda;
    protected double descuento;

    public Tienda(String nombreTienda, double descuento) {
        this.nombreTienda = nombreTienda;
        this.descuento = descuento;
    }

    @Override
    public double calcularDescuento() {
        return descuento;
    }

    @Override
    public String imprimirDetallesTiendas() {
        return "Nombre de la tienda: " + nombreTienda + ", Descuento: " + descuento;
    }
}