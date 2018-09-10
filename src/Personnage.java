import java.awt.desktop.OpenURIEvent;

public abstract class Personnage {

    protected String nom;
    protected int pdv;

    public Personnage(String nom_perso, int vie){
        nom = nom_perso;
        pdv = vie;
    }

    public String getNom(){
        return nom;
    }

    public int getVie(){
        return pdv;
    }

    public boolean mort(){
        return (pdv <= 0);
    }

    public void addVie(int vie){
        pdv += vie;
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

    public abstract void attaque(Personnage p);

    public abstract int subitCharme(int coup);

    public abstract void riposte(Personnage p);
}
