public class Monstre extends Personnage{

    public Monstre(String nom_monstre, int vie){
        super(nom_monstre, vie);
    }

    public void attaque(Victime p){
        if (!this.mort()){
            this.affiche_attaque(p);
            int coup = pdv/2;
            p.subitFrappe(coup);
            p.riposte(this, coup);
        }
    }

    public void riposte(Victime p, int coup_initial){
        if (!this.mort()){
            this.affiche_riposte(p);
            p.subitFrappe(pdv / 2);
        }
        else{
            this.affiche_non_riposte(p);
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
