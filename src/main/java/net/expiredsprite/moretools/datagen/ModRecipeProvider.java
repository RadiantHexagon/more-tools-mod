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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_SWORD)

                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.BRONZE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_PICKAXE)

                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.BRONZE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_AXE)

                .pattern("II")
                .pattern("SI")
                .pattern("S ")
                .input('I', ModItems.BRONZE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_SHOVEL)

                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.BRONZE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_HOE)

                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.BRONZE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(recipeExporter);

        // Copper Stuff :D

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COPPER_INGOT)

                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', ModItems.COPPER_NUGGET)
                .criterion(hasItem(ModItems.COPPER_NUGGET), conditionsFromItem(ModItems.COPPER_NUGGET))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SWORD)

                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PICKAXE)

                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_AXE)

                .pattern("II")
                .pattern("SI")
                .pattern("S ")
                .input('I', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SHOVEL)

                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HOE)

                .pattern("II")
                .pattern("S ")
                .pattern("S ")
                .input('I', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HELMET)

                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .input('I', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_CHESTPLATE)

                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_LEGGINGS)

                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_BOOTS)

                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .input('I', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);



    }
}
