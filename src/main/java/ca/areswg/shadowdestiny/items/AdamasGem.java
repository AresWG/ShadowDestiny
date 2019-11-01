package ca.areswg.shadowdestiny.items;

import ca.areswg.shadowdestiny.ShadowDestiny;
import net.minecraft.item.Item;

public class AdamasGem extends Item {
    public AdamasGem( ) {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ShadowDestiny.setup.itemGroup));
        setRegistryName("adamasgem");
    }
}
