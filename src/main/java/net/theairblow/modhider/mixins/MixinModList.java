package net.theairblow.modhider;

import com.google.common.collect.Maps;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.network.handshake.FMLHandshakeMessage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Map;

@Mixin(FMLHandshakeMessage.ModList.class)
public abstract class MixinModList {
    @Shadow
    private Map<String, String> modTags = Maps.newHashMap();

    @Inject(method = "<init>(Ljava/util/List;)V", at = @At("RETURN"))
    public void create(List<ModContainer> modList, CallbackInfo ci) {
        for (ModContainer mod : modList) {
            if (Configuration.hidden.contains(mod.getModId())) continue;
            modTags.put(mod.getModId(), mod.getVersion());
        }
    }
}
