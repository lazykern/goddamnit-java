package logic;

public class GuildMember {
	private String name;
	private String jobTitle;
	private String myDepartment;
	private int salary;
	
	public GuildMember(String name, String jobTitle, int salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = (name.length() > 0) ? name : "Anon";
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = (jobTitle.length() > 0) ? jobTitle : "Adventurer";
	}

	public String getMyDepartment() {
		
		return getMyDepartment();
	}
	
	public void setMyDepartment(String myDepartment) {
		this.myDepartment = myDepartment;
	}
	public int getSalary() {
		
		return this.salary;
	}
	public void setSalary(int salary) {
		if (salary < 0)
			this.salary = 0;
		else if (salary > 1000000)
			this.salary = 1000000;
		else
			this.salary = salary;
	}
	
	//------------------------------------------
	//---do not edit anything below this line---
	//----but feel free to look at the code!----
	//------------------------------------------
	
	public String toString() {
		return name + " the " + jobTitle + " of the " + myDepartment + " Department (Salary: " + salary + ")";
	}
}
