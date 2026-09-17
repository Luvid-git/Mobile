package dungeon.race;

import dungeon.Personnage;

/**
 * HighElf class : permet création de high elf.
 */
public class HighElf extends Personnage {

    /**
     * Constructor.
     *
     * @param force Force
     * @param intelligence Intelligence + 1
     * @param sagesse Sagesse
     * @param dexterity Dextérité
     * @param constitution Constitution
     * @param charisme Charisme
     */
    public HighElf(int force, int intelligence, int sagesse, int dexterity, int constitution, int charisme) {
        super(force, intelligence, sagesse, dexterity, constitution, charisme);
        doRace();
    }

    @Override
    public void doRace() {
        setDexterity(getDexterity() + 2);
        setIntelligence(getIntelligence() + 1);
    }

    @Override
    public void afficheStats() {
        System.out.println("|=======HighElf=======|\n" +
                           "| Force:            " + getForce() + " \n" +
                           "| Intelligence:     " + getIntelligence() + " \n" +
                           "| Sagesse:          " + getSagesse() + " \n" +
                           "| Déxterité:        " + getDexterity() + " \n" +
                           "| Constitution:     " + getConstitution() + " \n" +
                           "| Charisme:         " + getCharisme() + " \n" +
                           "|=====================|");
    }
}
