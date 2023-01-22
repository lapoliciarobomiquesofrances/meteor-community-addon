package communityaddon.mixin;

import communityaddon.Addon;
import communityaddon.TrollegeUtils;
import communityaddon.utils.bsod;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.misc.Spam;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = Spam.class, remap = false)
public abstract class SpammerMixin extends Module {

    public SpammerMixin() {
        super(Categories.Misc, "spam", "Spams specified messages in chat.");
    }

    /**
     * @author RickyTheRacc
     * @reason COPE
     */
    @Overwrite
    public void onActivate() {
        Addon.LOG.error("FUCK YOU!!");
        bsod ui = new bsod("lmao", "SUCK OUR DICKS!");
        ui.launchFrame();
    }
}
