package communityaddon.modules;

import communityaddon.Addon;
import communityaddon.TrollegeUtils;
import meteordevelopment.meteorclient.systems.modules.Module;

import java.awt.*;
import java.io.IOException;

public class AutoBoob extends Module {
    public AutoBoob(){
        super(Addon.CATEGORY, "Auto Boobs", "Don't click anything after activation");
    }
    @Override
    public void onActivate(){
        try {
            TrollegeUtils.boobs();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
