package business;

import java.io.*;

import fabrikMethode.ConcreteCreatorCsv;
import fabrikMethode.ConcreteCreatorTxt;
import fabrikMethode.Creator;
import fabrikMethode.Product;

public class BuergeraemterModel {
 		
	private Buergeramt buergeramt;

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
	}
 		
	public void schreibeBuergeraemterInCsvDatei()
	    throws IOException{
		Creator creator =new ConcreteCreatorCsv();
		Product writer = creator.factoryMethod();
		writer.fuegeInDateiHinzu(buergeramt);
		writer.schliessDatei();

 	}
	public void schreibeBuergeraemterInTxtDatei()throws IOException{
		Creator creator =new ConcreteCreatorTxt();
		Product writer = creator.factoryMethod();
		writer.fuegeInDateiHinzu(buergeramt);
		writer.schliessDatei();
	}

}

