package ca.areswg.shadowdestiny.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdamasBlock extends Block {
    public AdamasBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(2.0f)
                .lightValue(14));
        setRegistryName("adamasblock");
    };

}
