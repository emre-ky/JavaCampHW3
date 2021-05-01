
public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setcourseCertificate("Java");
		student1.setName("Emre");
		student1.setSurname("Köy");
		student1.setNationalIdentity("123456789");
		
		
		
		
		Instructor teacher = new Instructor();
		teacher.setName("Engin");
		teacher.setSurname("Demiroð");
		teacher.setLocation("Çayyolu");
		
		
//		User operator1 = new User();
//		operator1.setId(1);
//		operator1.setName("Emre");
//		operator1.setSurname("Köy");
//      BURADA ÇALIÞIYOR // This place can run too.
	
		
		User[] users = {student1,teacher};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
				
		InstructorManager instructorManager = new InstructorManager();
	    instructorManager.addLocation(teacher);
	
		StudentManager studentManager = new StudentManager();
		studentManager.addCourseCertificate(student1);
		studentManager.addStudent(student1);
		studentManager.addnationalIdentity(student1);
	
		
 		 
		

	}

}
