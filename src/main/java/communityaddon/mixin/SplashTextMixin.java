package communityaddon.mixin;

import net.minecraft.client.resource.SplashTextResourceSupplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashTextResourceSupplier.class)
public class SplashTextMixin {
    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    private void onApply(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("Crosby Owns Me and All! >:)");
    }
}
