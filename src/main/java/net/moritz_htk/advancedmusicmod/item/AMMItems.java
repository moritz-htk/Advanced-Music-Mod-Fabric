package net.moritz_htk.advancedmusicmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;
import net.moritz_htk.advancedmusicmod.sound.AMMSoundEvents;

public class AMMItems {
    public final static Item MUSIC_DISC_AUGUST = registerMusicDiscItem("music_disc_august", AMMSoundEvents.MUSIC_DISC_AUGUST, 191);
    public static final Item MUSIC_DISC_CATTAILS = registerMusicDiscItem("music_disc_cattails", AMMSoundEvents.MUSIC_DISC_CATTAILS, 156);
    public static final Item MUSIC_DISC_CHERRY_BLOSSOM = registerMusicDiscItem("music_disc_cherry_blossom", AMMSoundEvents.MUSIC_DISC_CHERRY_BLOSSOM, 127);
    public static final Item MUSIC_DISC_DEATH_OF_KINGS = registerMusicDiscItem("music_disc_death_of_kings", AMMSoundEvents.MUSIC_DISC_DEATH_OF_KINGS, 143);
    public static final Item MUSIC_DISC_HEDWIG = registerMusicDiscItem("music_disc_hedwig", AMMSoundEvents.MUSIC_DISC_HEDWIG, 175);
    public static final Item MUSIC_DISC_JUST_IN_TIME = registerMusicDiscItem("music_disc_just_in_time", AMMSoundEvents.MUSIC_DISC_JUST_IN_TIME, 202);
    public static final Item MUSIC_DISC_LAPSE = registerMusicDiscItem("music_disc_lapse", AMMSoundEvents.MUSIC_DISC_LAPSE, 117);
    public static final Item MUSIC_DISC_MIDNIGHT_TALE = registerMusicDiscItem("music_disc_midnight_tale", AMMSoundEvents.MUSIC_DISC_MIDNIGHT_TALE, 153);
    public static final Item MUSIC_DISC_PAIN = registerMusicDiscItem("music_disc_pain", AMMSoundEvents.MUSIC_DISC_PAIN, 174);
    public static final Item MUSIC_DISC_QUIET = registerMusicDiscItem("music_disc_quiet", AMMSoundEvents.MUSIC_DISC_QUIET, 148);
    public static final Item MUSIC_DISC_SCREEN_SAVER = registerMusicDiscItem("music_disc_screen_saver", AMMSoundEvents.MUSIC_DISC_SCREEN_SAVER, 176);
    public static final Item MUSIC_DISC_SLEEP = registerMusicDiscItem("music_disc_sleep", AMMSoundEvents.MUSIC_DISC_SLEEP, 203);
    public static final Item MUSIC_DISC_TABUK = registerMusicDiscItem("music_disc_tabuk", AMMSoundEvents.MUSIC_DISC_TABUK, 156);
    public static final Item MUSIC_DISC_WITH_REGARDS = registerMusicDiscItem("music_disc_with_regards", AMMSoundEvents.MUSIC_DISC_WITH_REGARDS, 175);

    private static MusicDiscItem registerMusicDiscItem(String name, SoundEvent sound, int lengthInSeconds) {
        return Registry.register(Registries.ITEM, new Identifier(AdvancedMusicMod.MOD_ID, name), new MusicDiscItem(9, sound, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), lengthInSeconds));
    }

    public static void registerModItems() {
        AdvancedMusicMod.LOGGER.info("Registering Items for " + AdvancedMusicMod.MOD_ID);
    }
}