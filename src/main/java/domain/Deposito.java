package domain;

import domain.robots.Robot;

import java.util.List;

public class Deposito {
    private List<Compartimiento> mercaderias;
    private List<Pedido> pedidos;
    private List<Robot> robots;


    public void buscarMercaderia(Robot unRobot)
    {

    }

    public void recibirPedido(Pedido pedido)
    {
        this.pedidos.add(pedido);
    }

    public void ejecutarPedido()
    {

    }

    public void atenderPedidos()
    {

    }
}
