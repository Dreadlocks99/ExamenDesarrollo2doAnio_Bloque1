package domain.robots;

import domain.Compartimiento;
import domain.Mercaderia;
import domain.Pedido;
import domain.Punto;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot
{
    private Punto ubicacion;
    private Pedido pedidoAsignado;
    private List<Mercaderia> inventario;

    public Robot(Punto ubicacion, Pedido pedidoAsignado) {
        this.ubicacion = ubicacion;
        this.pedidoAsignado = pedidoAsignado;
        this.inventario = new ArrayList<>();
    }

    public void agarrar(Mercaderia mercaderia)
    {
        this.inventario.add(mercaderia);
    }

    public void soltar(Mercaderia mercaderia)
    {
        this.inventario.remove(mercaderia);
    }

    public void desplazarse(Punto punto)
    {
        this.ubicacion = punto;
    }

    public void realizarRecorrido()
    {
        desplazarse(irAlCompartimiento().getUbicacion());
        agarrar(irAlCompartimiento().getMercaderia());
    }

    public Compartimiento irAlCompartimiento()
    {
        return this.pedidoAsignado.getMercaderia().stream().findFirst().get().getCompartimiento();
    }



}
