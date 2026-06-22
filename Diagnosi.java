package simulazione_esame_24_25;

import java.util.*;

/*Diagnosi:
o Una diagnosi è associata a un paziente e memorizza:
 	-Una descrizione del problema.
 	-La data in cui è stata effettuata.
 	-Il medico responsabile della diagnosi.
o Esistono due tipi di diagnosi:
 	-Diagnosi semplice (senza ulteriori azioni richieste).
 	-Diagnosi con prescrizione, che include una lista di farmaci prescritti.
o Utilizzare l'ereditarietà per rappresentare i due tipi di diagnosi.*/

public class Diagnosi {
	
	protected Paziente piaziente;
	protected Medico medico;
	protected String descrizione;
	protected String data; // aaaa-mm-gg
	
	public Diagnosi(Paziente p, Medico m, String d, Strind date) {
		this.piaziente = p;
		this.medico = m;
		this.descrizione = d;
		this.data = date;
	}

	public Paziente getPiaziente() {
		return piaziente;
	}

	public void setPiaziente(Paziente piaziente) {
		this.piaziente = piaziente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return ("Paziente: " + paziente.getNome + " " + paziente.getCognome + ";  CF: " + paziente.getCF() + "; \nmedico: " + medico.getNome + " " + medico.getCognome + ", codice identificativo: " + medico.getIdentificativo() + "\n data diagnosi: " + data + "\n descrizione: " + descrizione + ".");
	}
	
}
