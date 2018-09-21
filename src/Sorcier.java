public class Sorcier extends Personnage {

    protected double pouvoir = Math.random();

    public Sorcier(String nom_sorcier, int vie){
        super(nom_sorcier, vie);
    }

    /** The Sorcier launches an attack on a Victime
     *
     * @param p
     */
    @Override
    public void attaque(Victime p){
        if (!p.mort()){
            this.affiche_attaque(p);
            this.addVie(p.subitCharme((int)(this.getPouvoir()*pdv)));
        }
    }

    /** The Sorcier receives a charm attack
     *
     * @param coup
     * @return 0 (the attacker is either a wizard or a magician so it will not steal life with its charm)
     */
    @Override
    public int subitCharme(int coup){
        this.addVie(0);
        return 0;
    }

    /** Launches a counterattack on the attacker
     *
     * @param p
     * @param coup_initial
     */
    @Override
    public void riposte(Victime p, int coup_initial){
        if (!this.mort()) {
            this.affiche_riposte(p);
            int frappe = (int)(this.getPouvoir()*pdv);
            p.subitFrappe(frappe);
        }
        else{
            this.affiche_non_riposte(p);
        }
    }

    /** Allows user to know the power of the Sorcier
     *
     * @return wizard power
     */
    public double getPouvoir(){
        return pouvoir;
    }

    /** The Sorcier receives a physical attack
     *
     * @param coup
     */
    @Override
    public void subitFrappe(int coup){
        this.addVie(-coup);
    }

    /** Prints information on the Sorcier
     *
     */
    @Override
    public void printAttributs(){
        System.out.print("(Sorcier avec " + pdv + " points de vie et pouvoir de " + this.getPouvoir() + ")");
    }
}
