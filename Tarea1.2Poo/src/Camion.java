public class Camion extends Vehiculo implements Aseguranza{

    public double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double precioRenta,double capacidadCarga) throws Exception {
        super(marca, modelo, anio, precioRenta);

        if (capacidadCarga <= 0)
            throw new Exception("La capacidad de carga no puede ser menor o igual cero");

        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double CalcularAseguranza() throws Exception{
        double anio = super.getAnio() * 0.015;
        return anio * super.getPrecioRenta();
    }

    @Override
    public double calcularCostoRenta(int dias) throws Exception {
        if (dias <= 0)
            throw new Exception("La dias no puede ser menor que 0");

        double precioBase = super.getPrecioRenta() * dias;
        double recargo = precioBase * 0.20;
        return precioBase + recargo;
    }
}

