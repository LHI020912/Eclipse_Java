package ch04.sec02;

public class ForNestedEx {
	
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2; j<=9; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
		}
	}
}