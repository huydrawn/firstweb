package tags;

public class Student {
	private int ID;
	private String name;
	private String sex;
	private String[] passSubject;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String[] getPassSubject() {
		return passSubject;
	}

	public void setPassSubject(String[] passSubject) {
		this.passSubject = passSubject;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
