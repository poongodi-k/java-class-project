package queue.task;

import java.util.*;

public class PatientQueue<E> {
	void displayAll(Queue<User> queue) {
		for(User user: queue) {
			System.out.println("Token Id:" + " " + user.token_no + "\n" + "Name:" + " " + user.name );
		}
	
	}
	
	void display(User u) {
		System.out.println("Token Id:" + " " + u.token_no + "\nName:" + " " + u.name);
	}
	
	public static void main(String[] args) {
		Queue<User> users = new PriorityQueue<>();
		users.add(new User("Poongodi",1));
		users.add(new User("Bala",2));
		users.add(new User("sumi",3));
		users.add(new User("Kavi",4));
		users.add(new User("Puni",5));
		users.add(new User("Thamizh",6));
		
		PatientQueue<User> pq = new PatientQueue<User>();
		System.out.println("Patient arrival list:");
		pq.displayAll(users);
	
	Scanner scn = new Scanner(System.in);
	while(true) {
		System.out.println("welcome to sumi clinic" + "\n Press 1 to show the first user" + "\n Press 2 to allow the first person" + "\n Press 3 to add one person to the queue" + "\n Press 4 to list how many patients in the queue" + "\n Press 5 to print last added person in the queue" + "\n Press 6 to exit the queue");
		System.out.println("Kindly enter your choice");
		int choice = scn.nextInt();
		switch(choice) {
		case 1:
			System.out.println("first user to enter: \n");
			pq.display(users.peek());
			break;
		case 2:
			System.out.println("Patient" + " " + users.peek().name + " " + "can now enter");
			users.remove(users.peek());
			break;
		case 3:
			System.out.println("enter the name:");
			String name = scn.next();
			System.out.println("enter the token no:");
			Integer token_no = scn.nextInt();
			users.add(new User(name,token_no));
			System.out.println("The patient" + " " + name + " " + "is added in the queue");
			break;
		case 4:
			System.out.println("The total no of patient in queue:" + users.size());
			break;
			
		case 5:
			User[] arr = users.toArray(new User[0]);
			System.out.println("Lastly added patient: \n"); 
			pq.display(arr[arr.length-1]);
			break;
		case 6:
			System.out.println("Thank you! Take care");
			scn.close();
			return;
		default:
			System.out.println("Invalid choice");
		}
			
		
		}
	}
}
