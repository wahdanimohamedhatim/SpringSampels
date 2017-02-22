package wahdanimohamedhatim.SpringIoCContainer.plugin.v1;

import wahdanimohamedhatim.SpringIoCContainer.IMoteur;

public class MoteurImpl implements IMoteur {
	
	private int nbrLitre;
	private int nbrChevaux;
public void setNbrLitre(int nbrLitre) {
		this.nbrLitre = nbrLitre;
	}

	//	public MoteurImpl(int nbrLitre){
//		this.nbrLitre=nbrLitre;
//		System.out.println("Constructor MoteurImpl : " + this.toString());
//		
//	}
//	

public MoteurImpl(int nbrChevaux){
this.nbrChevaux=nbrChevaux;
System.out.println("Constructor MoteurImpl ch: " + this.nbrChevaux);

}

	public String toString(){
		if(this!=null)
		return " Litres : "+this.nbrLitre+" Chevaux : "+this.nbrChevaux;
		return "NON";
	}

}
