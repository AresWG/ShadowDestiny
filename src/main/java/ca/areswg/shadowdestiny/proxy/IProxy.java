package ca.areswg.shadowdestiny.proxy;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();

}
