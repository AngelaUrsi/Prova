package Name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il nome");
		String nome = in.next() ;
		System.out.println("Inserisci il cognome");
		String cognome = in.next() ;
		System.out.println("inserisci sesso (Maschio o Femmina)");
		String sesso = in.next();
		String iniziale = nome.substring(0,1);
		String iniziale2 = cognome.substring(0,1);
		Iniziali(iniziale , iniziale2);
		System.out.println("ORDINE NOME COGNOME");
		NoCo(nome,cognome);
		System.out.println("ORDINE COGNOME NOME");
		CoNo(nome,cognome);

	}
	public static void Iniziali(String iniziale , String iniziale2){

		System.out.println("iniziale del nome \n" + iniziale);
		System.out.println("iniziale del nome \n" + iniziale2);
	}
	public static void NoCo(String nome , String cognome){
		System.out.println(nome);
		System.out.println(cognome);
	}
	public static void CoNo(String nome , String cognome){
		System.out.println(cognome);
		System.out.println(nome);
	}

	public static void titolo(String sesso, String nome, String cognome){
		if(sesso.equals("Femmina")){
			System.out.println("Sig.na " + cognome + " " + nome);

		}
		if(sesso.equals("Maschio")){

			System.out.println("Sig " + cognome+ " " + nome);
		}

	}

}