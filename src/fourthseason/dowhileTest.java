package fourthseason;
import java.util.Scanner;
public class dowhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int choice;
			
			Scanner scan = new Scanner(System.in);
			
			do {
				System.out.println("��ü���� ��� ����");
				System.out.println("1.��ü");
				System.out.println("2.Ŭ����");
				System.out.println("3.�޼���");
				System.out.println("4.���");
				System.out.println("���ϴ� ��ȣ�� �Է��ϼ���:");
				choice = scan.nextInt();
				System.out.println();
			}while(choice<1||choice>=4);
			if(choice==1) 
				System.out.println("��ü ����");
			else if(choice==2)
				System.out.println("Ŭ���� ����");
			else if(choice==3)
				System.out.println("�޼��� ����");
			else if(choice==4)
				System.out.println("��� ����");
			else
			System.out.println("�߸��� ���Դϴ�.");
		
	}

}
