
public class StudentManager {
	
	public void addStudent(User user) {
		System.out.println("��renci eklendi: "+ user.getName());
	}
	
	
	
	public void addCourseCertificate(Student student) {
		
		System.out.println(student.getcourseCertificate() + " sertifikasi eklendi.");
	}
	
	public void addnationalIdentity(Student student) {
		
		System.out.println("��rencinin kimlik numaras� eklendi : " + student.getNationalIdentity());
	}

}
