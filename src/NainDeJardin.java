public class NainDeJardin extends Victime {

    protected int solidite;

    public NainDeJardin(String nom_nain){
        super(nom_nain);
        solidite = (int)(Math.random()*150);
    }

    public boolean mort(){
        return (solidite == 0);
    }

    public void affiche(){
        if (this.mort()){
            System.out.println(nom  + " est cassé.");
        }
        else{
            System.out.println("Je suis " + nom + " et j'ai une solidité de " + solidite + ".");
        }
    }

    public void subitFrappe(int coup){
        if (coup > solidite){
            solidite = 0;
            System.out.println(nom + " est cassé.");
        }
    }

    public void riposte(Victime p, int coup_initial){
        this.affiche_riposte(p);
        if (this.mort()){
            p.subitFrappe(solidite);
        }
        else{
            p.subitFrappe(coup_initial);
        }
    }

    public int subitCharme(int coup){
        return -1;
    }

    public void printAttributs(){
        System.out.print("(NainDeJardin avec " + solidite + " points de solidité)");
    }
}
