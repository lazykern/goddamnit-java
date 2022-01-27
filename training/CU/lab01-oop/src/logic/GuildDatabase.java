package logic;

import java.util.ArrayList;

public class GuildDatabase {
	private ArrayList<Department> myDepartments;

	public GuildDatabase() {
		this.myDepartments = new ArrayList<>();
		this.myDepartments.add(new Department("Unassigned"));
	}

	public boolean createDepartment(String name) {
		if (myDepartments.stream().anyMatch(d -> d.getName().equals(name)))
			return false;

		Department newDepartment = new Department(name);
		myDepartments.add(newDepartment);

		return true;
	}

	public boolean isExists(String name) {
		return myDepartments.stream().anyMatch(d -> d.getName().equals(name));
	}

	public ArrayList<GuildMember> removeDepartment(int index) {

		return myDepartments.remove(index).getAllMembers();
	}

	// ------------------------------------------
	// ---do not edit anything below this line---
	// ----but feel free to look at the code!----
	// ------------------------------------------

	public Department getDepartment(int index) {
		return myDepartments.get(index);
	}

	public void printDepartments() {
		int i = 0;
		for (Department d : myDepartments) {
			System.out.println(i + ") " + d);
			i++;
		}
	}

	public int departmentCount() {
		return myDepartments.size();
	}
}
