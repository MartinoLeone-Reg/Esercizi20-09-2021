package es3;
//14:47 minuti

public class es3 {
	public static void main(String[] args) {
	
		String a ="gino";
		String b ="gino";

		boolean isAnagramma = true;
		if (a.length() == b.length())    
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				int indice = b.indexOf(c);
				if(indice >= 0) {
					System.out.println(b.substring(0,indice) );
					System.out.println(b.substring(indice+1));
					b = b.substring(0,indice) + b.substring(indice+1);
				}else 
					isAnagramma = false;
			}
		else 
			isAnagramma = false;
		if (isAnagramma)
			System.out.println("Anagramma vero!");
		else
			System.out.println("Anagramma falso!");
		}

}
