package net.moritz_htk.advancedmusicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

public class AMMItemGroup {
    public static final RegistryKey<ItemGroup> ADVANCED_MUSIC_MOD_TAB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(AdvancedMusicMod.MOD_ID, "advanced_music_mod_tab"));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, ADVANCED_MUSIC_MOD_TAB, FabricItemGroup.builder().displayName(Text.literal("Advanced Music Mod")).icon(() -> new ItemStack(AMMItems.MUSIC_DISC_AUGUST)).build());
        AdvancedMusicMod.LOGGER.info("Registering ItemGroup for " + AdvancedMusicMod.MOD_ID);
    }
}