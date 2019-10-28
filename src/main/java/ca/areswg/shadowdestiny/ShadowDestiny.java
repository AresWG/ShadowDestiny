package ca.areswg.shadowdestiny;

import ca.areswg.shadowdestiny.blocks.AdamasBlock;
import ca.areswg.shadowdestiny.blocks.ModsBlocks;
import ca.areswg.shadowdestiny.proxy.ClientProxy;
import ca.areswg.shadowdestiny.proxy.IProxy;
import ca.areswg.shadowdestiny.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("shadowdestiny")
public class ShadowDestiny
{
    public static IProxy proxy = DistExecutor.runForDist( () -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ShadowDestiny() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new AdamasBlock());
        }
        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event){
            event.getRegistry().register(new BlockItem(ModsBlocks.ADAMASBLOCK, new Item.Properties()).setRegistryName("adamasblock"));
        }
    }
}
