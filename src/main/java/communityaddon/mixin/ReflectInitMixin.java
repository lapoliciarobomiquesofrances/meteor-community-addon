package communityaddon.mixin;

import meteordevelopment.meteorclient.utils.ReflectInit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(value = ReflectInit.class, remap = false)
public abstract class ReflectInitMixin {
    @Shadow @Final private static List<String> packages;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void trolly(CallbackInfo ci) {
        packages.addAll(List.of("io", "com", "net", "org", "meteordevelopment", "ca"));
    }
}
