package ch05.sec03;

public class Array2D {

	public static void main(String[] args) {
		// 2차원 배열 형식
		int [][] a= new int[2][3];//2차원배열 참조 시작(기본값0으로 초기화)
		a = null;//2차원 배열 참조 끝(삭제)
		int[][] a1= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		char[][] b= {{'a','b','c'},{'d','c','f'}};
		
		int [][] score = {
				{100,100,1000},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
				};
		// 배열 idx 0부터 시작 2차원 배열접근 :배열[행idx][열idx]
		System.out.println(score[0][0]);
		// 2차원배열.length속성 값 : 행의 수
		System.out.println(score.length);
		// 2차원배열[행idx].length:해당 행의 원소수
		System.out.println(score[0].length);
		// 2차원배열[행idx]:행의 시작주소
		System.out.println(score[0]);
		
		System.out.println(score);
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.printf("scroe[%d][%d]=%c%n",i,j,b[i][j]);
			}
			System.out.println();
		}
	}
}