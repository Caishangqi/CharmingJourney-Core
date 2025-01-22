package org.caizii.charmingjourney.core.common.registration;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.caizii.charmingjourney.core.common.CharmingJourney;
import org.caizii.charmingjourney.core.common.block.SiltBlock;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockDeferredRegister {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CharmingJourney.MODID);

    public static final DeferredBlock<Block> SILT_BLOCK = registerBlock("silt", SiltBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends T> func) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, func);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ItemDeferredRegister.ITEMS.registerSimpleBlockItem(name, block);
    }
}
