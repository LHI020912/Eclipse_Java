package ch12_collection.HashMap;

public class Student {
	private String stdNo;
	private String stdName;
	
	public Student(String stdNo, String stdName) {
		super(); // Object가 가지고 있는 String 뭐시기를 재정의하기 위해 둠
		this.stdNo = stdNo;
		this.stdName = stdName;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public int hashCode() {
		// 학번과 이름이 같으면 동일한 값 리턴
		// System.out.println(stdNo.hashCode()+stdName.hashCode());
		return stdNo.hashCode()+stdName.hashCode();
	} // 아하 여기서 불렀구나 해쉬코드!

	@Override
	public boolean equals(Object obj) {
		// Student 객체인지 확인
		if(obj instanceof Student) {
			// Student type 객체라면 Student type으로 형변환(현재 Object)
			Student student = (Student)obj;
			return (stdNo.equals(student.stdNo)) && (stdName.equals(student.stdName));
		}else {
			return false;
		}
	}
}
