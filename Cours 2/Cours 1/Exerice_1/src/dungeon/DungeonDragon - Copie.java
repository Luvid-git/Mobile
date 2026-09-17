package dungeon;

import dungeon.race.Elf;
import dungeon.race.HighElf;
import dungeon.race.WoodElf;

/**
 * DungeonDragon class : l'application.
 */
public class DungeonDragon {
    /**
     * Main méthode : permet l'affichage console.
     *
     * @param args console
     */
    public static void main(String[] args) {
        Elf elf = new Elf(15, 14, 13, 12, 10, 8);
        elf.afficheStats();

        WoodElf woodElf = new WoodElf(15, 14, 13, 12, 10, 8);
        woodElf.afficheStats();

        HighElf highElf = new HighElf(15, 14, 13, 12, 10, 8);
        highElf.afficheStats();
    }
}