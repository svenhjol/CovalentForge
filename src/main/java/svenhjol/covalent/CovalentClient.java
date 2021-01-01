package svenhjol.covalent;

import svenhjol.charm.base.CharmClientLoader;

public class CovalentClient {
    public CovalentClient() {
        new CharmClientLoader(Covalent.MOD_ID);
    }
}
