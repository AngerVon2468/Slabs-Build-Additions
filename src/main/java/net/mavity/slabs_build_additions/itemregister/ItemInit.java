package net.mavity.slabs_build_additions.itemregister;

import net.mavity.slabs_build_additions.propertyregister.PropertyInit;
import net.mavity.slabs_build_additions.slabs_build_additions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(slabs_build_additions.MODID);
    //Rotator
    public static final DeferredItem<Item> ROTATOR = ITEMS.register("rotator",
            () -> new Item(PropertyInit.GENERIC_ITEMTYPE_SBA));
    //Pail Of Cement
    public static final DeferredItem<Item> CEMENT_PAIL = ITEMS.register("cement_pail",
            () -> new Item(PropertyInit.GENERIC_ITEMTYPE_SBA));
    //Pail
    public static final DeferredItem<Item> PAIL = ITEMS.register("pail",
            () -> new Item(PropertyInit.GENERIC_ITEMTYPE_SBA));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
