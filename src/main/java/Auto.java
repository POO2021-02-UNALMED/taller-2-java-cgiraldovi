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

    public String verificarintegridad(){
        int cont = 0;
        for (Asiento asiento: asientos) {
            if(asiento.registro == registro && registro == motor.registro){
                cont ++;
            }
        }

        if(cont == asientos.length){
            return "Las piezas no son originales";
        } else {
            return "Auto original";
        }



    }


}
