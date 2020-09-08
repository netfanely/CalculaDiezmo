package caldizimo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class ListaIngreso {
	ArrayList <Ingreso> listaIng = new  ArrayList<>();

    public double sumaValores(){
    double sum=0;
    Iterator i = listaIng.iterator();
    Ingreso Ing;
    while(i.hasNext()){
       Ing=(Ingreso) i.next();
       if(Ing instanceof Ingreso) sum=sum+Ing.getValores();
   }
    return sum;
   }
    public boolean adiciono(Ingreso ii){       
        listaIng.add(ii);
        return true;
    }
    public String relatorio(){
        String datos="";
        Iterator i = listaIng.iterator();
        Ingreso ii;
        System.out.println("\nCod     Descricao    Valor R$");
        System.out.println("====     =========    ========");
        while(i.hasNext()){
           ii=(Ingreso) i.next();
             datos+="\n  "+ii.getCodIng()
                   +"       "+ ii.getDescricao() 
                   +"           "+ ii.getValores();
        }
        return datos;
    }
}