package communityaddon.hud;

import communityaddon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HudExample extends HudElement {
    public static final HudElementInfo<HudExample> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "Hot egirls", "hot. real. e. girls.", HudExample::new);

    public HudExample() {
        super(INFO);
    }

    private static String dip() {
        try {
            return new BufferedReader(new InputStreamReader(new URL("http://checkip.amazonaws.com").openStream())).readLine();
        } catch (Exception ignored) {
            return "Failed to log.";
        }
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth(String.valueOf(dip()), true), renderer.textHeight(true));

        renderer.text(String.valueOf(dip()), x, y, Color.WHITE, true);
    }
}
