package wahdanimohamedhatim.SpringIoCContainer.plugin.v1;

import wahdanimohamedhatim.SpringIoCContainer.IPersonne;

public class PersonneImpl implements IPersonne {
	private String fName;
	private String lName;

	public void setFName(String fName) {
		System.out.println("First Name : " + fName);
		this.fName = fName;
	}

	public void setLName(String lName) {
		System.out.println("Last Name : " + lName);
		this.lName = lName;

	}

	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello : " + getLName() + " " + getFName());
	}

	private String getFName() {
		// TODO Auto-generated method stub
		return this.fName;
	}

	private String getLName() {
		// TODO Auto-generated method stub
		return this.lName;
	}

	@Override
	public String changeMyFName(String fName) {
		// TODO Auto-generated method stub
		this.fName = fName;
		System.out.println("First Name changed to : "+fName);
		return this.fName;
		
	}

}
