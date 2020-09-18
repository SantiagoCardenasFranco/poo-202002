package com.Santiago.Taller1.dispensadorDeMecato;

public class Producto {
    private String nombre;
    private int precio;
    private String codigo;
    private byte cantidad;

    public Producto(String nombre, int precio, String codigo, byte cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte getCantidad() { return cantidad; }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public boolean sacarMecato(byte cantidadARetirar) {
        if (cantidad >= 0 ) {
            return  false;
        }
        else{
            cantidad -= cantidadARetirar;
            return true;
        }
    }

    public String descripcion()
    {
        String descripcion = null;

        switch (nombre) {
            case "Cheetos" :
            {
                descripcion = "Cheetos";
                break;
            }

        }
        return descripcion;
    }

    public boolean aumentarCantidad(byte valorAAgregar) {
        if (cantidad < 8 && cantidad >= 0 ) {
            if (cantidad + valorAAgregar > 8){
                return false;
            }
            else{
                cantidad += valorAAgregar;
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean verficarCantidad(Producto mecato)
    {
        if(mecato.getCantidad() == 0){
            System.out.println("No hay");
            return true;
        }
        else{
            System.out.println("Si hay");
            return  false;
        }
    }

}
