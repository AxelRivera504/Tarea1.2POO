abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precioRenta;

    public Vehiculo(String marca, String modelo, int anio, double precioRenta) throws Exception{
        if ((marca == null || marca.isBlank()) || (modelo == null || modelo.isBlank()) || anio < 0 || precioRenta < 0)
            throw new Exception("la marca, modelo, año, precioRenta deben ser inicializados");

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioRenta = precioRenta;
    }

    double calcularCostoRenta(int dias) throws Exception{
        return 0;
    }

    public void setMarca(String marca) throws Exception{
        if (marca == null || marca.isBlank())
            throw new Exception("La marca no puede estar vacia");

        this.marca = marca;
    }

    public void setModelo(String modelo) throws Exception{
        if (modelo == null || modelo.isBlank())
            throw new Exception("El modelo no puede estar vacia");

        this.modelo = modelo;
    }

    public void setAnio(int anio) throws Exception{
        if (anio <= 0)
            throw new Exception("El anio no puede ser menor o igual que 0");

        this.anio = anio;
    }

    public void setPrecioRenta(double precioRenta) throws Exception{
        if (precioRenta <= 0)
            throw new Exception("El precio no puede ser menor o igual que 0");
    }

    public String getMarca() throws Exception{
        if(marca == null || marca.isBlank())
            throw new Exception("La marca de vehiculo no esta disponible");
        return marca;
    }

    public String getModelo() throws Exception{
        if(modelo == null || modelo.isBlank())
            throw new Exception("El modelo del vehiculo no esta disponible");
        return modelo;
    }

    public int getAnio(){
        return anio;
    }

    public double getPrecioRenta() throws Exception{
        if(precioRenta == 0)
            throw new Exception("El precio renta del vehiculo no esta disponible");
        return precioRenta;
    }
}
