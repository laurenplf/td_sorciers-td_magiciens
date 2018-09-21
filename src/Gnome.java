public class Gnome extends NainDeJardin implements SuperPouvoir {

    public Gnome(String nom_gnome){
        super(nom_gnome);
    }

    /** Random number
     *
     * @return Math.random()
     */
    @Override
    public double sort(){
        return Math.random();
    }

    /** The Gnome receives a charm attack
     *
     * @param coup
     * @return life points which will be lost by the opponent
     */
    @Override
    public int subitCharme(int coup) {
         int resis = (int)(sort()*solidite);
         if (resis > coup){
             return -coup;
         }
         else{
             return -1;
         }
    }

    /** Prints information on the Gnome
     *
     */
    @Override
    public void printAttributs(){
        System.out.print("(Gnome avec " + solidite + " points de solidité)");
    }
}
