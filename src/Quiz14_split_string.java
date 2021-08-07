
public class Quiz14_split_string {
	public static void main(String[] args) {
		
		// 스플릿, 리플레이스 사용
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("===변경 전 str===\n"+str);
		
		str = str.replace("-", ":");
		String[] astr = str.split("\n");
		str = "";
		
		for(int i = 0; i<astr.length;i++) {
			String[] rstr = astr[i].split(":");
			
			rstr[1]= rstr[1].replace(rstr[1],"1999년");
			str =str + rstr[0]+":"+rstr[1]+"\n";
		}System.out.println("===변경 후 str===\n"+str);
		
		
		
		
		
		
		
		
		
		
	}
}
