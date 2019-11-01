package ca.areswg.shadowdestiny;

import ca.areswg.shadowdestiny.blocks.AdamasBlock;
import ca.areswg.shadowdestiny.blocks.AdamasGemBlock;
import ca.areswg.shadowdestiny.blocks.ModBlocks;
import ca.areswg.shadowdestiny.items.AdamasGem;
import ca.areswg.shadowdestiny.items.AdamasIngot;
import ca.areswg.shadowdestiny.proxy.ClientProxy;
import ca.areswg.shadowdestiny.proxy.IProxy;
import ca.areswg.shadowdestiny.proxy.ModSetup;
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
public class ShadowDestiny {

    public static IProxy proxy = DistExecutor.runForDist(() -> () ->  new ClientProxy(), () -> () -> new ServerProxy());
    public static ModSetup setup = new ModSetup();
    private static final Logger LOGGER = LogManager.getLogger();

    public ShadowDestiny() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        // MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }



    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new AdamasBlock());
            event.getRegistry().register(new AdamasGemBlock());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties =new Item.Properties()
                    .group(setup.itemGroup);
            //Blocks
            event.getRegistry().register(new BlockItem(ModBlocks.ADAMASBLOCK, properties).setRegistryName("adamasblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.ADAMASGEMBLOCK, properties).setRegistryName("adamasgemblock.json"));
            //Items
            event.getRegistry().register(new AdamasIngot());
            event.getRegistry().register(new AdamasGem());
        }
    }
}