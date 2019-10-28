package ca.areswg.shadowdestiny.proxy;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only Run this on the client");
    }
}
