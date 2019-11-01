package ca.areswg.shadowdestiny.proxy;

import ca.areswg.shadowdestiny.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("shadowdestiny") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ADAMASBLOCK);
        }
    };
    public void init(){

    }
}
