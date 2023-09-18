package net.moritz_htk.advancedmusicmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.moritz_htk.advancedmusicmod.item.AMMItems;

import java.util.concurrent.CompletableFuture;

public class AMMItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public AMMItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(AMMItems.MUSIC_DISC_AUGUST)
                .add(AMMItems.MUSIC_DISC_CATTAILS)
                .add(AMMItems.MUSIC_DISC_CHERRY_BLOSSOM)
                .add(AMMItems.MUSIC_DISC_DEATH_OF_KINGS)
                .add(AMMItems.MUSIC_DISC_HEDWIG)
                .add(AMMItems.MUSIC_DISC_JUST_IN_TIME)
                .add(AMMItems.MUSIC_DISC_LAPSE)
                .add(AMMItems.MUSIC_DISC_MIDNIGHT_TALE)
                .add(AMMItems.MUSIC_DISC_PAIN)
                .add(AMMItems.MUSIC_DISC_QUIET)
                .add(AMMItems.MUSIC_DISC_SCREEN_SAVER)
                .add(AMMItems.MUSIC_DISC_SLEEP)
                .add(AMMItems.MUSIC_DISC_TABUK)
                .add(AMMItems.MUSIC_DISC_WITH_REGARDS);
    }
}