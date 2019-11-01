package ca.areswg.shadowdestiny.items;

import ca.areswg.shadowdestiny.ShadowDestiny;
import net.minecraft.item.Item;

public class AdamasIngot extends Item{
    public AdamasIngot(){
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ShadowDestiny.setup.itemGroup));
        setRegistryName("adamasingot");
    }
}
