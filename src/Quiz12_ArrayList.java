import java.util.ArrayList;
import java.util.Scanner;

public class Quiz12_ArrayList {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			ArrayList name = new ArrayList();
			ArrayList phone = new ArrayList();
			String n,p;
			int num;
			
			while(true) {
				System.out.println("1.����ó ���");
				System.out.println("2.����ó ����");
				System.out.println("3.����ó ����");
				System.out.println("4.��� ����ó ����");
				System.out.println("5.����");
				System.out.println(">>> ");
				num = input.nextInt();
				if(num == 5) {
					System.out.println("���α׷� ����");
					break;
				}
				switch(num) {
				case 1:
					System.out.println("�̸� �Է� : ");
					n = input.next();
					if(name.indexOf(n) == -1) {
						System.out.println("����ó �Է� : ");
						p = input.next();
						name.add(n);
						phone.add(p);
					}else {
						System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
					}
					break;
				case 2:
					System.out.println("ã�� �̸� �Է� : ");
					n = input.next();
					if(name.indexOf(n)== -1) {
						System.out.println(n+"���� ��Ͽ� �����ϴ�.");
					}else {
						System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
					}
					break;
				case 3:
					System.out.println("���� �� �̸� : ");
					n = input.next();
					if(name.indexOf(n)==-1) {
						System.out.println("������ �̸��� �����ϴ�.");
					}else {
						System.out.print(name.remove(name.indexOf(n))+" : ");
						System.out.println(phone.remove(name.indexOf(n)));
					}
					break;
				case 4: 
					for(int i = 0; i<name.size();i++) {
						System.out.println(name.get(i)+" : "+phone.get(i));
						
					}break;
					
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
