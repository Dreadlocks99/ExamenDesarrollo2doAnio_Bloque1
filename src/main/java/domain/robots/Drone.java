package domain.robots;

import domain.Pedido;
import domain.Punto;

public class Drone extends Robot{
    public Drone(Punto ubicacion, Pedido pedidoAsignado) {
        super(ubicacion, pedidoAsignado);
    }
}
