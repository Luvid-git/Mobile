package dungeon.race;

import dungeon.Personnage;

/**
 * Elf class : permet la création d'un elf.
 */
public class Elf extends Personnage {

    /**
     * Constructor.
     *
     * @param force Force
     * @param intelligence Intelligence
     * @param sagesse Sagesse
     * @param dexterity Dextérité
     * @param constitution Constitution + 2
     * @param charisme Charisme
     */
    public Elf(int force, int intelligence, int sagesse, int dexterity, int constitution, int charisme) {
        super(force, intelligence, sagesse, dexterity, constitution, charisme);
        doRace();
    }

    @Override
    public void doRace() {
        setDexterity(getDexterity() + 2);
    }

    @Override
    public void afficheStats() {
        System.out.println("|=========Elf=========|\n" +
                           "| Force:            " + getForce() + " \n" +
                           "| Intelligence:     " + getIntelligence() + " \n" +
                           "| Sagesse:          " + getSagesse() + " \n" +
                           "| Déxterité:        " + getDexterity() + " \n" +
                           "| Constitution:     " + getConstitution() + " \n" +
                           "| Charisme:         " + getCharisme() + " \n" +
                           "|=====================|");
    }
}
