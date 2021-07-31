public enum Caractere {

    CROIX("X"), ROND("O"), VIDE(".");

    private String caractere;

    private Caractere(String caractere) {
        this.caractere = caractere;
    }

    public String getCaractere() {
        return this.caractere;
    }

}
