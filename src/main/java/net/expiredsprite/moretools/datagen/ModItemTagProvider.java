package net.expiredsprite.moretools.datagen;

import net.expiredsprite.moretools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.REINFORCED_GOLD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.REINFORCED_GOLD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.REINFORCED_GOLD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.REINFORCED_GOLD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.REINFORCED_GOLD_HOE);

    }
}
