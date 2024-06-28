public class Turismo extends Vehiculo implements Aseguranza{

    public int numeroPuertas;

    public Turismo(int numeroPuertas, String marca, String modelo, int anio, double precioRenta) throws Exception {
        super(marca, modelo, anio, precioRenta);
        if (numeroPuertas <= 0)
            throw new Exception("El numero de puertas no puede ser menor o igual cero");
        this.numeroPuertas = numeroPuertas;
    }


    @Override
    public double CalcularAseguranza() throws Exception{
        double anio = super.getAnio() * 0.01;
        return anio * super.getPrecioRenta();
    }

    @Override
    public double calcularCostoRenta(int dias) throws Exception {
        if (dias <= 0)
            throw new Exception("La dias no puede ser menor que 0");

        return super.getPrecioRenta() * dias;
    }
}
