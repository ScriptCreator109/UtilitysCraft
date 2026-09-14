package com.utilityscraft;

import com.mojang.logging.LogUtils;
import com.utilityscraft.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(UtilitysCraftMod.MOD_ID)
public class UtilitysCraftMod {

    public static final String MOD_ID = "utilityscraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public UtilitysCraftMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(bus);

        LOGGER.info("UtilitysCraft carregado!");
    }
}
