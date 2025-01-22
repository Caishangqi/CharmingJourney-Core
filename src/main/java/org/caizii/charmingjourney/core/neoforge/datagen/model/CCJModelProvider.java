package org.caizii.charmingjourney.core.neoforge.datagen.model;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import org.caizii.charmingjourney.core.common.CharmingJourney;
import org.caizii.charmingjourney.core.common.registration.BlockDeferredRegister;

public class CCJModelProvider extends ModelProvider {
    public CCJModelProvider(PackOutput output) {
        super(output, CharmingJourney.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(BlockDeferredRegister.SILT_BLOCK.get());
        itemModels.generateFlatItem(BlockDeferredRegister.SILT_BLOCK.asItem(), ModelTemplates.FLAT_ITEM);
    }

}
