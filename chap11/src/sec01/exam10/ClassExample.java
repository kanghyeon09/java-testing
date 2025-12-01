package sec01.exam10;

public class ClassExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		String Photo1Path = clazz.getResource("man.jpg").getPath();
		String Photo2Path = clazz.getResource("girl.jpg").getPath();
		
		System.out.println(Photo1Path);
		System.out.println(Photo2Path);

	}

}
