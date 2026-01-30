package ch05.sec02;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 얕은복사: 참조주소만 복사(동일 객체 참조)
		// 참조변수만 다르고 같은 위치의 객체참조
		int[] a = {1,2,3,4};
		int[] b = a;
		
		System.out.println("\n** 얕은복사 **");
		
		//변경 전 출력
		System.out.println("\n얕은복사 변경 전 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		//a배열 원소값 변경
		a[0] = 100;
		
		//a배열 변경 후 출력
		System.out.println("\n얕은복사 변경 후 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}// 배열 b의 첫번째 값도 변경됨
		
		
		
		
		/// 깊은 복사 : 새로운 배열 생성해 원소값 각각 복사 ///
		int[] deepCopy = new int[4]; //새로운 배열
		for(int i=0; i<a.length;i++) {
			deepCopy[i] = a[i];
		}
		System.out.println("\n\n** 깊은복사 **");
		
		//변경 전 출력
		System.out.println("\n깊은복사 변경 전 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<deepCopy.length;i++) {
			System.out.print(deepCopy[i]+" ");
		}
		System.out.println();
		
		a[3] = 1000;//원본 변경
		//변경 후 출력
		System.out.println("\n깊은복사 변경 후 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<deepCopy.length;i++) {
			System.out.print(deepCopy[i]+" ");
		}
		
		
		

		///// 메소드를 활용한 DeepCopy : 원본 a 배열 /////
		int[] deepCopy2 = a.clone();//배열 객체가 제공하는 복사 메서드
		//Object.clone() : 객체 복사용 메소드
		System.out.println("\n\n** 메소드활용 **");
		
		//변경 전 출력
		System.out.println("\nclone() 변경 전 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<deepCopy2.length;i++) {
			System.out.print(deepCopy2[i]+" ");
		}
		System.out.println();
		
		a[1] = 50;//원본 변경
		//변경 후 출력
		System.out.println("\nclone() 변경 후 출력");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<deepCopy2.length;i++) {
			System.out.print(deepCopy2[i]+" ");
		}//복사본 배열 변화없음
		System.out.println();
		
		
		

		/// Arrays.copyOf(원본,복사할 요소의개수):복사할 요소의 개수가 원본 길이보다 크면 초기값으로 채움
		int copyDeep[] = Arrays.copyOf(a, a.length);
		int copyDeep1[] = Arrays.copyOf(a, a.length+3);
		//복사하면서 원소 소수도 확장
		int copyDeep2[] = Arrays.copyOf(a, a.length-1);
		//일부 복사 제외
		
		System.out.println("\n** Arrays.copyOf **\n");
		
		for(int i=0; i<copyDeep.length;i++) {
			System.out.print(copyDeep[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<copyDeep1.length;i++) {
			System.out.print(copyDeep1[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<copyDeep2.length;i++) {
			System.out.print(copyDeep2[i]+" ");
		}
		System.out.println();
		
		
		/// Arrays.copyOfRange(원본배열,시작idx,끝idx+1):복사범위:시작idx~끝idx까지
		///a= [100 50 3 1000]
		System.out.println("\n** Arrays.copyOfRange **");
		
		int test[] = Arrays.copyOfRange(a,1,3);//idx 1~2=>3-1
		System.out.println();
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		

		
		/// Arrays.arraycopy(원본,시작idx,대상배열객체참조(NULL X),시작idx,복사할 개수) ///
		System.out.println("\n** Arrays.arraycopy **");
		//a=[100 50 3 1000]
		int test2[] = new int[10];
		System.arraycopy(a,1,test2,0,2);
		System.out.println();

		for(int i=0;i<test2.length;i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println();
		
		// 배열 크기 변경
		// 한번 생성하면 크기변경 불가능, 깊은 복사해서 크기 수정 Arrays.copyOf()
		// a.length=10; 배열 length 읽기 전용으로 수정불가능
		
		//배열 공간 부족으로 deepcopy진행 배열 복사
		int[] newA = Arrays.copyOf(a,10);
		//기존 배열 삭제:객체 모든 객체 삭제시 참조변수에 null 대입
		a=null;//a가 참조하는 객체는 절대 사용할 수 없음
		// 객체주소를 a만 알면 a참조 삭제시 참조 방법이 사라짐
		// 이런 경우 해당 메모리는 자바 콜렉터에 의해 자동정리.
		
		int test4 = a[0];
	}
}
