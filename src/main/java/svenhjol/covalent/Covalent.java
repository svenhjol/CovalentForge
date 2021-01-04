package svenhjol.covalent;
import net.minecraftforge.fml.common.Mod;
import svenhjol.charm.base.CharmLoader;
import svenhjol.covalent.atmospheric.Atmospheric;
import svenhjol.covalent.autumnity.Autumnity;
import svenhjol.covalent.biomesoplenty.Biomesoplenty;
import svenhjol.covalent.endergetic.Endergetic;

import java.util.Arrays;

@Mod(Covalent.MOD_ID)
public class Covalent {
    public static final String MOD_ID = "covalent";

    public Covalent() {
        new CharmLoader(MOD_ID, Arrays.asList(
            Biomesoplenty.class,
            Endergetic.class,
            Atmospheric.class,
            Autumnity.class

        ));
    }
}
