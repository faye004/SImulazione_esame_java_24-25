public class Diagnosi_con_prescrizione extends Diagnosi{

	private String lista_farmaci;
	
	public Diagnosi_con_prescrizione(Paziente p, Medico m, String d, String date, String l) {
		super(p, m, d, date);
		this.lista_farmaci = l;
	}
	
	public void setListaFarmaci(String new_lista) {
		lista_farmaci = new_lista;
	}
	
	public String getListaFarmaci() {
		return lista_farmaci;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nlista farmaci prescritti: " + lista_farmaci + ".");
	}
}
