import java.util.Scanner;

public class SumTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.print("* �հ踦 ���� ������ ���� �Է�: ");
			int num = s.nextInt();
			int sum = 0;
			
			for (int i = 0; i < num; i++) {
				sum += i+1; // sum = sum + (i+1)
			}
			
			System.out.printf("1���� %d������ �հ�� %d�Դϴ�.\n", num, sum);
			System.out.print("* ����ؼ� �հ踦 ���Ͻðڽ��ϱ�?(yes/no):");
			String answer = s2.nextLine();
			if(answer.equals("no"))
				break;
		}

		
		s.close();
		s2.close();
	}

}
