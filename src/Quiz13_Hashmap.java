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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>> ");
			n1 = input.nextInt();
			if(n1 == 1) {
				System.out.println("메뉴 입력 : ");
				name = input.next();
				if(map.containsKey(name)== false) {
					System.out.println("가격 입력 : ");
					money = input.next();
					map.put(name, money);
					System.out.println("등록 완료");
				}else {
					System.out.println("이미 등록된 메뉴 입니다.");
				}
			}else if(n1 == 2) {
				Iterator it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.print(">>> ");
				n2 = input.nextInt();
				if(n2==1) {
					System.out.println("변경 메뉴 입력 : ");
					name = input.next();
					if(map.containsKey(name)) {
						System.out.println("수정 가격 입력 : ");
						String newmo;
						newmo=input.next();
						System.out.println(map.get(name)+" -> "+newmo);
						System.out.println("변경 완료 !");
						map.replace(name, newmo);
					}else {
						System.out.println("메뉴가 없습니다!");
					}
				}else if(n2 == 2) {
					System.out.println("삭제할 이름 입력 : ");
					name = input.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name+"삭제되었습니다.");
					}else {
						System.out.println(name+ " 존재하지 않습니다.");
					}
				}
			}else if(n1 == 3) {
				System.out.println("종료");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
