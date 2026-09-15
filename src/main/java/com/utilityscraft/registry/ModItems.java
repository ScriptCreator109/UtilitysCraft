package com.utilityscraft.registry;

import com.utilityscraft.UtilitysCraftMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UtilitysCraftMod.MOD_ID);

    // ===== MARTELOS =====
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new PickaxeItem(Tiers.IRON, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
