package javaapplication1;


public class Lavadora extends Electrodomestico{
    
    int Carga = 5;

    public Lavadora(int precio_base, int peso) {
        super(precio_base, peso);
        Carga = 5;
    }

    public Lavadora(int Precio_base, String Color, String Consumo, int Peso, int Carga) {
        super(Precio_base, Color, Consumo, Peso);
        this.Carga = Carga;

    }
    
}