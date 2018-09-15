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
        else{
            System.out.println(p.nom + "est mort ou cassé.");
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
        this.addVie(-coup);
        if (this.mort()){
            return 0;
        }
        return pdv/2;
    }

    public void subitFrappe(int coup){
        this.addVie(-coup);
    }

    public void printAttributs() {
        System.out.print("(Monstre avec " + pdv + " points de vie)");
    }
}
