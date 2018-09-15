public abstract class Victime {

    protected String nom;

    public Victime(String nom_victime){
        nom = nom_victime;
    }

    public void affiche_riposte(Victime p){
        System.out.println(nom + " riposte sur " + p.nom + ".");
    }

    public String getNom(){
        return nom;
    }

    public abstract int subitCharme(int coup);

    public abstract void riposte(Victime p, int coup_initial);

    public abstract void subitFrappe(int coup);

    public abstract boolean mort();

    public abstract void affiche();

    public abstract void printAttributs();
}
