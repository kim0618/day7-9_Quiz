import java.util.ArrayList;

public class Quiz13_ABCabc {
	public static void main(String[] args) {
		
		// 1번
		String str = new String("Have a nice day Have a nice day Have a nice day");
		ArrayList ass = new ArrayList();
		int i=0;
		for(i = 0; i<str.length();i++) {
			if(str.charAt(i)== 'a') {
				ass.add(i);
			}	
		}System.out.print("결과 : "+ass);
		System.out.println();
	
		// 2번
		String str1 = new String("It is a fun java programming");
		int j=0;
		int a=0,g=0;
		
		while(j<str1.length()) {
			if(str1.charAt(j)=='a') {
				a++;
			}else if(str1.charAt(j)=='g') {
				g++;
			}
			j++;
		}
		System.out.println("총 개수 : "+ str1.length());
		System.out.println("a 개수 : "+a);
		System.out.println("g 개수 : "+g);
		System.out.println();
		
		// 3번
		
		String str3 = new String("tESt aTring    change     first");
		String chStr = new String();
		str3 = str3.toLowerCase();
		
		
		
		
		
		
		
		
		
		
		
	}
}
