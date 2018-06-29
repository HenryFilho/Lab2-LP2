package lab2;

public class ContaCantina {
	
	public String nomeDaCantina;
	private int consumoItens;
	private int conta;
	private String[] detalhes;
	
	public ContaCantina(String nomeDaCantina) {
		
		this.nomeDaCantina = nomeDaCantina;
		this.consumoItens = 0;
		this.conta = 0;
		this.detalhes = new String[5];
		for (int i = 0; i < 5; i++) { this.detalhes[i] = ""; }
		
	}
	
	
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		
		this.consumoItens += qtdItens;
		this.conta += (valorCentavos * qtdItens);
		
	}
	
	
	public void cadastraLanche(int qtdItens, int valorCentavos, String detalhes) {
		
		this.consumoItens += qtdItens;
		this.conta += (valorCentavos * qtdItens);
		
		for (int i = 0; i < 4; i++) { this.detalhes[i] = this.detalhes[i+1]; }
		this.detalhes[4] = detalhes;
		
	}
	
	
	public void pagaConta(int valorCentavos) { this.conta -= valorCentavos; }
	
	
	public String listarDetalhes() {
		
		String resposta = "";
		
		for (int i = 0; i < 4; i++) {
			
			if (!(this.detalhes[i].equals(""))) {
				
				resposta += this.detalhes[i] + "\n";
				
			}
			
		}
		resposta += this.detalhes[4];
		
		
		return resposta;
		
	}
	
	
	public String toString() {
		
		return (this.nomeDaCantina + " " + this.consumoItens + " " + this.conta);
		
	}
	
	
}
