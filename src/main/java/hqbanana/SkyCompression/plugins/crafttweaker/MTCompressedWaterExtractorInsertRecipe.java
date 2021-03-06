package hqbanana.SkyCompression.plugins.crafttweaker;

import java.util.Arrays;
import java.util.Collections;

import com.bartz24.skyresources.recipe.ProcessRecipe;

import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import hqbanana.SkyCompression.AdditionalProcessRecipesManager;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.sc.compressedwaterextractor.insert")
public class MTCompressedWaterExtractorInsertRecipe extends MTRecipeBase
{
	@ZenMethod
	public static void addRecipe(IItemStack output, IIngredient input, int waterIn)
	{
		addRecipe(
				new ProcessRecipe(
						Arrays.asList(AdditionalCraftTweakerPlugin.toStack(output)),
						Arrays.asList(AdditionalCraftTweakerPlugin.toObject(input),
								new FluidStack(FluidRegistry.WATER, waterIn)), 0, "compressedWaterExtractor-insert"),
				AdditionalProcessRecipesManager.compressedWaterExtractorInsertionRecipes);
	}

	@ZenMethod
	public static void removeRecipe(IIngredient output)
	{
		removeRecipe(new ProcessRecipe(Arrays.asList(AdditionalCraftTweakerPlugin.toObject(output)), Collections.emptyList(), 0,
				"compressedWaterExtractor-insert"), AdditionalProcessRecipesManager.compressedWaterExtractorInsertionRecipes);
	}

}