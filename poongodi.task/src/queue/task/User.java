package queue.task;

public class User implements Comparable<User> {
	String name;
	Integer token_no;
	@Override
	public int compareTo(User o) {
		return 0;
	}
	public User(String name,Integer token_no) {
		this.name = name;
		this.token_no = token_no;
	}
}
