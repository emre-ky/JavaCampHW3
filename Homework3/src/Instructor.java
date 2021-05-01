
public class Instructor extends User{
	private String location;
	private String courses;
	
	public Instructor(){
		
	}
	
	
	public Instructor(String location, String courses) {
		super();
		this.location = location;
		this.courses = courses;
	}


	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}

}
