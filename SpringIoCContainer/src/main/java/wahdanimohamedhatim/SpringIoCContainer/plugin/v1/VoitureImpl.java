package wahdanimohamedhatim.SpringIoCContainer.plugin.v1;

import wahdanimohamedhatim.SpringIoCContainer.IMoteur;
import wahdanimohamedhatim.SpringIoCContainer.IVoiture;

public class VoitureImpl implements IVoiture {
	
	public void setNbrPorte(int nbrPorte) {
		this.nbrPorte = nbrPorte;
	}

	public void setMoteur(IMoteur moteur) {
		this.moteur = moteur;
	}

	private int nbrPorte;
	private IMoteur moteur;
	public VoitureImpl(int nbrPorte){
	this.nbrPorte=nbrPorte;
	//par ref
	
	System.out.println("Constructor 2 VoitureImpl : " + this.toString());
	
}
	
//	public VoitureImpl(int nbrPorte,IMoteur moteur){
//		this.nbrPorte=nbrPorte;
//		//par ref
//		this.moteur=moteur;
//		System.out.println("Constructor 2 VoitureImpl : " + this.toString());
//		
//	}
//	public VoitureImpl(int nbrPorte){
//		this.nbrPorte=nbrPorte;
//		//par ref
//		//this.moteur=moteur;
//		System.out.println("Constructor 1 VoitureImpl : " + this.toString());
//		
//	}
	public String toString(){
		if(this!=null && this.moteur!= null)
			return " Portes: "+this.nbrPorte+this.moteur.toString();
		if(this!=null)
		return " Portes: "+this.nbrPorte;
		return "NON";
	}
}
