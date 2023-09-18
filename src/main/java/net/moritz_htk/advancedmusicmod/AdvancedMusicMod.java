package net.moritz_htk.advancedmusicmod;

import net.fabricmc.api.ModInitializer;

import net.moritz_htk.advancedmusicmod.sound.AMMSoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedMusicMod implements ModInitializer {
	public static final String MOD_ID = "advancedmusicmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AMMSoundEvents.registerSounds();
	}
}