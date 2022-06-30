package javaapplication1;

public class Electrodomestico {
    
    int Precio_base = 10000;
    int Peso = 5; 
    String Color = "Blanco";
    String Consumo = "F";

   public Electrodomestico (int precio_base, int peso) {
       this.Precio_base = precio_base;
       this.Color = "Blanco";
       this.Consumo = "F";
       this.Peso = Peso;
       
       }
   
       public Electrodomestico (int Precio_base, String Color, String Consumo, int Peso) {
       this.Precio_base = Precio_base;
       this.Color = Color;
       this.Consumo = Consumo;
       this.Peso = Peso;
   
   }
       public Electrodomestico (char Consumo) {
        switch (Consumo) {
        case 'A' : Precio_base = Precio_base + 1000; 
        break;
        case 'B' : Precio_base = Precio_base + 800;
        break;
        case 'C' : Precio_base = Precio_base + 600;
        break;
        case 'D' : Precio_base = Precio_base + 500;
        break;
        case 'E' : Precio_base = Precio_base + 300; 
        break;
        case 'F' : Precio_base = Precio_base + 100;
        break;
        default : System.out.println("Error en el consumo ingresado"); break;
        }


    public int getPrecio_base() {
        return Precio_base;
    }

    public int getPeso() {
        return Peso;
    }

    public String getColor() {
        return Color;
    }

    public String getConsumo() {
        return Consumo;
    }
    
            
}
