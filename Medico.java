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
        this.pazientiAssegnati = new ArrayList<>(); // Parte vuota
    }

    // Metodo per aggiungere un paziente al medico
    public void assegnaPaziente(Paziente p) {
        // Controlliamo il limite dei 20 pazienti contemporaneamente [cite: 28]
        if (this.pazientiAssegnati.size() >= 20) {
            // Lanciamo l'eccezione personalizzata richiesta dal testo [cite: 28]
            throw new LimitePazientiSuperatoException("Impossibile assegnare il paziente: limite massimo raggiunto.");
        }
        
        if (!this.pazientiAssegnati.contains(p)) {
            this.pazientiAssegnati.add(p);
        }
    }

    public abstract int getNumeroPazientiAssegnati();

    public String getIdAlbo() {
        return idAlbo;
    }
}
