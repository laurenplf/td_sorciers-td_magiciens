public class Monstre extends Personnage{

    public Monstre(String nom_monstre, int vie){
        super(nom_monstre, vie);
    }

    public void attaque(Personnage p){
        if (!this.mort()){
            int coup = pdv/2;
            p.subitFrappe(coup);
            p.riposte(this, coup);
        }
    }

    public void riposte(Victime p, int coup_initial){
        if (!this.mort()){
            p.subitFrappe(pdv / 2);
        }
    }

    public int subitCharme(int coup){
        pdv -= coup;
        if (this.mort()){
            return 0;
        }
        return pdv/2;
    }

    public void subitFrappe(int coup){
        pdv -= coup;
    }
}
