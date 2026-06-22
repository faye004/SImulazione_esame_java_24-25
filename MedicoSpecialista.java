public class MedicoSpecialista extends Medico implements Specialista {

    public MedicoSpecialista(String idAlbo, String nome, String cognome, String specializzazione) {
        super(idAlbo, nome, cognome, specializzazione);
    }
    
    @Override
    public int getNumeroPazientiAssegnati() {
        return this.pazientiAssegnati.size(); 
    }
}
