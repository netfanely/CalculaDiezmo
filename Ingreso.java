package caldizimo;
import java.util.Scanner;

public class Ingreso extends Contable {
    
    int codIng;

    public Ingreso(int cd, String dc, double vl){
    	this.codIng   = cd;
    	this.descricao= dc;
    	this.valores  = vl;
    }
    public Ingreso(int c){
        this.codIng = c;
        this.descricao= "";
        this.valores  = 0.00;
    }
    public double getTotal() {
	return total;
    }
    public void setTotal(double total) {
	this.total = total;
    }
    public int getCodIng() {
	return codIng;
    }
    public void setCodIng(int codIng) {
	this.codIng = codIng;
    }
    public String getDescricao() {
	return descricao;
    }
    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }
    public double getValores() {
	return valores;
    }
        
    public void setValores(double valores) {
	this.valores = valores;
    }
    
    public void leedatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme a Descrição:");
        String f = scanner.nextLine();
        this.descricao=f;
        System.out.println("Informe o valor em Reais:");
        double d = scanner.nextDouble();
        this.valores=d;
    }
}
