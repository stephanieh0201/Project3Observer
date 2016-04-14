
public class MessengerDriver {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		
		User user1 = new User(messenger);
		System.out.println("First state change: Message is 'hello'");
		messenger.setState("hello");
		User user2 = new User(messenger);
		System.out.println("Second state change: Message is 'how are you'");
		messenger.setState("how are you");
		messenger.removeObserver(user1);
		System.out.println("Third state change: Message is 'goodbye'");
		messenger.setState("goodbye");
		
		
	}

}
