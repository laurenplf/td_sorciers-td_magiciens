public abstract class Personnage {

    protected String nom;
    protected int pdv;

    public Personnage(String nom_monstre, int vie){
        nom = nom_monstre;
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

    public abstract void attaque(Personnage p);

    public abstract int subitCharme(int coup);

    public abstract void riposte(Personnage p);
}
