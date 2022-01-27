package logic;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<GuildMember> departmentMembers;
	
	public Department(String name) {
		this.name = name;
		this.departmentMembers = new ArrayList<>();
	}
	
	public boolean setName(String name) {
		if (name.length() <= 0)
			return false;
		
		this.name = name;
		return true;
	}
	
	public String getName() {
		return name;
	}
	
	public void addMember(GuildMember m) {
		m.setMyDepartment(this.name);
		departmentMembers.add(m);
	}
	
	public void addMultipleMembers(ArrayList<GuildMember> memberList) {
		for (GuildMember m: memberList) 
		{	
			m.setMyDepartment(this.name);
			departmentMembers.add(m);
		}
	}
	
	public GuildMember removeMember(int index) {
		GuildMember m = departmentMembers.remove(index);
		m.setMyDepartment(null);
		return m;
	}
	
	public GuildMember getMember(int index) {
		return departmentMembers.get(index);
	}
	
	public ArrayList<GuildMember> getAllMembers(){
		return departmentMembers;
	}
	
	//------------------------------------------
	//---do not edit anything below this line---
	//----but feel free to look at the code!----
	//------------------------------------------
	
	public void printMembers() {
		if(departmentMembers.size() <= 0) {
			System.out.println("This department is empty!");
			return;
		}
		
		int i = 0;
		for (GuildMember m : departmentMembers) {
			System.out.println(i + ") " + m);
			i++;
		}
	}
	
	public void clearDepartment() {
		departmentMembers.clear();
	}
	
	public String toString() {
		return name + " Department";
	}
	
	public int memberCount() {
		return departmentMembers.size();
	}
}
