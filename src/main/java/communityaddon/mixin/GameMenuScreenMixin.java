package communityaddon.mixin;

import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameMenuScreen.class)
public class GameMenuScreenMixin extends Screen {
    protected GameMenuScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "initWidgets", at = @At("RETURN"))
    void goodbutton(CallbackInfo ci) {
        addDrawableChild(
            new ButtonWidget.Builder(Text.literal("Samuel Ian Yoder"), button -> {
                Util.getOperatingSystem().open("https://www.pornhub.com/gay/categories");
            })
                .position(this.width - 75 - 3, 3)
                .size(75, 20)
                .build()
        );
    }
}
