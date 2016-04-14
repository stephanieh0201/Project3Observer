
public class User extends Observer {
	
	public User (Messenger messenger){
		this.messenger = messenger;
		this.messenger.registerObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("User: " + messenger.getState());
		
	}

}
