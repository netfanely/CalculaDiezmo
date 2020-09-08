package caldizimo;

import java.util.Scanner;

public class Egreso  extends Contable {
    double total;
    int codEgr;
    String descricao;
    double valores;
    
    public Egreso(int cc,String dd, double vv){
    	this.codEgr=cc;
    	this.descricao=dd;
    	this.valores=vv;
    }
    public Egreso(int c){
        this.codEgr = c;
        this.descricao= "";
        this.valores  = 0.00;
    }
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getCodEgr() {
		return codEgr;
	}
    public void setCodEgr(int codEgr) {
		this.codEgr = codEgr;
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
