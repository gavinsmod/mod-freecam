package com.peasenet.mod;

import com.peasenet.main.GavinsMod;
import com.peasenet.mods.misc.ModFreeCam;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FreeCamMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModFreeCam());
    }
}
