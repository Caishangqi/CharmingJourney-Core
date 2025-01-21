package org.caizii.charmingjourney.core.neoforge.datagen.model;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import org.caizii.charmingjourney.core.common.CharmingJourney;

public class CCJModelProvider extends ModelProvider {
    public CCJModelProvider(PackOutput output) {
        super(output, CharmingJourney.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(CharmingJourney.SILT_BLOCK.get());
        itemModels.generateFlatItem(CharmingJourney.SILT_BLOCK_ITEM.get(), ModelTemplates.FLAT_ITEM);
    }

}
