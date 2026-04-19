package ch09.sec02;

public class Audio implements IRemoteControl{
	// 멤버필드
	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > IRemoteControl.MAX_VOLUME)
			this.volume = IRemoteControl.MAX_VOLUME;
		else if(volume < IRemoteControl.MIN_VOLUME)
			this.volume = IRemoteControl.MIN_VOLUME;
		else
			this.volume = volume;

	System.out.println("현재 AUDIO볼륨 : "+ this.volume);
	}
	
	// default 재정의할 경우 default 적지 않음(인터페이스용)
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(this.mute)
			System.out.println("Audio 무음 처리 합니다.");
		else
			System.out.println("Audio 무음 해제 합니다.");
	}
}
