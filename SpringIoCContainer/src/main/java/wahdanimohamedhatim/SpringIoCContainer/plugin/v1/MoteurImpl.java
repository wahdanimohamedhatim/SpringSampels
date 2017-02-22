package wahdanimohamedhatim.SpringIoCContainer.plugin.v1;

import wahdanimohamedhatim.SpringIoCContainer.IMoteur;

public class MoteurImpl implements IMoteur {
	
	private int nbrLitre;
	
public void setNbrLitre(int nbrLitre) {
		this.nbrLitre = nbrLitre;
	}

	//	public MoteurImpl(int nbrLitre){
//		this.nbrLitre=nbrLitre;
//		System.out.println("Constructor MoteurImpl : " + this.toString());
//		
//	}
//	
	public String toString(){
		if(this!=null)
		return " Litres : "+this.nbrLitre;
		return "NON";
	}

}
