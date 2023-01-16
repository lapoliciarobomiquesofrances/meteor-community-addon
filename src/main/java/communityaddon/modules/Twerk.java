package communityaddon.modules;

import communityaddon.Addon;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

public class Twerk extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    // General
    private final Setting<Double> twerkDelay = sgGeneral.add(new DoubleSetting.Builder()
            .name("Twerk Delay")
            .description("In Millis.")
            .defaultValue(4)
            .min(2)
            .sliderRange(2,100)
            .build()
    );

    public Twerk() {
        super(Addon.CATEGORY, "twerk", "Twerk like the true queen Miley Cyrus.");
    }

    private boolean upp = false;
    StopWatch twerkTimer = StopWatch.create();

    @Override
    public void onActivate(){
        twerkTimer.start();
        upp = mc.player.isSneaking();
    }

    @EventHandler
    private void onRender3D(Render3DEvent event){
        if (twerkTimer.getTime(TimeUnit.MILLISECONDS) >= twerkDelay.get()) {
            twerkTimer.reset();
            upp = !upp;
        }
    }

    @Override
    public void onDeactivate() {
        upp = false;
        mc.options.sneakKey.setPressed(false);
        twerkTimer.stop();
        twerkTimer.reset();
    }
}
