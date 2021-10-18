package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;


    public int cantidadAsientos(){
         return asientos.length;
    }

    public String verificarIntegridad(){
        int cont = 0;
        int contAsientos = 0;
        for (Asiento asiento: asientos) {

            if(asiento != null){
                contAsientos ++;
                if(asiento.registro == registro && registro == motor.registro){
                    cont ++;
                }
            }
        }

        if(cont == contAsientos){
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}


