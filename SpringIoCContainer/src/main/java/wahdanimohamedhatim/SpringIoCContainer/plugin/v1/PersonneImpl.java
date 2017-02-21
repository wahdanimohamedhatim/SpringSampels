package wahdanimohamedhatim.SpringIoCContainer.plugin.v1;

import wahdanimohamedhatim.SpringIoCContainer.IPersonne;

public class PersonneImpl implements IPersonne {
	private String fName;
	private String lName;
	private PersonneImpl son;

	public void setAmi(PersonneImpl ami) {
		this.son = ami;
	}

	public String toString(PersonneImpl o) {
		if (o.son != null)
			return "(" + o.fName + " " + o.lName + " Pere de --> " + o.son.toString(o.son)+")";
		return "(" + o.fName + " " + o.lName +"-->( qui n'a pas de fils ))";

	}

	public PersonneImpl() {
		System.out.println("Constructor 0: " + lName + fName);
	}

	public PersonneImpl(String fName, String lName, PersonneImpl ami) {
		this.fName = fName;
		this.lName = lName;
		this.son = ami;
		System.out.println("Constructor 2: " + this.toString(this));
	}

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
		System.out.println("Hello : " + this.toString(this));
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
		System.out.println("First Name changed to : " + fName);
		return this.fName;

	}

}
