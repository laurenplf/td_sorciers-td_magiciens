public class Magicien extends Sorcier implements SuperPouvoir{

    public Magicien(String nom_magicien, int vie){
        super(nom_magicien, vie);
    }

    /** Allows user to know power of the considered Magicien
     *
     * @return power of the Magicien
      */
    @Override
    public double getPouvoir(){
        return extra*pouvoir;
    }

    /** Random number
     *
     * @return Math.random()
     */
    @Override
    public double sort() {
        return Math.random();
    }

    /** The Magicien receives a charm attack
     *
     * @param coup
     * @return life which must be removed from the attacker
     */
    @Override
    public int subitCharme(int coup) {
        this.addVie(0);
        return -(int)(sort()*this.getPouvoir());
    }

    /** Prints information on the considered Magicien
     *
     */
    @Override
    public void printAttributs(){
        System.out.print("(Magicien avec " + pdv + " points de vie et pouvoir de " + this.getPouvoir() + ")");
    }
}
