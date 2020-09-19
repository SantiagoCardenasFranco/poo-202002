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

    public String nombre()
    {
        String nombre = null;

        switch (nombre) {
            case "Cheetos" :
            {
                sacarMecato((byte) 1);
                nombre = "Cheetos";
                break;
            }

            case "De Todito" :
            {
                sacarMecato((byte) 1);
                nombre = "De Todito";
                break;
            }

            case "Chocorramo" :
            {
                sacarMecato((byte) 1);
                nombre = "Chocorramo";
                break;
            }

            case "Chpis" :
            {
                sacarMecato((byte) 1);
                nombre = "Chpis";
                break;
            }

            case "Gala" :
            {
                sacarMecato((byte) 1);
                nombre = "Gala";
                break;
            }

            case "Jumbo" :
            {
                sacarMecato((byte) 1);
                nombre = "Jumbo";
                break;
            }

            case "Almendras" :
            {
                sacarMecato((byte) 1);
                nombre = "Almendras";
                break;
            }

            case "Maní" :
            {
                sacarMecato((byte) 1);
                nombre = "Maní";
                break;
            }

            case "Choclitos" :
            {
                sacarMecato((byte) 1);
                nombre = "Choclitos";
                break;
            }

            case "Doritos" :
            {
                sacarMecato((byte) 1);
                nombre = "Doritos";
                break;
            }
            default:
                break;
        }
        return nombre;
    }

    public String codigo()
    {
        String codigo = null;

        switch (codigo) {
            case "A" :
            {
                sacarMecato((byte) 1);
                nombre = "A";
                break;
            }

            case "B" :
            {
                sacarMecato((byte) 1);
                nombre = "B";
                break;
            }

            case "C" :
            {
                sacarMecato((byte) 1);
                nombre = "C";
                break;
            }

            case "D" :
            {
                sacarMecato((byte) 1);
                nombre = "D";
                break;
            }

            case "E" :
            {
                sacarMecato((byte) 1);
                nombre = "E";
                break;
            }

            case "F" :
            {
                sacarMecato((byte) 1);
                nombre = "F";
                break;
            }

            case "G" :
            {
                sacarMecato((byte) 1);
                nombre = "G";
                break;
            }

            case "H" :
            {
                sacarMecato((byte) 1);
                nombre = "H";
                break;
            }

            case "I" :
            {
                sacarMecato((byte) 1);
                nombre = "I";
                break;
            }

            case "J" :
            {
                sacarMecato((byte) 1);
                nombre = "J";
                break;
            }
            default:
                break;
        }
        return nombre;
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
