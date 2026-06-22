public class MedicoDiBase extends Medico {
    
    public MedicoDiBase(String idAlbo, String nome, String cognome) {
        super(idAlbo, nome, cognome, "Medicina Generale");
    }

    /**
     * Overriding: restituisce il numero reale di pazienti nel proprio pannello.
     */
    @Override
    public int getNumeroPazientiAssegnati() {
        return this.pazientiAssegnati.size();
    }
}
