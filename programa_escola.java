package programa_escola;

import java.util.Scanner;

public class Escola_notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String professor;
		String aluno;
		float nota1;
		float nota2;
		float media;
		
		System.out.println("Digite o nome do professor: ");
		professor = sc.nextLine();
		
		System.out.println("Digite o nome do aluno(a): ");
		aluno = sc.nextLine();
		
		System.out.println("Digite a nota do primeiro semestre: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a nota do segundo semestre: ");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("\n--------DADOS DO ALUNO-------");
		System.out.println("Nome: " + aluno);
		System.out.println("Nome do professor: " + professor);
		System.out.println("Nota do primeiro semestre: " + nota1);
		System.out.println("Nota do segundo semestre: " + nota2);
		System.out.println("Media do aluno: " + media);
		
		sc.close();
	}
}


