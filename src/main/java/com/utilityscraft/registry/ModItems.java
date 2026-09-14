package com.utilityscraft.registry;

import com.utilityscraft.UtilitysCraftMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UtilitysCraftMod.MOD_ID);

    // Item de teste — vai ser substituído depois
    public static final RegistryObject<Item> TEST_SWORD = ITEMS.register("test_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
