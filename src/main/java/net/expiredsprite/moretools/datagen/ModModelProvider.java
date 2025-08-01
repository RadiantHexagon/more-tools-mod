package net.expiredsprite.moretools.datagen;

import net.expiredsprite.moretools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        /* blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ID); */

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.REINFORCED_GOLD_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.REINFORCED_GOLD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLD_HOE, Models.HANDHELD);

    }
}
