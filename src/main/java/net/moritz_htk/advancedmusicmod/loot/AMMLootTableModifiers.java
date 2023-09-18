package net.moritz_htk.advancedmusicmod.loot;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.moritz_htk.advancedmusicmod.item.AMMItems;

import java.util.HashMap;
import java.util.Map;

public class AMMLootTableModifiers {

    private static Identifier createChestIdentifier(String chestType) {
        return new Identifier("minecraft", "chests/" + chestType);
    }

    private static Identifier createVillageChestIdentifier(String villageType) {
        return new Identifier("minecraft", "chests/village/village_" + villageType + "_house");
    }

    private static void addLootToTable(LootTable.Builder tableBuilder, Identifier id, LeafEntry.Builder<?> itemEntry) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(0.65f))
                .with(itemEntry)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
        tableBuilder.pool(poolBuilder.build());
    }

    private static void addLootToChest(LootTable.Builder tableBuilder, Identifier id, ItemEntry.Builder<?> itemEntry) {
        addLootToTable(tableBuilder, id, itemEntry);
    }

    private static void addMusicDiscToChest(LootTable.Builder tableBuilder, Identifier id, Item discItem) {
        addLootToChest(tableBuilder, id, ItemEntry.builder(discItem));
    }

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            Map<Identifier, Item> discMap = new HashMap<>();
            discMap.put(createChestIdentifier("igloo_chest"), AMMItems.MUSIC_DISC_AUGUST);
            discMap.put(createVillageChestIdentifier("plains"), AMMItems.MUSIC_DISC_CATTAILS);
            discMap.put(createVillageChestIdentifier("taiga"), AMMItems.MUSIC_DISC_CATTAILS);
            discMap.put(createVillageChestIdentifier("snowy"), AMMItems.MUSIC_DISC_CATTAILS);
            discMap.put(createVillageChestIdentifier("savanna"), AMMItems.MUSIC_DISC_CATTAILS);
            discMap.put(createVillageChestIdentifier("desert"), AMMItems.MUSIC_DISC_CATTAILS);
            discMap.put(createChestIdentifier("woodland_mansion"), AMMItems.MUSIC_DISC_CHERRY_BLOSSOM);
            discMap.put(createChestIdentifier("stronghold_corridor"), AMMItems.MUSIC_DISC_DEATH_OF_KINGS);
            discMap.put(createChestIdentifier("underwater_ruin_big"), AMMItems.MUSIC_DISC_HEDWIG);
            discMap.put(createChestIdentifier("shipwreck_treasure"), AMMItems.MUSIC_DISC_JUST_IN_TIME);
            discMap.put(createChestIdentifier("ruined_portal"), AMMItems.MUSIC_DISC_LAPSE);
            discMap.put(createChestIdentifier("pillager_outpost"), AMMItems.MUSIC_DISC_MIDNIGHT_TALE);
            discMap.put(createChestIdentifier("ancient_city"), AMMItems.MUSIC_DISC_PAIN);
            discMap.put(createChestIdentifier("buried_treasure"), AMMItems.MUSIC_DISC_QUIET);
            discMap.put(createChestIdentifier("jungle_temple"), AMMItems.MUSIC_DISC_SCREEN_SAVER);
            discMap.put(createChestIdentifier("abandoned_mineshaft"), AMMItems.MUSIC_DISC_SLEEP);
            discMap.put(createChestIdentifier("desert_pyramid"), AMMItems.MUSIC_DISC_TABUK);
            discMap.put(createChestIdentifier("simple_dungeon"), AMMItems.MUSIC_DISC_WITH_REGARDS);

            Item discItem = discMap.get(id);
            if (discItem != null) {
                addMusicDiscToChest(tableBuilder, id, discItem);
            }
        });
    }
}