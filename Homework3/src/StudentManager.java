
public class StudentManager {
	
	public void addStudent(User user) {
		System.out.println("Öğrenci eklendi: "+ user.getName());
	}
	
	
	
	public void addCourseCertificate(Student student) {
		
		System.out.println(student.getcourseCertificate() + " sertifikasi eklendi.");
	}
	
	public void addnationalIdentity(Student student) {
		
		System.out.println("Öğrencinin kimlik numarası eklendi : " + student.getNationalIdentity());
	}

}
