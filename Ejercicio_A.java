package Concurso_Navidad;

import java.util.Scanner;

public class Ejercicio_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int casos = sc.nextInt();
		
		int posicion = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			
			int bomba1 =sc.nextInt();
			int bomba2 = sc.nextInt();
			
			int resultado = 0;
			int resultado2 = 0;
			int res_final= 0;
			int res_bomba1 = 0;
			int res_bomba2 = 0;
			
			
			
			
			if (bomba1> posicion && bomba2 > posicion) {
				
				 int bomba_mayor = 0;
				 if (bomba1> bomba2) {
					bomba_mayor = bomba1;
				}else {
					bomba_mayor = bomba2;
				}
				
				 System.out.println(Math.abs(posicion - bomba_mayor));
			
			}
			else {
					
					resultado = Math.abs(posicion - bomba1);
					resultado2 = Math.abs( posicion - bomba2);
					
					if (resultado<resultado2) {
						
						res_bomba1 = posicion - bomba1;
						res_bomba2 = Math.abs(bomba1 - bomba2);
						
						res_final = res_bomba1 + res_bomba2;
						
					}
					
					System.out.println(res_final);
				 
				
			}
			
			
			
		}
			
	}

}
