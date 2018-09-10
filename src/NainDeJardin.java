public class NainDeJardin extends Victime {

    private int solidite;

    public NainDeJardin(String nom_nain){
        super(nom_nain);
        solidite = (int)(Math.random()*150);
    }

    public boolean mort(){
        return (solidite == 0);
    }

    public void subitFrappe(int coup){
        if (coup > solidite){
            solidite = 0;
        }
    }

    public void riposte(Victime p, int coup_initial){
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
}
