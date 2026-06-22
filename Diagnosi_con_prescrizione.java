public class Diagnosi_con_prescrizione extends Diagnosi{

	private String lista_farmaci;
	
	public Diagnosi_con_prescrizione(Paziente p, Medico m, String d, Strind date, String l) {
		super(Paziente p, Medico m, String d, Strind date);
		this.lista_farmaci = l;
	}
	
	public void setListaFarmaci(String new_lista) {
		lista_farmaci = new_lista;
	}
	
	public String getListaFarmaci() {
		return lista_farmaci;
	}
	
	@override
	public String toString() {
		return (super.toString() + "\nlista farmaci prescritti: " + lista_farmaci + ".");
	}
}
