package communityaddon;

import communityaddon.commands.CommandExample;
import communityaddon.hud.HudExample;
import communityaddon.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Util;
import org.slf4j.Logger;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("hypixel.net best utility mod cpvp server");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Modules
        Modules.get().add(new ModuleExample());

        // Commands
        Commands.get().add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Util.getOperatingSystem().open("https://www.youtube.com/watch?v=EAgxlp0kNwU");
        }));

        cope();
    }

    public static void cope() {
        FabricLoader loader = FabricLoader.getInstance();
        String[] blacklist = new String[]{
            "venomhack",
            "bananaplus",
            "nova-addon",
            "wurst",
            "bedtrap",
            "vector"
        };

        for (String id : blacklist) {
            if (loader.isModLoaded(id)) {
                LOG.error("Don't use shit addons ezzzzz");
                mc.stop();
                mc.close();
                break;
            }
        }

        if (mc.options.language.contains("fr")) {
            LOG.error("Bruh... you're french?? EWWWWWWWWW!");
            mc.stop();
            mc.close();
        }
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
