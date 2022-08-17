package Package;

import java.util.Scanner;

@SuppressWarnings("unused")

public class funcao {

	 String nome;
	 double RA,A1,A2,media,frequencia;
	 Scanner ler = new Scanner(System.in);
	 
	 public void Calcularmedia(){
		 
		 System.out.println("Insira no nome do aluno: ");
		 nome = ler.next();
		 
		 System.out.println("Insira a nota A1: ");
		 A1 = Double.parseDouble(ler.next());
		 
		 System.out.println("Insira a nota A2: ");
		 A2 = Double.parseDouble(ler.next());
		 
		 System.out.println("Informe a frequencia: ");
		 frequencia = Double.parseDouble(ler.next());
		 
		 media = (A1 + (2*A2))/3;
		 
		 System.out.println("A nota do Aluno " + nome + " é: " + media);
		 
		 if(frequencia < 75)
			 System.out.println("Reprovado pro frequencia!");
		 else
			 if(media >= 5)
				 System.out.println("Aprovado");
			 else if (media >=3)
				 System.out.println("RE");
			 else
				 System.out.println("Reprovado");
		 

		 
	 }
	
}
