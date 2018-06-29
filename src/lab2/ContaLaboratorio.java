package lab2;

public class ContaLaboratorio {
	
	public String nomeLaboratorio;
	private int cota;
	private int consumo;
	
	public ContaLaboratorio(String nomeLaboratorio) {
		
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
		this.consumo = 0;
		
	}
	
	
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
		this.consumo = 0;
		
	}
	
	
	public void consomeEspaco(int mbytes) { this.consumo += mbytes; }
	public void liberaEspaco(int mbytes) { this.consumo -= mbytes; }
	
	
	public boolean atingiuCota() {
		
		if (consumo >= cota) { return true; }
		else { return false; }
		
	}
	
	
	public String toString() {
		return (this.nomeLaboratorio + " " + this.consumo + "/" + this.cota);
	}
	
}
