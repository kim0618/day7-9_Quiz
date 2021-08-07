import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		// º¯¼ö ¹®Á¦ 1, 2
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println("Â¦¼ö : "+arr[i]);
			}else {
				System.out.println("È¦¼ö : "+arr[i]);
			}
		}
		System.out.println();
		
		Scanner input  = new Scanner(System.in);
		int srr[] = new int[] {10,54,13,17,25,30};
		String add=null;
		System.out.print("Â¦¼ö,È¦¼ö ÀÔ·Â : ");
		add = input.next();
		
		for(int j=0;j<srr.length;j++) {
			if(add.equals("Â¦¼ö")) {
				if(srr[j]%2 ==0) {
					System.out.println("Â¦¼ö : "+srr[j]);
				}
			}else {
				if(srr[j]%2 ==1) {
				System.out.println("È¦¼ö : "+srr[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
