public class Morpion {
    
    public Case[][] cases;
    public int tailleTableau;

    public Morpion() {
        this.tailleTableau = 3;
        this.cases = new Case[this.tailleTableau][this.tailleTableau];
        this.initMorpion();
    }

    private void initMorpion() {
        for(int x = 0; x < this.tailleTableau; x++) {
            for(int y = 0; y < this.tailleTableau; y++) {
                this.cases[x][y] = new Case();
            }
        }
    }

    public boolean choixCase(int x, int y, Caractere caractere) {
        if(this.cases[x][y].getCaractere() == Caractere.VIDE) {
            this.cases[x][y].setCaractere(caractere);
            return true;
        } else {
            System.out.println("Cette case est prise");
            return false;
        }
    }

    public void affichageMorpion() {
        for(int x = 0; x < this.tailleTableau; x++) {
            System.out.println(this.cases[x][0] + "|" + this.cases[x][1] + "|" + this.cases[x][2]);
        }
    }

    public boolean victory(Caractere caractere) {
        return verifLigne(caractere) || verifColonne(caractere) || verifDiagonale1(caractere) || verifDiagonal2(caractere);
    }

    private boolean verifLigne(Caractere caractere) {
        boolean verif = false;
        for(int x = 0; x < this.tailleTableau; x++) {
            verif = true;
            for(int y = 0; y < this.tailleTableau; y++) {
                if(this.cases[x][y].getCaractere() != caractere) {
                    verif = false;
                }
            }
            if(verif) return verif;
        }
        return verif;
    }

    private boolean verifColonne(Caractere caractere) {
        boolean verif = false;
        for(int y = 0; y < this.tailleTableau; y++) {
            verif = true;
            for(int x = 0; x < this.tailleTableau; x++) {
                if(this.cases[x][y].getCaractere() != caractere) {
                    verif = false;
                }
            }
            if(verif) return verif;
        }
        return verif;
    }

    private boolean verifDiagonale1(Caractere caractere) {
        boolean verif = true;
        int x = 0, y = 0;
        do {
			if (this.cases[x][y].getCaractere() != caractere) {
				verif = false;
				break;
			}
			x++;
			y++;
		} while (x < this.tailleTableau);
        return verif;
    }

    private boolean verifDiagonal2(Caractere caractere) {
        boolean verif = true;
        int x = 0, y = this.tailleTableau - 1;
        do {
			if (this.cases[x][y].getCaractere() != caractere) {
				verif = false;
				break;
			}
			x++;
			y--;
		} while (x < this.tailleTableau);
        return verif;
    }

}
