package net.moritz_htk.advancedmusicmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.moritz_htk.advancedmusicmod.item.AMMItems;

public class AMMModelProvider extends FabricModelProvider {
    public AMMModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AMMItems.MUSIC_DISC_AUGUST, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_CATTAILS, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_CHERRY_BLOSSOM, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_DEATH_OF_KINGS, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_HEDWIG, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_JUST_IN_TIME, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_LAPSE, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_MIDNIGHT_TALE, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_PAIN, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_QUIET, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_SCREEN_SAVER, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_SLEEP, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_TABUK, Models.GENERATED);
        itemModelGenerator.register(AMMItems.MUSIC_DISC_WITH_REGARDS, Models.GENERATED);
    }
}