public class Case {
    
    private Caractere caractere;

    public Case() {
        this.caractere = Caractere.VIDE;
    }

    public Caractere getCaractere() {
        return this.caractere;
    }

    public void setCaractere(Caractere caractere) {
        this.caractere = caractere;
    }

    public String toString() {
        return this.caractere.getCaractere();
    }

}
