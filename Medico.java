package simulazione_TDE_2;

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

    /**
     * Metodo che verrà sovrascritto (Overriding) dalle sottoclassi.
     */
    public abstract int getNumeroPazientiAssegnati();

    @Override
    public String toString() {
        return "[" + idAlbo + "] Dr. " + nome + " " + cognome + " - Spec: " + specializzazione;
    }
}
