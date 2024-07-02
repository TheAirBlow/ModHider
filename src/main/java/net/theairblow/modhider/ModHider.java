package net.theairblow.modhider;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModHider.MOD_ID, name = ModHider.MOD_NAME,
        version = ModHider.VERSION, clientSideOnly = true)
public class ModHider {
    public static final String MOD_ID = "modhider";
    public static final String MOD_NAME = "ModHider";
    public static final String VERSION = "1.0.0";
    public static KeyBinding[] keybinds;
    public static Logger LOGGER;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
    }
}
