
public class Student extends User{
	
	private String courseCertificate;
	private String nationalIdentity;
	
	public Student(){
		
		
	}
	
	public Student(String courseCertificate, String nationalIdentity) {
		
		this.courseCertificate = courseCertificate;
		this.nationalIdentity = nationalIdentity;
	}
	
	public String getcourseCertificate() {
		return courseCertificate;
	}
	public void setcourseCertificate(String courseCertificate) {
		this.courseCertificate = courseCertificate;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
