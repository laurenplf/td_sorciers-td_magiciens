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
        this.addVie(0);
        return 0;
    }

    public void riposte(Victime p, int coup_initial){
        if (!this.mort()) {
            this.affiche_riposte(p);
            int frappe = (int)(this.getPouvoir()*pdv);
            p.subitFrappe(frappe);
        }
        else{
            this.affiche_non_riposte(p);
        }
    }

    public double getPouvoir(){
        return pouvoir;
    }

    public void subitFrappe(int coup){
        this.addVie(-coup);
    }

    public void printAttributs(){
        System.out.print("(Sorcier avec " + pdv + " points de vie et pouvoir de " + this.getPouvoir() + ")");
    }
}
