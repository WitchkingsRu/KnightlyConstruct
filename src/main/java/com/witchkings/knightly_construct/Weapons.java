package com.witchkings.knightly_construct;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.mantle.util.SupplierCreativeTab;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.common.data.tags.MaterialTagProvider;
import slimeknights.tconstruct.library.json.AddToolDataFunction;
import slimeknights.tconstruct.library.json.RandomMaterial;
import slimeknights.tconstruct.library.modifiers.TinkerHooks;
import slimeknights.tconstruct.library.tools.SlotType;
import slimeknights.tconstruct.library.tools.definition.module.IToolModule;
import slimeknights.tconstruct.library.tools.definition.module.ToolModuleHooks;
import slimeknights.tconstruct.library.tools.definition.module.interaction.DualOptionInteraction;
import slimeknights.tconstruct.library.tools.definition.module.interaction.PreferenceSetInteraction;
import slimeknights.tconstruct.library.tools.helper.ModifierLootingHandler;
import slimeknights.tconstruct.library.tools.item.ModifiableItem;
import slimeknights.tconstruct.library.tools.item.ModifiableLauncherItem;
import slimeknights.tconstruct.library.tools.item.ModifiableStaffItem;
import slimeknights.tconstruct.library.utils.BlockSideHitListener;
import slimeknights.tconstruct.tools.TinkerTools;
import slimeknights.tconstruct.tools.ToolDefinitions;
import slimeknights.tconstruct.tools.item.CrystalshotItem;
import slimeknights.tconstruct.tools.item.CrystalshotItem.CrystalshotEntity;
import slimeknights.tconstruct.tools.item.ModifiableBowItem;
import slimeknights.tconstruct.tools.item.ModifiableCrossbowItem;
import slimeknights.tconstruct.tools.item.ModifiableDaggerItem;

public final class Weapons extends TinkerModule {
    public Weapons() {
        SlotType.init();
        BlockSideHitListener.init();
        ModifierLootingHandler.init();
        RandomMaterial.init();
    }

    /** Creative tab for all tool items */
    public static final CreativeModeTab TAB_TOOLS = new SupplierCreativeTab(TConstruct.MOD_ID, "tools", () -> TinkerTools.pickaxe.get().getRenderTool());

    /** Loot function type for tool add data */
    public static final RegistryObject<LootItemFunctionType> lootAddToolData = LOOT_FUNCTIONS.register("add_tool_data", () -> new LootItemFunctionType(AddToolDataFunction.SERIALIZER));

    /*
     * Items
     */
    private static final Item.Properties TOOL = new Item.Properties().stacksTo(1).tab(TAB_TOOLS);

    public static final ItemObject<ModifiableItem> longsword = ITEMS.register("longsword", () -> new ModifiableItem(TOOL, ToolDefinitions.PICKAXE));
}
