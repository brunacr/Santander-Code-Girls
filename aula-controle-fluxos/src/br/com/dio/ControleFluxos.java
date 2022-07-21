package br.com.dio;

public class ControleFluxos {

	public static void main(String[] args) {
		
		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNumero();
		switchFerias();
	}
	
	//Efeito que deve ser evitado
	private static void ifFlecha() {
		
		int mes = 4;
		
		if (mes == 1) {
			System.out.println("Janeiro");
		
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
		
			} else {
				if (mes == 3) {
					System.out.println("Mar�o");
		
				} else {
					if (mes == 4) {
						System.out.println("Abril");
		
					} else {
						System.out.println("M�s indefinido");
					}
				}
			}
		}
	}
	
	private static void ifSemFlecha() {
		
		int mes = 4;
		
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Mar�o");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else {
			System.out.println("M�s indefinido");
		}
	}
	
	private static void ifFerias() {
		
		String mes = "Julho";
		if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("F�rias");
		}
	}
	
	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		//Deve ser evitado
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if (recebeAuxilio) {
			System.out.println("Funcion�rio deve receber aux�lio.");
		} else {
			System.out.println("Funcion�rio n�o recebe aux�lio.");
		}
	}
	
	private static void switchSemana() {
		
		String dia = "Ter�a";
		
		switch (dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Ter�a":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "S�bado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
			System.out.println("Dia inv�lido.");
			break;
		}
	}
	
	private static void switchNumero() {
		
		int numero = 4;
		
		switch (numero) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4:
				System.out.println("Errado");
				break;
			case 5:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Valor indefinido");
				break;
		}
	}
	
	private static void switchFerias() {
		
		String mes = "Dezembro";
		
		switch (mes) {
			case "Dezembro":
			case "Julho":
			case "Janeiro":
				System.out.println("F�rias");
				break;
			default:
				System.out.println("M�s indefinido");
				break;
		}
	}
	
}	
				
				
			

