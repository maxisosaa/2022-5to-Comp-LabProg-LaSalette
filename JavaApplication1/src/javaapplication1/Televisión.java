package javaapplication1;


public class Televisión extends Electrodomestico{
    
    int Resolución = 20;
    boolean sintonizador = false;

   // public Televisión(int Resolución, boolean sintonizador){
        
      //  this.Resolución = Resolución;
        //this.sintonizador = sintonizador;
    //}
    
    public Televisión (int precio_base, int peso) {
        super(precio_base, peso);
        Resolución = 20;
        sintonizador = false;
        
    }
        
         public Televisión(int Precio_base, String Color, String Consumo, int Peso, int Resolución, boolean sintonizador) {
        super(Precio_base, Color, Consumo, Peso);
        this.Resolución = Resolución;
        this.sintonizador = sintonizador;
    }

    public int getResolución() {
        return Resolución;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    
    
}
