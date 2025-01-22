package org.caizii.charmingjourney.core.common.registration;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.caizii.charmingjourney.core.common.CharmingJourney;

public class CreativeTabRegister {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CharmingJourney.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EARTH_TAB = CREATIVE_MODE_TABS.register("earth_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.charmingjourney.earth_tab")).withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> BlockDeferredRegister.SILT_BLOCK.asItem().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(BlockDeferredRegister.SILT_BLOCK.asItem());
    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
