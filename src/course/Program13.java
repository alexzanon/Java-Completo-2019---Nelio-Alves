package course;

public class Program13 {

	public static void main(String[] args) {

		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");//usa o separador espaco em branco para criar um vetor com as palavras
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
