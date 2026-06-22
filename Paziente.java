
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Paziente {
	
	private static Set<String> CodiceF= new HashSet<>();
	private String CodiceFiscale ;
	private String nome ;
	private String cognome ;
	private int eta;
	private List<Diagnosi> diagnosi ;
	
	public Paziente(String CodiceFiscale , String nome , String cognome , int eta , Diagnosi diagnosi) throws Exception{
		if(CodiceFiscale == null || CodiceFiscale.isEmpty()) {
			throw new Exception("ERROR");
		}
		if(!this.CodiceF.add(CodiceFiscale)) {
			throw new IllegalArgumentException("ERROR");
		}
		this.CodiceFiscale = CodiceFiscale ; 
		this.nome = nome ;
		this.cognome = cognome ;
		this.eta = eta;
		this.diagnosi = new ArrayList<>();
		
	}

	public static Set<String> getCodiceF() {
		return CodiceF;
	}

	public static void setCodiceF(Set<String> codiceF) {
		CodiceF = codiceF;
	}

	public String getCodiceFiscale() {
		return CodiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Paziente [CodiceFiscale=" + CodiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta
				+ ", diagnosi=" + diagnosi + "]";
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public List<Diagnosi> getDiagnosi() {
		return diagnosi;
	}

	public void setDiagnosi(List<Diagnosi> diagnosi) {
		this.diagnosi = diagnosi;
	}
	
}
