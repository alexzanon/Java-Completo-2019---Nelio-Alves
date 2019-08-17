package course;

public class Program12 {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();//todos minusculos
		String s02 = original.toUpperCase();//todos maiusculos
		String s03 = original.trim();//elimina espacos em branco no fim
		String s04 = original.substring(2);//recorta da posicao 2 em diante (comeca 0)
		String s05 = original.substring(2, 9);//corta da posicao 2 ate a posicao 9
		String s06 = original.replace('a', 'x');//troca o a pelo x (case sensitive)
		String s07 = original.replace("abc", "xy");//troca abc por xy
		int i = original.indexOf("bc");//em que posicao ocorre o primeiro bc
		int j = original.lastIndexOf("bc");//ultima posicao em que ocorre o bc
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace(a, x): -" + s06 + "-");
		System.out.println("replace(abc, xy): -" + s07 + "-");
		System.out.println("indexof(bc): -" + i + "-");
		System.out.println("lastindexof(bc): -" + j + "-");
	}

}
