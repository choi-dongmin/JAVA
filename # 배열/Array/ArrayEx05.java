package Array;

public class ArrayEx05 {

	public static void main(String[] args) {
		int sum = 0;
		double average ;	
		int [] score = {100,88,100,100,90};
		
		for(int i : score) {
			sum += i;
		}
		
		average = sum / score.length;
		
		System.out.println("�� ������ ���� :" + sum + "�Դϴ�.");
		System.out.println("������ ����� :"+ average + "�Դϴ�.");
	}

}
