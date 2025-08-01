package net.expiredsprite.moretools.datagen;

import net.expiredsprite.moretools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_INGOT)

                .pattern("NNN")
                .pattern("NAN")
                .pattern("NNN")
                .input('N', Items.GOLD_NUGGET)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_SWORD)

                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.REINFORCED_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REINFORCED_GOLD_INGOT), conditionsFromItem(ModItems.REINFORCED_GOLD_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_PICKAXE)

                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.REINFORCED_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REINFORCED_GOLD_INGOT), conditionsFromItem(ModItems.REINFORCED_GOLD_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_AXE)

                .pattern(" II")
                .pattern(" SI")
                .pattern(" S ")
                .input('I', ModItems.REINFORCED_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REINFORCED_GOLD_INGOT), conditionsFromItem(ModItems.REINFORCED_GOLD_INGOT))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_SHOVEL)

                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.REINFORCED_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REINFORCED_GOLD_INGOT), conditionsFromItem(ModItems.REINFORCED_GOLD_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_GOLD_HOE)

                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.REINFORCED_GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.REINFORCED_GOLD_INGOT), conditionsFromItem(ModItems.REINFORCED_GOLD_INGOT))
                .offerTo(recipeExporter);


    }
}
