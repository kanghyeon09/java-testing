package sec01.exam06;

import sec01.exam04.RemoteControl;
import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClass {
	
	RemoteControl rc = new Television();
	
	MyClass() {
	}	
		MyClass(RemoteControl rc) {
			this.rc = rc;
			rc.trunOn();
			rc.setVolume(5);
	}
		
	void methodA() {
		RemoteControl rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.trunOn();
		rc.setVolume(5);
	}
		
	

}
