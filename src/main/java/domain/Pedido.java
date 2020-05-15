package domain;

import domain.robots.Robot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {

    private String nombre;
    private List<Mercaderia> mercaderia;
    private Robot robot;

    public Pedido(String nombre) {
        this.nombre = nombre;
        this.mercaderia = new ArrayList<>();
    }

    public void agregarMercaderias(Mercaderia ... mercaderias)
    {
        Collections.addAll(this.mercaderia, mercaderias);
    }

    public void asignarRobot(Robot unRobot)
    {
        this.robot = robot;
    }

    public List<Mercaderia> getMercaderia() {
        return mercaderia;
    }
}
