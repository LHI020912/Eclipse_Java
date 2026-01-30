package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		// 중첩반복문 break 범위
		for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g')
					break;
			}//중첩for문 내의 break범위: 가장가까운 lower까지만 진행.
			System.out.println("~~~");
		}
		System.out.println("~~~");
		// 이름 명명:바깥for문을 지층하는 lable[권장X]
		Outter:for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower <='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g')
					break Outter;
			}
			System.out.println("~~~");
			if(upper =='K')
				break;
		}
	}
}