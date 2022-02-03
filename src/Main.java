import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaini;
		int horafin;
		
		System.out.println("Digite a Hora inicial e a hora final de um jogo");
		horaini = sc.nextInt();
		horafin = sc.nextInt();
		
		
		if(horaini > horafin) {
			System.out.println("O jogo durou " + (24 - (horaini - horafin)) + " Hora(s)");
		} else if (horafin > horaini) {
			System.out.println("O jogo durou " + (horafin - horaini) + " Hora(s)");
		}else {
			System.out.println("O jogo durou 24 hora(s)");
		
		}
					
			
		
		
		
		
		
		sc.close();
		
	}

}
