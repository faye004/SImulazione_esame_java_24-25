import java.util.ArrayList;
import java.util.List;

public abstract class Medico {
    private String idAlbo;
    private String nome;
    private String cognome;
    private String specializzazione;
    protected List<Paziente> pazientiAssegnati;

    public Medico(String idAlbo, String nome, String cognome, String specializzazione) {
        this.idAlbo = idAlbo;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        this.pazientiAssegnati = new ArrayList<>();
    }

    public String getIdAlbo() { return idAlbo; }
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getSpecializzazione() { return specializzazione; }

    /**
     * Assegna un paziente al medico nel rispetto del limite di 20 pazienti.
     */
    public void assegnaPaziente(Paziente p) {
        if (this.pazientiAssegnati.size() >= 20) {
            throw new LimitePazientiSuperatoException("Il medico " + cognome + " ha già raggiunto il limite di 20 pazienti.");
        }
        if (!this.pazientiAssegnati.contains(p)) {
            this.pazientiAssegnati.add(p);
        }
    }

    public void assegnaPaziente(Paziente p) {
        // Controllo del limite dei 20 pazienti 
        if (this.pazientiAssegnati.size() >= 20) {
            throw new LimitePazientiSuperatoException("Il medico ha già 20 pazienti in carico."); [cite: 28]
        }
        
        // Evitiamo di aggiungere lo stesso paziente due volte
        if (!this.pazientiAssegnati.contains(p)) {
            this.pazientiAssegnati.add(p);
        }
    }

    @Override
    public String toString() {
        return "[" + idAlbo + "] Dr. " + nome + " " + cognome + " - Spec: " + specializzazione;
    }
}
