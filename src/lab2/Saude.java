package lab2;

public class Saude {
	
	private String saudeMental;
	private String saudeFisica;
	private String emoji;
	
	public Saude() { this.saudeMental = "boa"; this.saudeFisica = "boa"; this.emoji = ""; }
	
	public void defineSaudeMental(String valor) { this.saudeMental = valor; this.emoji = ""; }
	
	public void defineSaudeFisica(String valor) { this.saudeFisica = valor; this.emoji = ""; }
	
	public void definirEmoji(String valor) { this.emoji = valor; }
	
	
	public String getStatusGeral() { 
		
		if (!(this.emoji.equals(""))) { return this.emoji; }
		else if (this.saudeMental.equals("boa") && this.saudeFisica.equals("boa")) { return "boa"; }
		else if (this.saudeMental.equals("boa") || this.saudeFisica.equals("boa")) { return "ok"; }
		else { return "fraca"; }
		
	}
	
}
