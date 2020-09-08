package caldizimo;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejecutor {
	
	
	public static void main(String[] args) {
		
	System.out.println("*******     CALCULA DIEZMO MENSAL   v.0.00.001&     *******");
  
	System.out.println("\n*****   INGRESOS");
        Ingreso i1 = new Ingreso(1);
        Ingreso i2 = new Ingreso(2);
        Ingreso i3 = new Ingreso(3);
        
        i1.leedatos(); // Ingreso(1,"Salario",1800);
        i2.leedatos(); // Ingreso(2,"Cheque",400);
        i3.leedatos(); // Ingreso(3,"otros",100);
  
        ListaIngreso li= new ListaIngreso();
        boolean a = li.adiciono(i1);
        boolean b = li.adiciono(i2);
        boolean c = li.adiciono(i3);
        
        System.out.println(li.relatorio());        
        double ingreso=li.sumaValores();
        System.out.println("       TOTAL Ingreso : R$   "+ingreso);
        
           

        
        System.out.println("\n*****  EGRESOS");
        Egreso e1 = new Egreso(1);
        Egreso e2 = new Egreso(2);
        Egreso e3 = new Egreso(3);
        Egreso e4 = new Egreso(4);
        Egreso e5 = new Egreso(5);
        
        e1.leedatos();   //Egreso(1,"servicios",200);
	e2.leedatos();   //Egreso(2,"impostos",400);
        e3.leedatos();   //Egreso(3,"alimentacao",600);
        e4.leedatos();   //Egreso(4,"transporte",150);
        e5.leedatos();   //Egreso(5,"otros",100);
        
        ListaEgreso le= new ListaEgreso();
        boolean d = le.adiciono(e1);
        boolean e = le.adiciono(e2);
        boolean f = le.adiciono(e3);
        boolean g = le.adiciono(e4);
        boolean h = le.adiciono(e5);
        
        System.out.println(le.relatorio());        
        double egreso = le.sumaValores();
        System.out.println("       TOTAL Egreso : R$   "+egreso);		
				
				
				
	System.out.println("SALDO");
	double saldo = ingreso - egreso;
	System.out.println("                 R$   "+saldo);
		
	System.out.println("\n*******      DIEZMO      ********");
	    
	//Calculo sin Descuento
	double diezmo1 = 0.10*ingreso;
	//Calculo con Descuento
	double diezmo2 = 0.10*saldo;
	//
	System.out.println(" Diezmo sin Descuento : R$   "+diezmo1);
	System.out.println(" Diezmo con Descuento : R$   "+diezmo2);
	System.out.println("--");	
	}

}
