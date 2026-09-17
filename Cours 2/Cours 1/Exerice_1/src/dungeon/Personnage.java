package dungeon;

/**
 * Personnage class abstraite : il est le parent des races.
 */
public abstract class Personnage implements Race {
    /**
     * protected : Force du personnage.
     */
    private int force;
    /**
     * protected : Intelligence du personnage.
     */
    private int intelligence;

    /**
     * protected : Sagesse du personnage.
     */
    private int sagesse;
    /**
     * protected : Dextérité du personnage.
     */
    private int dexterity;
    /**
     * protected : Constitution du personnage.
     */
    private int constitution;
    /**
     * protected : Charisme du personnage.
     */
    private int charisme;

    /**
     * Constructor.
     *
     * @param force Force.
     * @param intelligence Intelligence.
     * @param sagesse Sagesse.
     * @param dexterity Déxtérité.
     * @param constitution Constitution.
     * @param charisme Charisme.
     */
    public Personnage(int force, int intelligence, int sagesse, int dexterity, int constitution, int charisme) {
        this.force = force;
        this.intelligence = intelligence;
        this.sagesse = sagesse;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.charisme = charisme;
    }

    protected int getForce() {
        return force;
    }

    protected int getIntelligence() {
        return intelligence;
    }

    protected int getSagesse() {
        return sagesse;
    }

    protected int getDexterity() {
        return dexterity;
    }

    protected int getConstitution() {
        return constitution;
    }

    protected int getCharisme() {
        return charisme;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    /**
     * doRace abstract methode : permet d'avoir les attribues de la race.
     */
    public abstract void doRace();

    /**
     * afficheStats abstract methode : permet d'afficher les stats du personnage.
     */
    public abstract void afficheStats();
}