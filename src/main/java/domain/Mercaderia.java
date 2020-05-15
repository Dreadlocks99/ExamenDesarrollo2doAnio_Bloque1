package domain;

public class Mercaderia {

    private String nombre;
    private Compartimiento compartimiento;

    public Mercaderia(String nombre, Compartimiento compartimiento) {
        this.nombre = nombre;
        this.compartimiento = compartimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Compartimiento getCompartimiento() {
        return compartimiento;
    }


}
