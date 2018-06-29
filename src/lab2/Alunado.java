package lab2;

public class Alunado {
	
	private Aluno[] alunos;
	
	public Alunado() {
		
		alunos = new Aluno[1000];
		for (int i = 0; i < 1000; i++) { alunos[i] = new Aluno(); }
		
	}
	
	public void defineAluno(String[] entrada) {
		
		if (entrada[2].equals("lab") && entrada.length == 4) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraLaboratorio(entrada[3]);
		} else if (entrada[2].equals("lab") && entrada.length == 5) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraLaboratorio(entrada[3], Integer.parseInt(entrada[4]));
		} else if (entrada[2].equals("dis") && entrada.length == 4) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraDisciplina(entrada[3]);
		} else if (entrada[2].equals("dis") && entrada.length == 5) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraDisciplina(entrada[3], Integer.parseInt(entrada[4]));
		} else if (entrada[2].equals("dis") && entrada.length >= 6) {
			int[] pesos = new int[entrada.length - 5];
			for (int i = 5; i < entrada.length; i++) { pesos[i-5] = Integer.parseInt(entrada[i]); }
			this.alunos[Integer.parseInt(entrada[1])].cadastraDisciplina(entrada[3], Integer.parseInt(entrada[4]), pesos);
		} else if (entrada[2].equals("can")) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraCantina(entrada[3]);
		} else {
			System.out.println("comando desconhecido");
		}
		
	}

	public void modificarAluno(String[] entrada) {
		
		if (entrada[2].equals("lab") && entrada[4].equals("consome")) {
			this.alunos[Integer.parseInt(entrada[1])].consomeEspaco(entrada[3], Integer.parseInt(entrada[5]));
		} else if (entrada[2].equals("lab") && entrada[4].equals("libera")) {
			this.alunos[Integer.parseInt(entrada[1])].liberaEspaco(entrada[3], Integer.parseInt(entrada[5]));
		} else if (entrada[2].equals("dis") && entrada[4].equals("horas")) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraHoras(entrada[3], Integer.parseInt(entrada[5]));
		} else if (entrada[2].equals("dis") && entrada[4].equals("nota")) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraNota(entrada[3], Integer.parseInt(entrada[5]), Double.parseDouble(entrada[6]));
		} else if (entrada[2].equals("can") && entrada[4].equals("lanche") && entrada.length == 7) {
			this.alunos[Integer.parseInt(entrada[1])].cadastraLanche(entrada[3], Integer.parseInt(entrada[5]), Integer.parseInt(entrada[6]));
		} else if (entrada[2].equals("can") && entrada[4].equals("lanche") && entrada.length >= 8) {
			String detalhes = "";
			for (int i = 7; i < entrada.length; i++) { detalhes += entrada[i] + " "; }
			this.alunos[Integer.parseInt(entrada[1])].cadastraLanche(entrada[3], Integer.parseInt(entrada[5]), Integer.parseInt(entrada[6]), detalhes);
		} else if (entrada[2].equals("can") && entrada[4].equals("pagar")) {
			this.alunos[Integer.parseInt(entrada[1])].pagarConta(entrada[3], Integer.parseInt(entrada[5]));
		} else if (entrada[2].equals("sad") && entrada[3].equals("mental")) {
			this.alunos[Integer.parseInt(entrada[1])].defineSaudeMental(entrada[4]);
		} else if (entrada[2].equals("sad") && entrada[3].equals("fisica")) {
			this.alunos[Integer.parseInt(entrada[1])].defineSaudeFisica(entrada[4]);
		} else if (entrada[2].equals("sad") && entrada[3].equals("emoji")) {
			this.alunos[Integer.parseInt(entrada[1])].definirEmoji(entrada[4]);
		} else {
			System.out.println("comando desconhecido");
		}
		
	}

	public void chamarAluno(String[] entrada) {
		
		if (entrada[2].equals("lab")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].atingiuCota(entrada[3]));
		} else if (entrada[2].equals("dis")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].aprovado(entrada[3]));
		} else if (entrada[2].equals("can")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].listarDetalhes(entrada[3]));
		} else if (entrada[2].equals("sad")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].getStatusGeral());
		} else {
			System.out.println("comando desconhecido");
		}
		
	}

	public void chamarToString(String[] entrada) {
		
		if (entrada[2].equals("lab")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].laboratorioToString(entrada[3]));
		} else if (entrada[2].equals("dis")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].disciplinaToString(entrada[3]));
		} else if (entrada[2].equals("can")) {
			System.out.println(this.alunos[Integer.parseInt(entrada[1])].cantinaToString(entrada[3]));
		} else {
			System.out.println("comando desconhecido");
		}
		
	}
	
}
