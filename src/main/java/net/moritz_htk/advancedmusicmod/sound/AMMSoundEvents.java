package net.moritz_htk.advancedmusicmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.moritz_htk.advancedmusicmod.AdvancedMusicMod;

public class AMMSoundEvents {
    public static final SoundEvent MUSIC_DISC_AUGUST = registerSoundEvent("music_disc.august");
    public static final SoundEvent MUSIC_DISC_CATTAILS = registerSoundEvent("music_disc.cattails");
    public static final SoundEvent MUSIC_DISC_CHERRY_BLOSSOM = registerSoundEvent("music_disc.cherry_blossom");
    public static final SoundEvent MUSIC_DISC_DEATH_OF_KINGS = registerSoundEvent("music_disc.death_of_kings");
    public static final SoundEvent MUSIC_DISC_HEDWIG = registerSoundEvent("music_disc.hedwig");
    public static final SoundEvent MUSIC_DISC_JUST_IN_TIME = registerSoundEvent("music_disc.just_in_time");
    public static final SoundEvent MUSIC_DISC_LAPSE = registerSoundEvent("music_disc.lapse");
    public static final SoundEvent MUSIC_DISC_MIDNIGHT_TALE = registerSoundEvent("music_disc.midnight_tale");
    public static final SoundEvent MUSIC_DISC_PAIN = registerSoundEvent("music_disc.pain");
    public static final SoundEvent MUSIC_DISC_QUIET = registerSoundEvent("music_disc.quiet");
    public static final SoundEvent MUSIC_DISC_SCREEN_SAVER = registerSoundEvent("music_disc.screen_saver");
    public static final SoundEvent MUSIC_DISC_SLEEP = registerSoundEvent("music_disc.sleep");
    public static final SoundEvent MUSIC_DISC_TABUK = registerSoundEvent("music_disc.tabuk");
    public static final SoundEvent MUSIC_DISC_WITH_REGARDS = registerSoundEvent("music_disc.with_regards");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(AdvancedMusicMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        AdvancedMusicMod.LOGGER.info("Registering SoundEvents for " + AdvancedMusicMod.MOD_ID);
    }
}