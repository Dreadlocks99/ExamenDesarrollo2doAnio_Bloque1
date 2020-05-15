package domain;

public class Compartimiento {

    private Mercaderia mercaderia;
    private Punto ubicacion;

    public Compartimiento(Mercaderia mercaderia, Punto ubicacion) {
        this.mercaderia = mercaderia;
        this.ubicacion = ubicacion;
    }

    public Mercaderia getMercaderia() {
        return mercaderia;
    }

    public Punto getUbicacion() {
        return ubicacion;
    }
}
