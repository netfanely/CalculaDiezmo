package caldizimo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class ListaEgreso {
	ArrayList <Egreso> listaEgr = new  ArrayList<>();

    public double sumaValores(){
    double sum=0;
    Iterator i = listaEgr.iterator();
    Egreso Egr;
    while(i.hasNext()){
       Egr=(Egreso) i.next();
       if(Egr instanceof Egreso) sum=sum+Egr.getValores();
   }
    return sum;
   }
    public boolean adiciono(Egreso ee){       
        listaEgr.add(ee);
        return true;
    }
    public String relatorio(){
        String datos="";
        Iterator i = listaEgr.iterator();
        Egreso ee;
        System.out.println("\nCod     Descricao    Valor R$");
        System.out.println("====     =========    ========");
        while(i.hasNext()){
           ee=(Egreso) i.next();
             datos+="\n  "+ee.getCodEgr()
                   +"       "+ ee.getDescricao() 
                   +"           "+ ee.getValores();
        }
        return datos;
    }
}
