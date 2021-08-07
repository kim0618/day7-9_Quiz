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
				System.out.println("1.연락처 등록");
				System.out.println("2.연락처 보기");
				System.out.println("3.연락처 삭제");
				System.out.println("4.모든 연락처 보기");
				System.out.println("5.종료");
				System.out.println(">>> ");
				num = input.nextInt();
				if(num == 5) {
					System.out.println("프로그램 종료");
					break;
				}
				switch(num) {
				case 1:
					System.out.println("이름 입력 : ");
					n = input.next();
					if(name.indexOf(n) == -1) {
						System.out.println("연락처 입력 : ");
						p = input.next();
						name.add(n);
						phone.add(p);
					}else {
						System.out.println("이미 존재하는 이름입니다.");
					}
					break;
				case 2:
					System.out.println("찾을 이름 입력 : ");
					n = input.next();
					if(name.indexOf(n)== -1) {
						System.out.println(n+"님은 목록에 없습니다.");
					}else {
						System.out.println(name.get(name.indexOf(n))+" : "+phone.get(name.indexOf(n)));
					}
					break;
				case 3:
					System.out.println("삭제 할 이름 : ");
					n = input.next();
					if(name.indexOf(n)==-1) {
						System.out.println("삭제할 이름이 없습니다.");
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
