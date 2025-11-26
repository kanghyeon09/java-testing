package exam1126;

public class Student {
	
	String studentId;
	String name;
	String email;
	
	public Student(String studentId, String name, String email) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Student) {
			Student s = (Student) object;
			if(name.equals(s.name) && studentId.equals(s.studentId)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		//String str = "StduentId:" + studentId + "name" + name + "email:" + email ;
		String str = String.format("stidnetId : %s name : $s email %s", studentId, name, email);
		return super.toString() + "("+ str +")";
	}

}
