
public class Quiz14_split_string {
	public static void main(String[] args) {
		
		// ���ø�, ���÷��̽� ���
		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		System.out.println("===���� �� str===\n"+str);
		
		str = str.replace("-", ":");
		String[] astr = str.split("\n");
		str = "";
		
		for(int i = 0; i<astr.length;i++) {
			String[] rstr = astr[i].split(":");
			
			rstr[1]= rstr[1].replace(rstr[1],"1999��");
			str =str + rstr[0]+":"+rstr[1]+"\n";
		}System.out.println("===���� �� str===\n"+str);
		
		
		
		
		
		
		
		
		
		
	}
}
