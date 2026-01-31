package ch05.sec02;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 0~9까지의 랜덤 숫자 10개 생성하고 배열에 저장하기
		int[] r = new int [10];
		int[] c = new int [10];
		
		for(int i = 0;i<r.length; i++) {
			int num = (int)(Math.random()*10);
			r[i] = num;
			System.out.print(num);
			
			c[num]++;
		}
		System.out.println();
		for(int i=0; i<c.length; i++) {
			System.out.printf("%d의 개수: %d\n",i,c[i]);
		}
	}
}