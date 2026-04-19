package ch09.sec02;


// 다중인터페이스 구현
public class SmartTelvision implements IRemoteControl, ISearchable{
	int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > IRemoteControl.MAX_VOLUME)
			this.volume = IRemoteControl.MAX_VOLUME;
		else if(volume < IRemoteControl.MIN_VOLUME)
			this.volume = IRemoteControl.MIN_VOLUME;
		else
			this.volume = volume;

	System.out.println("현재 스마트 TV볼륨 : "+ this.volume);
	}

}
