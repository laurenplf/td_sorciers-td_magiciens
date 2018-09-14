public class Sorcier extends Personnage {

    protected double pouvoir = Math.random();

    public Sorcier(String nom_sorcier, int vie){
        super(nom_sorcier, vie);
    }

    public void attaque(Victime p){
        if (!p.mort()){
            this.affiche_attaque(p);
            this.addVie(p.subitCharme((int)(this.getPouvoir()*pdv)));
        }
    }

    public int subitCharme(int coup){
        return 0;
    }

    public void riposte(Victime p, int coup_initial){
        if (!this.mort()) {
            this.affiche_riposte(p);
            p.subitFrappe((int)(this.getPouvoir()*pdv));
        }
        else{
            this.affiche_non_riposte(p);
        }
    }

    public double getPouvoir(){
        return pouvoir;
    }

    public void subitFrappe(int coup){
        pdv -= coup;
    }
}
