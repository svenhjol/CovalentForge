package svenhjol.covalent.biomesoplenty;

import svenhjol.charm.base.CharmModule;
import svenhjol.charm.base.enums.IVariantMaterial;
import svenhjol.charm.base.helper.ModHelper;
import svenhjol.charm.base.iface.Module;
import svenhjol.charm.block.BookcaseBlock;
import svenhjol.charm.block.CrateBlock;
import svenhjol.charm.block.VariantBarrelBlock;
import svenhjol.covalent.Covalent;

@Module(mod = Covalent.MOD_ID, description = "Biomes O'Plenty integration")
public class Biomesoplenty extends CharmModule {
    public static VariantBarrelBlock CHERRY_BARREL;
    public static BookcaseBlock CHERRY_BOOKCASE;
    public static CrateBlock CHERRY_CRATE;

    @Override
    public void register() {
        IVariantMaterial cherry = BiomesoplentyMaterial.CHERRY;

        CHERRY_BARREL = new VariantBarrelBlock(this, cherry);
        CHERRY_BOOKCASE = new BookcaseBlock(this, cherry);
        CHERRY_CRATE = new CrateBlock(this, cherry);
    }

    @Override
    public boolean depends() {
        return ModHelper.isLoaded("biomesoplenty");
    }
}
