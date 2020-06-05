package day_3;

public class StringManipulations3 {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir sumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		String cumle = "I love Java";
		int ilkDurak =cumle.indexOf(" ");
		int sonraki = cumle.indexOf(" ",ilkDurak+1);
		int sonDurak = cumle.lastIndexOf(" ");
		System.out.println(sonraki);
		
		String reverse = cumle.substring(sonDurak+1)+cumle.substring(ilkDurak,sonDurak+1)+cumle.substring(0,ilkDurak);
		System.out.println(reverse);
		
		
	}
	
}
