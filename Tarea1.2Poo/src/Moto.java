public class Moto extends Vehiculo implements Aseguranza{
    public double capacidadMotor;

    public Moto(String marca, String modelo, int anio, double precioRenta, double capacidadMotor) throws Exception {
        super(marca, modelo, anio, precioRenta);

        if (capacidadMotor <= 0)
            throw new Exception("La capacidad de motor no puede ser menor o igual cero");

        this.capacidadMotor = capacidadMotor;
    }

    @Override
    public double CalcularAseguranza() throws Exception{
        double anio = super.getAnio() * 0.005;
        return anio * super.getPrecioRenta();
    }

    @Override
    public double calcularCostoRenta(int dias) throws Exception {
        if (dias <= 0)
            throw new Exception("La dias no puede ser menor que 0");
        double precioBase = super.getPrecioRenta() * dias;
        double descuento = precioBase * 0.20;
        return precioBase - descuento;
    }
}
