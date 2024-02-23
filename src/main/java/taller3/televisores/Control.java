package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazarTV(TV tele) {
		tv = tele;
	}
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void setCanal(int num) {
		tv.setCanal(num);
	}
	
	public void setVolumen(int num) {
		tv.setVolumen(num);
	}
	
	public void setTv(TV tele) {
		tv = tele;
	}
	public TV getTv() {
		return tv;
	}
	
}
	
