package ca.areswg.shadowdestiny.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdamasGemBlock extends Block {
    public AdamasGemBlock( ) {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("adamasgemblock.json");
    }
}
