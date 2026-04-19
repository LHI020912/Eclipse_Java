package ch05.sec03;

import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 영단어 뜻 맞추기
		String [][] q = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		String a= "";
		
		for(int i=0; i<q.length;i++) {
			System.out.printf("Q%d. %s의 뜻은? ",i+1,q[i][0]);
			a= sc.next();
			
			if(a.equals(q[i][1]))
				System.out.println("정답입니다.\n");
			else
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n",q[i][1]);
		}
	}
}