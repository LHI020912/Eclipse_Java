package ch05.sec04;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거타입 사용 예시
		// today 참조변수가 참조할 데이터는 Week 객체참조
		// (즉 Week 객체의 상수값만 대입가능)
		Week today = null; //Week 객체타입과 동일, 초기값으로 null
		// Calendar 클래스는 Instance 생성하는 메소드 제공
		// getInstace()메소드를 이용해 생성된 인스턴스를 반환
		
		// Date, Calendar, LocalDateTime:날짜 및 요일, 시간 반환
		Calendar cal = Calendar.getInstance();
		// 메모리할당을 받아써라, 내가 주겠다 이런 메소드들이 있음.
		//cal.get(Calendar.DAY_OF_WEEK);//16진수값을 가짐
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7까지의 정수반환
		
		//week 변수의 값에 따라 today라는 참조변수에 Week 상수참조대입
		switch(week) {
		case 1:					//열거타입명을 통해 열거형의 상수접근 가능
			today = Week.SUNDAY;//열거타입의 열거타입(참조)변수여야 변수가 저장됨.
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		//객체참조변수를 print문에 적용하면 내부에 저장된 속성값을 출력해줌
		
		if(today == Week.SUNDAY)
			System.out.println("일요일에는 데이트를 합니다.");
		else if(today == Week.FRIDAY)
			System.out.println("금요일에는 최애 직캠을 봅니다.");
		else
			System.out.println("열심히 공부합시다");
		
		/////////// 열거객체 메소드
		today= Week.SUNDAY;
		Week day = Week.WEDNESDAY;
		// name()메소드 통해서 상수가 저장하는 문자열을 반환받음(위에 오늘요일과는다름)
		String name = today.name();
		System.out.println(name);
		
		/////////// 열거 객체의 순번 리턴
		int oedinal = today.ordinal();
		System.out.println(oedinal);//순번0부터시작
		// 매개값과 순번을 비교
		int result = today.compareTo(day);
		int result2 = day.compareTo(today);
		System.out.println(result);  // 4순번이 늦음
		System.out.println(result2); //-4순번이 빠름
		
		/////////// 매개값과 동일한 문자열을 갖는 열거 객체리턴
		Week weekDay =Week.valueOf("SUNDAY");
		System.out.println(weekDay);
		
	}
}
