package fuzs.tradingpost.init;

import fuzs.puzzleslib.api.init.v2.RegistryManager;
import fuzs.puzzleslib.api.init.v2.RegistryReference;
import fuzs.tradingpost.TradingPost;
import fuzs.tradingpost.world.inventory.TradingPostMenu;
import fuzs.tradingpost.world.level.block.TradingPostBlock;
import fuzs.tradingpost.world.level.block.entity.TradingPostBlockEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ModRegistry {
    static final RegistryManager REGISTRY = RegistryManager.instant(TradingPost.MOD_ID);
    public static final RegistryReference<Block> TRADING_POST_BLOCK = REGISTRY.registerBlock("trading_post", () -> new TradingPostBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryReference<Item> TRADING_POST_ITEM = REGISTRY.registerBlockItem(TRADING_POST_BLOCK);
    public static final RegistryReference<BlockEntityType<TradingPostBlockEntity>> TRADING_POST_BLOCK_ENTITY_TYPE = REGISTRY.registerBlockEntityType("trading_post", () -> BlockEntityType.Builder.of(TradingPostBlockEntity::new, TRADING_POST_BLOCK.get()));
    public static final RegistryReference<MenuType<TradingPostMenu>> TRADING_POST_MENU_TYPE = REGISTRY.registerMenuType("trading_post", () -> TradingPostMenu::new);
    public static final TagKey<EntityType<?>> BLACKLISTED_TRADERS_TAG = REGISTRY.createEntityTypeTag("blacklisted_traders");

    public static void touch() {

    }
}
