import java.util.ArrayList;

public class Messenger {
	ArrayList<Observer> observers=new ArrayList<Observer>();
	String state;

	public String getState() {
		return state;
	}
	
	public void setState(String state){
		this.state=state;
		notifyObservers();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		observers.remove(o);
	}
	
	
	public void notifyObservers() {
		for (Observer observer : observers){
			observer.update();
		}
	}
}
