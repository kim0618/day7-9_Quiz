import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz13_Hashmap {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap ();		
		String name=null,money=null;
		int n1=0,n2=0;
		
		while(true){
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.print(">>> ");
			n1 = input.nextInt();
			if(n1 == 1) {
				System.out.println("�޴� �Է� : ");
				name = input.next();
				if(map.containsKey(name)== false) {
					System.out.println("���� �Է� : ");
					money = input.next();
					map.put(name, money);
					System.out.println("��� �Ϸ�");
				}else {
					System.out.println("�̹� ��ϵ� �޴� �Դϴ�.");
				}
			}else if(n1 == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.���� 2.���� 3.������");
				System.out.print(">>> ");
				n2 = input.nextInt();
				if(n2==1) {
					System.out.println("���� �޴� �Է� : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("���� ���� �Է� : ");
						String newmo;
						newmo=input.next();
						System.out.println(map.get(name)+" -> "+newmo);
						System.out.println("���� �Ϸ� !");
						map.replace(name, newmo);
					}else {
						System.out.println("�޴��� �����ϴ�!");
					}
				}else if(n2 == 2) {
					System.out.println("������ �̸� �Է� : ");
					name = input.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name+"�����Ǿ����ϴ�.");
					}else {
						System.out.println(name+ " �������� �ʽ��ϴ�.");
					}
				}
			}else if(n1 == 3) {
				System.out.println("����");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
