package net.expiredsprite.moretools.item;

import net.expiredsprite.moretools.MoreTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item REINFORCED_GOLD_INGOT = registerItem("reinforced_gold_ingot", new Item(new Item.Settings()));
    public static final Item REINFORCED_GOLD_SWORD = registerItem("reinforced_gold_sword",
            new SwordItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 3, -2.0f))));
    public static final Item REINFORCED_GOLD_PICKAXE = registerItem("reinforced_gold_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 1, -2.8f))));
    public static final Item REINFORCED_GOLD_AXE = registerItem("reinforced_gold_axe",
            new AxeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 6f, -3.2f))));
    public static final Item REINFORCED_GOLD_SHOVEL = registerItem("reinforced_gold_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 1.5f, -3.0f))));
    public static final Item REINFORCED_GOLD_HOE = registerItem("reinforced_gold_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 0, -3f))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreTools.MOD_ID, name), item);
    }



    public static void registerModItems() {

        MoreTools.LOGGER.info("Registering items for More Tools");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REINFORCED_GOLD_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(REINFORCED_GOLD_SWORD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(REINFORCED_GOLD_PICKAXE);
            entries.add(REINFORCED_GOLD_AXE);
            entries.add(REINFORCED_GOLD_SHOVEL);
            entries.add(REINFORCED_GOLD_HOE);
        });

    }
}
