package �dev3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(0);
		student1.setFirstname("Sinan");
		student1.setLastname("�aydibi");
		student1.setUsername("Sinan�.");
		student1.setPassword(12345);
		student1.setComment("Gayet Ba�ar�l� bir kurs ");
		
		
		Student student2 = new Student();
		student2.setId(0);
		student2.setFirstname("ahmet");
		student2.setLastname("cenk");
		student2.setUsername("ahmetc.");
		student2.setPassword(34567);
		student2.setComment("�ok iyi");
		
		
		Instructor instructor1 = new Instructor();
		
		instructor1.setId(0);
		instructor1.setFirstname("Engin");
		instructor1.setLastname("demiro�");
		instructor1.setUsername("EnginD");
		instructor1.setPassword(1209);
		instructor1.setCourse("Java & React Kursu");
		
		
		UserManager usermanegerr = new UserManager();
		usermanegerr.Login(student1);
		System.out.println("************************************");
		
		InstructorManager instructormanager = new InstructorManager();
		
		instructormanager.add(instructor1);
		
		System.out.println("************************************");
		
		
		StudentManager studentmanager = new StudentManager();
		
		studentmanager.CommendAdd(student2,instructor1);
		
		System.out.println("************************************");
		
	
		
	}

}
