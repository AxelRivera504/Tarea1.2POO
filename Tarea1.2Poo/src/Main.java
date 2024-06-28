//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido al Sistemas de Gestión de Vehiculos");
        try{
            System.out.println("----------------------------------------------");
            System.out.println("Vehiculo turismo");
            Turismo tu = new Turismo(4, "Mazda", "T30",2024,3000);
            System.out.println("Calculos renta para el vehiculo turismo de la marca: "+tu.getMarca()+", con el modelo:"+tu.getModelo());
            System.out.println("Costo renta:"+tu.calcularCostoRenta(10));
            System.out.println("Aseguranza:"+tu.CalcularAseguranza());
            System.out.println("----------------------------------------------");
            System.out.println("Vehiculo Camion");
            Camion ca = new Camion("Izuzu", "Hilux",2019,7000, 4500);
            System.out.println("Calculos para el vehiculo camion de la marca: "+ca.getMarca()+", con el modelo:"+ca.getModelo());
            System.out.println("Costo renta:"+ca.calcularCostoRenta(10));
            System.out.println("Aseguranza:"+ca.CalcularAseguranza());
            System.out.println("----------------------------------------------");
            System.out.println("Vehiculo Moto");
            Moto mo = new Moto("Izuzu", "Ninja 132",2024,10000, 250);
            System.out.println("Calculos para el vehiculo Moto de la marca: "+mo.getMarca()+", con el modelo:"+mo.getModelo());
            System.out.println("Costo renta:"+mo.calcularCostoRenta(10));
            System.out.println("Aseguranza:"+mo.CalcularAseguranza());
            System.out.println("----------------------------------------------");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}