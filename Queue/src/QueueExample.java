import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS", "±èÀÚ¹Ù"));
		messageQueue.offer(new Message("sendKaKaoTalk", "È«µÎ²²"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(message.to + "´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
				break;
			case "sendKaKaoTalk":
				System.out.println(message.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
				break;
			}
		}
	}

}

class Message {
	String command;
	String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}

}