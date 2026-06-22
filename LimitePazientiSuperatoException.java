public class LimitePazientiSuperatoException extends RuntimeException {
    
    // Costruttore di base senza messaggio
    public LimitePazientiSuperatoException() {
        super();
    }

    // Costruttore che accetta un messaggio personalizzato di errore
    public LimitePazientiSuperatoException(String messaggio) {
        super(messaggio);
    }
}
