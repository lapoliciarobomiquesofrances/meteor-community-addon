package communityaddon.hud;

import communityaddon.Addon;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Hudtwo extends HudElement {
    public static final HudElementInfo<Hudtwo> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "ricky the racc", "hot. real. e. girls.", Hudtwo::new);

    public Hudtwo() {
        super(INFO);
    }


    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth(String.valueOf(Addon.eurekawatermark()), true), renderer.textHeight(true));

        renderer.text(String.valueOf(Addon.eurekawatermark()), x, y, Color.WHITE, true);
    }
}
