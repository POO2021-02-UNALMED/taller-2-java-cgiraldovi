package test;

public class Motor {
    int numeroCilindro;
    String tipo;
    int registro;

    public void cambiarRegistro(int registro){
        this.registro = registro;
    }

    public void asignarTipo(String tipo){
        if(tipo.equals("gasolina")){
            this.tipo = "gasolina";
        } else if(tipo.equals("electrico")){
            this.tipo = "electrico";
        }
    }


}