package ch05.sec01;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// Array 정리
		// 같은 타입의 데이터를 연속된 공간에 저장하는 자료구조
		int num;
		int [] arr;//저장된 요소타입 선언 시 결정해야 함
		//인스턴스 생성-배열의 정확한 크기를 알려줘야 인스턴스 생성가능
		//자바 배열은 동적할당X(처음생성 시 크기(길이)를 결정하고 사용)
		//arr의 배열크기는 12byte이기에 배열이 생성되려면 12pyte공간 필요
		//ex) arr[0]요소의 주소가 100번지라면 int 크기만큼 건너뛰려면 arr[1]필요
		arr = new int[3];

		//배열변수(참조형변수) 선언형식2가지-저장되는 데이터 타입은 모든 타입가능
		int[] num1;//해당배열에 idx 접근하면 실제 겂이 있음
		double[] average;
		String[] name;//해당배열에 idx 접근하면 문자열 참조 주소
		
		int num2[];
		double average2[];
		String name2[];
		
		//배열 메모리 공간할당 : new
		int a[] = new int[5];//선언과 동시에할당
		int [] c;
		c = new int[5];
		
		//공간크기 설정
		//int[5] test;//선언하며 크기 결정
		//int test1[6];
		
		//배열은 공간할당 시 초기값 저장됨
		int[] a1 = new int[5];//초기값0
		double[] d1 = new double[2];//초기값0.0
		boolean[] b1 = new boolean[5];//초기값 false
		String[] s1 = new String[5];//초기값 null
		
		//항목의 기본값
		//byte,short,int : 0 , long:0L
		//float: 0.0f
		//참조타입:NULL
		//char:'\u0000' ->유니코드 NULL문자
		
		//배열 선언 할당하며 바로 초기화 진행
		int[] i1 = {1,2,3,4,5};
		String[] nations = {"korea","japan","china"};
		int score[] = new int[] {90,80,55,60};
		
		//초기화 주의사항
		int[] test2;
		//test2 = {1,2,3,4,5};
		//{}이용한 할당 및 초기화는 선언과 동시에만 사용가능
		//int score1[] = new int[6]{90,80,55,60};
		//[]에 요소 크기결정은 초기화진행시엔 불가능
		test2= new int[] {1,2,3,4,5};//명시적할당 후 {}활용가능
		
		//길이가 0일 배열 생성가능
		int[] score2= new int[0];
		int[] score3= new int[] {};
		int[] score4= {};
		
		//배열 참조변수 출력
		System.out.println(score);//[I@2ff4acd0->참조해야하는 객체의 가상주소 출력
		//@:주소표현, [ 한개는 참조주소, [[ 두개면 2차원 배열
		
		//배열의 idx는 0번부터 시작
		System.out.println(score[0]);
		
		String[] flowers = {"해바라기","장미","진달래"};
		//배열 요소 접근 idx
		for(int i=0; i<flowers.length;i++) {
			System.out.print(flowers[i]+" ");
		}//요소 각각 접근 출력진행
		System.out.println();
		
		//Array클래스의 toString() 사용하면 전체 배열값을 반환받기 가능
		System.out.println(Arrays.toString(flowers));
		//문자열 객체타입의 배열을 전달받아 toString로 배열을 문자열로 반환
		
		//배열의 크기:length속성
		System.out.println("flowers배열의 크기: "+flowers.length);
		System.out.print("길이가 없는 배열의 length: "+score2.length);
	}
}