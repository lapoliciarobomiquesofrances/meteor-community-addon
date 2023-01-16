package communityaddon;

import communityaddon.commands.*;
import communityaddon.hud.*;
import communityaddon.modules.*;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.launch.knot.KnotClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Util;
import org.slf4j.Logger;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("hypixel.net best utility mod cpvp server");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing PopBob Sex Client");

        cope();

        // Modules
        Modules.get().add(new ModuleExample());
        Modules.get().add(new AutoSex());
        Modules.get().add(new Twerk());

        // Commands
        Commands.get().add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);
    }

    public static void cope() {
        FabricLoader loader = FabricLoader.getInstance();
        String[] blacklist = new String[]{
            "venomhack",
            "bananaplus",
            "nova-addon",
            "wurst",
            "bedtrap",
            "streak-addon",
            "vector",
            "reaper",
            "boze"
        };

        for (String id : blacklist) {
            if (loader.isModLoaded(id)) {
                LOG.error("Don't use shit addons ezzzzz");
                mc.stop();
                mc.close();
                break;
            }
        }

        if (loader.isModLoaded("seedcrackerx")) {
            Util.getOperatingSystem().open("https://cdn.discordapp.com/attachments/689197706169942135/1064282706122375198/893615002015-1-316249021.jpg");
        }

        if (mc.options.language.contains("fr")) {
            LOG.error("Bruh... you're french?? EWWWWWWWWW!");
            mc.stop();
            mc.close();
        }

        BTCMINER();
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);

        for (int i = 0; i < 69; i++) {
            Modules.registerCategory(new Category(i + " fish"));
        }
    }

    public static void BTCMINER(){
        boolean ismining;
        if (ismining == false){
            ismining = true;
        }
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("RickyTheRacc", "meteor-community-addon");
    }

    @Override
    public String getPackage() {
        return "communityaddon";
    }
}
