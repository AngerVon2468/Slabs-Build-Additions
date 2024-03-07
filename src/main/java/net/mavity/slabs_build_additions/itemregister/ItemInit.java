package net.mavity.slabs_build_additions.itemregister;

import net.mavity.slabs_build_additions.slabs_build_additions;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(slabs_build_additions.MODID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
