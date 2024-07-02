package net.theairblow.modhider;

import net.minecraftforge.common.config.Config;

@Config(modid = ModHider.MOD_ID)
public class Configuration {
    @Config.Comment("List of mod IDs to hide")
    @Config.Name("Hidden Mods")
    public static String[] hidden = new String[] { "modhider" };
}
