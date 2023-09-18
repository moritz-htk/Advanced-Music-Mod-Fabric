package net.moritz_htk.advancedmusicmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

public class AMMItemGroup {
    static ItemGroup ADVANCED_MUSIC_MOD_TAB;

    public static void registerItemGroups() {
        ADVANCED_MUSIC_MOD_TAB = FabricItemGroup.builder(new Identifier(AdvancedMusicMod.MOD_ID, "advanced_music_mod_tab")).displayName(Text.literal("Advanced Music Mod")).icon(() -> new ItemStack(AMMItems.MUSIC_DISC_AUGUST)).build();
        AdvancedMusicMod.LOGGER.info("Registering ItemGroup for " + AdvancedMusicMod.MOD_ID);
    }
}