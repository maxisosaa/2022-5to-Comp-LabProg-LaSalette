package prueba;

import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {
        Constructor ct1 = new Constructor (200,20,"Juan Manuel","Diego Palma 2019","+54 11 3800-5472",43453197);
        Constructor ct2 = new Constructor (900,20,"Sebastian","Ricardo Balvin 1151","54 11 2215-5308",45569015);
        Consultor cl1 = new Consultor (6,50,"Carlos","Hudson 563","54 11 8256-4627",46754021);
        Consultor cl2 = new Consultor (22,60,"Maximiliano","Aguero 1169","54 11 4487-1943",46444732);
        Operario op1 = new Operario ("Juan",8,"Pablo","Manuela Pedraza 1004","54 11 5703-1537",41945266);
        Operario op2 = new Operario ("Ian",7,"Franco","Gral Coronel 7645","54 11 9642-3440", 45893350);
        
        ArrayList <Constructor>Constructores = new ArrayList ();
        ArrayList <Consultor>Consultores = new ArrayList ();
        ArrayList <Operario>Operarios = new ArrayList ();
        Constructores.add (ct1); Constructores.add (ct2);
        Consultores.add (cl1); Consultores.add (cl2);
        Operarios.add (op1); Operarios.add (op2);
        
        CalcularSueldos(Constructores,Consultores,Operarios);
        ConsultorMasHoras(Consultores);
        Informe(Operarios);
    }

    private static void CalcularSueldos(ArrayList<Constructor> Constructores, ArrayList<Consultor> Consultores, ArrayList<Operario> Operarios) {
        int SumaCt = Constructores.get(1).getSueldo() + Constructores.get(0).getSueldo();
        int SumaCl = (int) (Consultores.get(1).getTarifaxHora()* Consultores.get(1).getHorasTrabajadas() + Consultores.get(0).getTarifaxHora() * Consultores.get(0).getHorasTrabajadas());
        int SumaOp = Operarios.get(1).getHorasTrabajadas()* 50 + Operarios.get(0).getHorasTrabajadas()* 50;
        int SumaTt = SumaCt + SumaCl + SumaOp;
        System.out.println("Sueldo constructores: "+ SumaCt);
        System.out.println("Sueldo consultores: "+ SumaCl);
        System.out.println("Sueldo operarios: "+ SumaOp);
        System.out.println("Sueldo total: "+ SumaTt);
    }   

    private static void ConsultorMasHoras(ArrayList<Consultor> Consultores) {
    
        if (Consultores.get(0).getHorasTrabajadas()>Consultores.get(1).getHorasTrabajadas()){
            System.out.println(Consultores.get(0).getNombre() + " ahora es el nuevo empleado del mes");
        } else {
            System.out.println(Consultores.get(1).getNombre() + " ahora es el nuevo empleado del mes");
        }
    }

    private static void Informe(ArrayList<Operario> Operarios) {
        int SumaOp1 = Operarios.get(1).getHorasTrabajadas()* 50; 
        int SumaOp2 = Operarios.get(0).getHorasTrabajadas()* 50;
        System.out.println("Operario 1:\n"+ Operarios.get(0).getNombre());
        System.out.println(""+ SumaOp1);
        System.out.println("Operario 2:\n"+ Operarios.get(1).getNombre());
        System.out.println(""+ SumaOp2);
    }
    
}