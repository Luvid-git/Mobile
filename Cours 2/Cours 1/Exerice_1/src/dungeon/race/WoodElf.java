package dungeon.race;

import dungeon.Personnage;

/**
 * WoodElf class : permet la création d'un wood elf.
 */
public class WoodElf extends Personnage {

    /**
     * Constructor.
     *
     * @param force Force
     * @param intelligence Intelligence
     * @param sagesse Sagesse + 1
     * @param dexterity Déxtérité + 2
     * @param constitution Constitution
     * @param charisme Charisme
     */
    public WoodElf(int force, int intelligence, int sagesse, int dexterity, int constitution, int charisme) {
        super(force, intelligence, sagesse, dexterity, constitution, charisme);
        doRace();
    }

    @Override
    public void doRace() {
        setDexterity(getDexterity() + 2);
        setSagesse(getSagesse() + 1);
    }

    @Override
    public void afficheStats() {
        System.out.println("|=======WoodElf=======|\n" +
                           "| Force:            " + getForce() + " \n" +
                           "| Intelligence:     " + getIntelligence() + " \n" +
                           "| Sagesse:          " + getSagesse() + " \n" +
                           "| Déxterité:        " + getDexterity() + " \n" +
                           "| Constitution:     " + getConstitution() + " \n" +
                           "| Charisme:         " + getCharisme() + " \n" +
                           "|=====================|");
    }
}
