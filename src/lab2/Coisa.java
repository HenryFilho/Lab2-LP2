
/**
 * Laboratório de Programação 2 - Lab 2
 * Controle Institucional da Situação Acadêmica (COISA)
 * 
 * @author Henry Filho - 117210389
 * 
 */

package lab2;
import java.util.Scanner;

/*
 *     Sobre o COISA:
 * 
 * O COISA é um sistema capaz de gerenciar o uso dos laboratórios de Ciência da Computação (LCC’s) e sua vida acadêmica.
 * 
 * A vida do aluno pode ser organizada em quatro atividades básicas: organizar suas contas nos LCCs, estudar para as disciplinas,
 * organizar suas contas nas cantinas e acompanhar sua saúde física e mental. Para permitir o controle dessas 4 atividades, o
 * sistema lhepermite avaliar o quanto de espaço você tem usado de um laboratório, o quanto de horas você tem estudado, como está
 * sua conta (e o quanto você tem comido) nas cantinas da universidade e, por fim, como está sua saúde física e mental (e por
 * consequência, sua saúde geral).
 * Assim, para cada uma das atividades, é descrito um conjunto de valores referentes a cada atividade e de ações que podem ser
 * feitas para aquela atividade.
 * 
 *     Como usar:
 * 
 * O COISA utiliza uma sintaxe simples de comandos, seguindo este modelo (com algumas exceções):
 * <comando> <indice do Aluno> <atividade> <nome da atividade> <parâmetros>
 * 
 * 1. Comando:
 * 
 * Existem quatro possíveis comandos: def, utilidado para definir uma nova atividade; mod, utilizado para chamar métodos que
 * modificam uma certa atividade; cal, utilizado para chamar métodos que imprimem algum retorno; ts, utilizado para imprimir
 * os dados de uma atividade.
 * 
 * 2. Indice do Aluno:
 * 
 * Um indice no qual você armazena atividades relacionadas a um aluno em específico. Os valores possíveis são de 0 à 999.
 * 
 * 3. Atividade:
 * 
 * Existem quatro possíveis atividades: lab, que administra seu consumo de memória em algum laboratório; dis, que administra suas
 * notas em alguma disciplina; can, que administra sua conta na cantina; sad, que administra sua saúde física e mental.
 * 
 * 4. Nome da Atividade e Parâmetros:
 * 
 * Toda atividade precisa ser armazenada com um nome (com exceção de sad) sem espaços que você atribui, e os parâmetros são
 * específicos para cada método.
 * 
 *     Possíveis comandos:
 * 
 * def <Indice do Aluno> lab <Nome do Laboratório> <cota>
 *     Registra uma conta de Laboratório. Cota opcional, 2000 por padrão.
 *     
 * def <Indice do Aluno> dis <Nome da Disciplina> <Quantidade de Notas> <Pesos>
 *     Registra uma disciplina. Quantidade de Notas e Pesos são opcionais, padrão 4 e 1 1 1 1, respectivamente.
 * 
 * def <Indice do Aluno> can <Nome da Cantina>
 *     Registra sua conta em uma cantina.
 * 
 * mod <Indice do Aluno> lab <Nome do Laboratório> consome <quantia>
 *     Registra que uma quantia da memória (em mb) foi consumida.
 *     
 * mod <Indice do Aluno> lab <Nome do Laboratório> libera <quantia>
 *     Registra que uma quantia da memória (em mb) foi liberada.
 * 
 * mod <Indice do Aluno> dis <Nome da Disciplina> horas <quantia>
 *     Registra que você estudou uma quantia de horas para tal disciplina.
 * 
 * mod <Indice do Aluno> dis <Nome da Disciplina> nota <qual> <valor>
 *     Registra uma nota no sistema. Troque <qual> pelo número da prova (podem ser substituidas depois) e <valor> pela sua nota.
 * 
 * mod <Indice do Aluno> can <Nome da Cantina> lanche <Quantidade de Itens> <Valor> <Detalhes>
 *     Registra um lanche que tenha feito em uma determinada cantina. Valor em Centavos.
 *     Detalhes são observações adicionais que você queira adicionar.
 * 
 * mod <Indice do Aluno> can <Nome da Cantina> pagar <valor>
 *     Registra que você pagou uma certa quantia (valor, em centavos) da sua conta em uma determinada cantina.
 * 
 * mod <Indice do Aluno> sad mental <Valor>
 *     Atribui um valor a sua saude mental. Pode ser "boa" ou "fraca". (Valores diferentes desses serão considerados "fraca"
 *     durante o cálculo de saúde geral.)
 * 
 * mod <Indice do Aluno> sad fisica <Valor>
 *     Atribui um valor a sua saude física. Pode ser "boa" ou "fraca". (Valores diferentes desses serão considerados "fraca"
 *     durante o cálculo de saúde geral.)
 * 
 * mod <Indice do Aluno> sad emoji <Valor>
 *     Atribui um valor personalizado a sua saude geral. Reseta quando a saude física ou mental são alteradas.
 * 
 * cal <Indice do Aluno> lab <Nome do Laboratório>
 *     Imprime um valor booleano que indica se você atingiu a cota de armazenamento no laboratório ou não.
 *     
 * cal <Indice do Aluno> dis <Nome da Disciplina>
 *     Imprime um valor booleano que indica se você está passado com as notas atuais.
 *     
 * cal <Indice do Aluno> can <Nome da Cantina>
 *     Imprime as cinco últimas observações registradas na cantina.
 * 
 * cal <Indice do Aluno> sad
 *     Imprime sua saude geral.
 * 
 * ts <Indice do Aluno> lab <Nome do Laboratório>
 *     Imprime "<Nome do Laboratório> <Total Consumido>/<Cota>"
 * 
 * ts <Indice do Aluno> dis <Nome da Disciplina>
 *     Imprime "<Nome da Disciplina> <Horas> <Média> <Notas>"
 * 
 * ts <Indice do Aluno> can <Nome da Cantina>
 *     Imprime "<Nome da Cantina> <Itens Consumidos> <Conta>"
 */


public class Coisa {
	public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
    	Alunado alunado = new Alunado();
    	
    	String[] entrada;
    	while (true) {
    		entrada = sc.nextLine().split(" ");
    		if (entrada[0].equals("exit")) { break; }
    		
    		
    		if (entrada[0].equals("def")) { alunado.defineAluno(entrada); }
    		else if (entrada[0].equals("mod")) { alunado.modificarAluno(entrada); }
    		else if (entrada[0].equals("cal")) { alunado.chamarAluno(entrada); }
    		else if (entrada[0].equals("ts")) { alunado.chamarToString(entrada); }
    		else { System.out.println("comando desconhecido"); }
    	}
    }
   
}