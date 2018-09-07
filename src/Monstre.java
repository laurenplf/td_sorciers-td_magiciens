public class Monstre extends Personnage{

    public Monstre(String nom, int vie){
        super(nom, vie);
    }

    public void attaque(Personnage p){
        if (!this.mort()){
            p.addVie(- pdv / 2);
            p.riposte(this);
        }
    }

    public void riposte(Personnage p){
        if (!this.mort()){
            p.addVie(-pdv / 2);
        }
    }

    public int subitCharme(int coup){
        pdv -= coup;
        if (this.mort()){
            return 0;
        }
        return pdv/2;
    }
}
