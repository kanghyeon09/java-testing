package student1;

public class Person {
    
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;  
    }

   
    public void introduce() {
        System.out.println("이름 : " + name + " / age : " + age);
    }
}


class Student extends Person {
    int studentId; 

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    @Override
    public void introduce() {
        System.out.println("학생 정보 - 이름: " + name + " / 나이: " + age + " / 학번: " + studentId);
    }
    
    public class Main {
        public static void main(String[] args) {
           
            Person person1 = new Person("홍길동", 30);
            
            Student student1 = new Student("김철수", 20, 20240001);

            person1.introduce(); 

            student1.introduce();
        }
    }
}