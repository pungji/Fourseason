package fourthseason;
import java.util.Scanner;
public class dowhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int choice;
			
			Scanner scan = new Scanner(System.in);
			
			do {
				System.out.println("객체지향 용어 설명");
				System.out.println("1.객체");
				System.out.println("2.클래스");
				System.out.println("3.메세지");
				System.out.println("4.상속");
				System.out.println("원하는 번호를 입력하세요:");
				choice = scan.nextInt();
				System.out.println();
			}while(choice<1||choice>=4);
			if(choice==1) 
				System.out.println("객체 설명");
			else if(choice==2)
				System.out.println("클래스 설명");
			else if(choice==3)
				System.out.println("메세지 설명");
			else if(choice==4)
				System.out.println("상속 설명");
			else
			System.out.println("잘못된 값입니다.");
		
	}

}
