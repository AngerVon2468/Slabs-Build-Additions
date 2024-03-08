package net.mavity.slabs_build_additions.itemregister;

import net.mavity.slabs_build_additions.slabs_build_additions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(slabs_build_additions.MODID);
    public static final DeferredItem<Item> ROTATOR = ITEMS.register("rotator",
            () -> new Item(new Item.Properties().stacksTo(1).durability(0).fireResistant()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
