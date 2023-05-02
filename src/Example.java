import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
//		System.out.println("HELLO!");
////		boolean z = true;
//		double num = 0.66;
////		char singleCharacter = 'a';
//		final int x = 10;
//		int y = 500;
//		double w = y;
//		byte myByte = (byte) y;
//		System.out.println("Byte:" + myByte);
//		long myLong = 10000000;
//		y = (int) myLong;
//		int newInt = (int) num;
//		System.out.println(w);
//		System.out.println(myLong);
//		System.out.println(newInt);

//		System.out.println(x * y);

		// ****************** STRINGHE ********************************

//		String testo = "Ciao a tutti";
//		System.out.println(testo + " !");
//		System.out.println("La lunghezza della stringa è: " + testo.length());
//		System.out.println("Il primo carattere della stringa è " + testo.charAt(0));
//		System.out.println(testo.replaceAll("tutti", "nessuno"));
//
//		// ******************** ARRAY *****************************
		String[] arrayDiStringhe = { "ciao", "a", "tutti" };
		System.out.println(Arrays.toString(arrayDiStringhe)); // PER STAMPARE IN CONSOLE UN ARRAY DEVO CONVERTIRLO IN
																// STRINGA
//		for (int i = 0; i < arrayDiStringhe.length; i++) {
//			System.out.println(arrayDiStringhe[i]);
//		}


//		int risultato = sum(2, 3);
//		System.out.println(risultato);
//		printSum(2, 3);

		// ************************** SCANNER *******************************

//		Scanner in = new Scanner(System.in);
////		System.out.println("Inserisci il tuo nome!");
////		String name = in.nextLine();
////		System.out.println("Hai inserito:" + name);
//		System.out.println("Dammi un numero intero");
//		int num = in.nextInt();
//		System.out.println("Dammi un altro numero intero");
//		int num2 = in.nextInt();
//		int risultato = num + num2;
//		System.out.println("La somma dei numeri inseriti è: " + risultato);
//		in.close(); // NON DIMENTICARE DI CHIUDERE LO SCANNER
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}

}
