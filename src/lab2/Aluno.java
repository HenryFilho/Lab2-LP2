package lab2;

import java.util.ArrayList;

public class Aluno {
	
	private ArrayList<ContaLaboratorio> laboratorios;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<ContaCantina> cantinas;
	private Saude saude;
	
	public Aluno() {
		
		this.laboratorios = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
		this.cantinas = new ArrayList<>();
		this.saude = new Saude();
		
	}
	/* ========================================================
	 * 
	 *                      LABORATORIOS
	 * 
	 * ========================================================
	 */
	
	public void cadastraLaboratorio(String nomeLaboratorio) {
		
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio));
		
	}
	
	
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		
		this.laboratorios.add(new ContaLaboratorio(nomeLaboratorio, cota));
		
	}
	
	
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		
		for (int i = 0; i < this.laboratorios.size(); i++) {
			
			if (this.laboratorios.get(i).nomeLaboratorio.equals(nomeLaboratorio)) {
				
				this.laboratorios.get(i).consomeEspaco(mbytes);
				
			}
			
		}
		
	}
	
	
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		
		for (int i = 0; i < this.laboratorios.size(); i++) {
			
			if (this.laboratorios.get(i).nomeLaboratorio.equals(nomeLaboratorio)) {
				
				this.laboratorios.get(i).liberaEspaco(mbytes);
				
			}
			
		}
		
	}
	
	
	public boolean atingiuCota(String nomeLaboratorio) {
		
		for (int i = 0; i < this.laboratorios.size(); i++) {
			
			if (this.laboratorios.get(i).nomeLaboratorio.equals(nomeLaboratorio)) {
				
				return this.laboratorios.get(i).atingiuCota();
				
			}
			
		}
		
		return false;
		
	}
	
	
	public String laboratorioToString(String nomeLaboratorio) {

		for (int i = 0; i < this.laboratorios.size(); i++) {
			
			if (this.laboratorios.get(i).nomeLaboratorio.equals(nomeLaboratorio)) {
				
				return this.laboratorios.get(i).toString();
				
			}
			
		}
		
		return "";
		
	}
	
	/* ========================================================
	 * 
	 *                      DISCIPLINAS
	 * 
	 * ========================================================
	 */
	
	public void cadastraDisciplina(String nomeDisciplina) {
		
		this.disciplinas.add(new Disciplina(nomeDisciplina));
		
	}
	
	
	public void cadastraDisciplina(String nomeDisciplina, int qtdNotas) {
		
		this.disciplinas.add(new Disciplina(nomeDisciplina, qtdNotas));
		
	}
	
	
	public void cadastraDisciplina(String nomeDisciplina, int qtdNotas, int[] pesos) {
		
		this.disciplinas.add(new Disciplina(nomeDisciplina, qtdNotas, pesos));
		
	}
	
	
	public void cadastraHoras(String nomeDisciplina, int horas) {
		
		for (int i = 0; i < this.disciplinas.size(); i++) {
			
			if (this.disciplinas.get(i).nomeDisciplina.equals(nomeDisciplina)) {
				
				this.disciplinas.get(i).cadastraHoras(horas);
				
			}
			
		}
		
	}
	
	
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		
		for (int i = 0; i < this.disciplinas.size(); i++) {
			
			if (this.disciplinas.get(i).nomeDisciplina.equals(nomeDisciplina)) {
				
				this.disciplinas.get(i).cadastraNota(nota, valorNota);
				
			}
			
		}
		
	}
	
	
	public boolean aprovado(String nomeDisciplina) {
		
		for (int i = 0; i < this.disciplinas.size(); i++) {
			
			if (this.disciplinas.get(i).nomeDisciplina.equals(nomeDisciplina)) {
				
				return this.disciplinas.get(i).aprovado();
				
			}
			
		}
		
		return false;
		
	}
	
	
	public String disciplinaToString(String nomeDisciplina) {
		
		for (int i = 0; i < this.disciplinas.size(); i++) {
			
			if (this.disciplinas.get(i).nomeDisciplina.equals(nomeDisciplina)) {
				
				return this.disciplinas.get(i).toString();
				
			}
			
		}
		
		return "";
		
	}

	/* ========================================================
	 * 
	 *                      CANTINAS
	 * 
	 * ========================================================
	 */
	
	public void cadastraCantina(String nomeCantina) {
		
		this.cantinas.add(new ContaCantina(nomeCantina));
		
	}
	
	
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {

		for (int i = 0; i < this.cantinas.size(); i++) {
			
			if (this.cantinas.get(i).nomeDaCantina.equals(nomeCantina)) {
				
				this.cantinas.get(i).cadastraLanche(qtdItens, valorCentavos);
				
			}
			
		}
		
	}
	
	
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos, String detalhes) {

		for (int i = 0; i < this.cantinas.size(); i++) {
			
			if (this.cantinas.get(i).nomeDaCantina.equals(nomeCantina)) {
				
				this.cantinas.get(i).cadastraLanche(qtdItens, valorCentavos, detalhes);
				
			}
			
		}
		
	}
	
	
	public void pagarConta(String nomeCantina, int valorCentavos) {
		
		for (int i = 0; i < this.cantinas.size(); i++) {
			
			if (this.cantinas.get(i).nomeDaCantina.equals(nomeCantina)) {
				
				this.cantinas.get(i).pagaConta(valorCentavos);
				
			}
			
		}
		
	}
	
	
public String listarDetalhes(String nomeCantina) {
		
		for (int i = 0; i < this.cantinas.size(); i++) {
			
			if (this.cantinas.get(i).nomeDaCantina.equals(nomeCantina)) {
				
				return this.cantinas.get(i).listarDetalhes();
				
			}
			
		}
		
		return "";
		
	}
	
	public String cantinaToString(String nomeCantina) {
		
		for (int i = 0; i < this.cantinas.size(); i++) {
			
			if (this.cantinas.get(i).nomeDaCantina.equals(nomeCantina)) {
				
				return this.cantinas.get(i).toString();
				
			}
			
		}
		
		return "";
		
	}
	
	/* ========================================================
	 * 
	 *                      SAUDE
	 * 
	 * ========================================================
	 */
	
	public void defineSaudeMental(String valor) {
		
		this.saude.defineSaudeMental(valor);
		
	}
	
	
	public void defineSaudeFisica(String valor) {
		
		this.saude.defineSaudeFisica(valor);
		
	}
	
	
	public void definirEmoji(String valor) {
		
		this.saude.definirEmoji(valor);
		
	}
	
	
	public String getStatusGeral() {
		
		return this.saude.getStatusGeral();
		
	}
	
	
}
