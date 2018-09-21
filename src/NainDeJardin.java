public class NainDeJardin extends Victime {

    protected int solidite;

    public NainDeJardin(String nom_nain){
        super(nom_nain);
        solidite = (int)(Math.random()*150);
    }

    /** Allows user to know if the considered NainDeJardin is dead
     *
     * @return true if the considered NainDeJardin is dead
     */
    @Override
    public boolean mort(){
        return (solidite == 0);
    }

    /** Prints information on the NainDeJardin
     *
     */
    @Override
    public void affiche(){
        if (this.mort()){
            System.out.println(nom  + " est cassé.");
        }
        else{
            System.out.println("Je suis " + nom + " et j'ai une solidité de " + solidite + ".");
        }
    }

    /** The NainDeJardin receives a physical attack
     *
     * @param coup
     */
    @Override
    public void subitFrappe(int coup){
        if (coup > solidite){
            solidite = 0;
            System.out.println(nom + " est cassé.");
        }
    }

    /** The NainDeJardin launches a counterattack
     *
     * @param p
     * @param coup_initial
     */
    @Override
    public void riposte(Victime p, int coup_initial){
        this.affiche_riposte(p);
        if (this.mort()){
            p.subitFrappe(solidite);
        }
        else{
            p.subitFrappe(coup_initial);
        }
    }

    /** The NainDeJardin receives a charm attack
     *
     * @param coup
     * @return -1 (life point which will be lost by the opponent)
     */
    @Override
    public int subitCharme(int coup){
        return -1;
    }

    /** Prints information on the NainDeJardin
     *
     */
    @Override
    public void printAttributs(){
        System.out.print("(NainDeJardin avec " + solidite + " points de solidité)");
    }
}
