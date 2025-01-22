package org.caizii.charmingjourney.core.common.registration;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.caizii.charmingjourney.core.common.CharmingJourney;

public class ItemDeferredRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CharmingJourney.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
