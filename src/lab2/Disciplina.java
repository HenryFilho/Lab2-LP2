package lab2;

import java.util.Arrays;

public class Disciplina {
	
	public String nomeDisciplina;
	private int horas;
	private double[] notas;
	private int[] pesos;
	private int pesoTotal;
	
	
	public Disciplina(String nomeDisciplina) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
		this.pesos = new int[4];
		for (int i = 0; i < 4; i++) { pesos[i] = 1; }
		this.pesoTotal = 4;
		
	}
	
	
	public Disciplina(String nomeDisciplina, int qtdNotas) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[qtdNotas];
		this.pesos = new int[qtdNotas];
		for (int i = 0; i < this.pesos.length; i++) { pesos[i] = 1; }
		this.pesoTotal = qtdNotas;
		
	}
	
	
	public Disciplina(String nomeDisciplina, int qtdNotas, int[] pesos) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[qtdNotas];
		this.pesos = pesos;
		this.pesoTotal = 0;
		for (int i = 0; i < pesos.length; i++) { this.pesoTotal += pesos[i]; }
		
	}
	
	
	public void cadastraHoras(int horas) { this.horas = horas; }
	
	public void cadastraNota(int nota, double valorNota) { this.notas[nota-1] = valorNota; }
	
	
	public boolean aprovado() {
		
		if (media() >= 7.0) { return true; }
		else { return false; }
		
	}
	
	
	public String toString() {
		return (this.nomeDisciplina + " " + this.horas + " " + media() + " " + Arrays.toString(this.notas));
	}
	
	
	private double media() {
		
		double media = 0;
		for (int i = 0; i < this.notas.length; i++) { media += this.notas[i] * this.pesos[i]; }
		media /= this.pesoTotal;
		return media;
		
	}
	
}
