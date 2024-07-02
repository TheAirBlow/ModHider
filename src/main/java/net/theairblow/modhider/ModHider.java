package net.theairblow.modhider;

import net.minecraftforge.fml.common.Mod;
import zone.rong.mixinbooter.ILateMixinLoader;
import java.util.Collections;
import java.util.List;

@Mod(modid = ModHider.MOD_ID, name = ModHider.MOD_NAME,
        version = ModHider.VERSION, clientSideOnly = true)
public class ModHider implements ILateMixinLoader {
    public static final String MOD_ID = "modhider";
    public static final String MOD_NAME = "ModHider";
    public static final String VERSION = "1.0.0";

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("mixins.json");
    }
}
