package communityaddon.modules;

import communityaddon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.CATEGORY, "Franky", "Does Exactly What You Think It Does.");
    }
}
