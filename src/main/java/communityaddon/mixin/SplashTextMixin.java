package communityaddon.mixin;

/**
 * @breathe air
 */

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class SplashTextMixin {
    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    private void onApply(CallbackInfoReturnable<String> cir) {
        if (String.valueOf(MinecraftClient.getInstance().getSession().getUuid()).equals("ed0e5af2-b40e-4a44-b00f-39c7d67f398c") || (String.valueOf(MinecraftClient.getInstance().getSession().getUuid()).equals("ed0e5af2b40e4a44b00f39c7d67f398c"))) {
            // ricky troll
            cir.setReturnValue("I am ricky and I Love EurekaEffect's hot cum");
        } else {
            cir.setReturnValue("Crosby Owns Me and All! >:)");
        }
    }
}
