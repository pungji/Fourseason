package fourthseason;
import java.util.Scanner;
public class fourthseason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.println("1~10사이 정수");
int n=1;
do {
	
	System.out.print(n);
	n++;
	}while(n<11);
	
System.out.println("문현준바보");
	*/
		Scanner rd = new Scanner(System.in);
		int n=0;
		double sum=0;
		int i =0;
		i=rd.nextInt();
		
		while(true) {
			if(i==0) {
				break;
			}
			n++; 
			sum=i;
			i=rd.nextInt();
		}
	System.out.println("입력된 수의 개수는"+n+"개이며 평균은"+sum/n+"입니다.");
	System.out.println("ㅁㅎㅈ 몽충이");
	}
	
}
