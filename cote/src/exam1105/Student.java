package exam1105;

public class Student {
	
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String name;
	private String id;
	
	public Student() {
		
	}
	
	public Student(String email, String name, String id) {
		this.email = email;
		this.name = name;
		this.id = id;
	}

}
