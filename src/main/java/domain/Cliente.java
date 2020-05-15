package domain;

public class Cliente {

    private String nombre;

    public void realizarPedidoA(Deposito deposito, Pedido pedido)
    {
        deposito.recibirPedido(pedido);
    }

}
