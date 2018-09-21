public abstract class Victime {

    protected String nom;

    public Victime(String nom_victime){
        nom = nom_victime;
    }

    /** Allows user to know when a Victime does a counterattack
     *
     * @param p
     */
    public void affiche_riposte(Victime p){
        System.out.println(nom + " riposte sur " + p.nom + ".");
    }

    /** Allows user to know the name of the considered Victime
     *
     * @return name of Victime
     */
    public String getNom(){
        return nom;
    }

    /** The Victime receives a charm attack
     *
     * @param coup
     * @return life which will be offered (signed int) to the opponent
     */
    public abstract int subitCharme(int coup);

    /** The Victime launches a counterattack
     *
     * @param p
     * @param coup_initial
     */
    public abstract void riposte(Victime p, int coup_initial);

    /** The Victime receives a physical attack
     *
     * @param coup
     */
    public abstract void subitFrappe(int coup);

    /** Allows user to know if the considered Victime is dead
     *
     * @return true if the considered Victime is dead
     */
    public abstract boolean mort();

    /** Prints information on the Victime
     *
     */
    public abstract void affiche();

    /** Allows user to use System.out.print on the Victime
     *
     */
    public abstract void printAttributs();
}
