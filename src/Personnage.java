import java.awt.desktop.OpenURIEvent;

public abstract class Personnage extends Victime {

    protected int pdv;

    public Personnage(String nom_perso, int vie){
        super(nom_perso);
        pdv = vie;
    }

    public int getVie(){
        return pdv;
    }

    public boolean mort(){
        return (pdv <= 0);
    }

    public void addVie(int vie){
        pdv += vie;
        if (vie > 0){
            System.out.println(nom + " gagne " + vie  + " points de vie.");
        }
        else if (vie < 0){
            System.out.println(nom + " subit " + (-vie) + " points de dégâts.");
        }
        else{
            System.out.println("La vie de " + nom + " reste inchangée.");
        }
    }

    public void affiche(){
        if (this.mort()){
            System.out.println(nom + " est mort.");
        }
        else {
            System.out.println("Je suis " + nom + " et j'ai " + pdv + " points de vie.");
        }
    }

    public String toString(){
        if (mort()){
            return nom + " est mort.";
        }
        return "Je suis " + nom + " et j'ai " + pdv + " points de vie.";
    }

    public void affiche_non_riposte(Victime p){
        System.out.println(nom + " ne riposte pas pas sur " + p.nom + " car " + nom + " est mort.");
    }

    public void affiche_attaque(Victime p){
        System.out.print(nom + " ");
        this.printAttributs();
        System.out.print(" attaque " + p.nom + " ");
        p.printAttributs();
        System.out.println(".");
    }

    public abstract void attaque(Victime p);
}
