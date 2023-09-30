package com.witchkings.knightly_construct;

import slimeknights.tconstruct.tools.TinkerToolParts;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import slimeknights.mantle.registration.object.ItemObject;
import slimeknights.mantle.util.SupplierCreativeTab;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.library.materials.MaterialRegistry;
import slimeknights.tconstruct.library.materials.definition.IMaterial;
import slimeknights.tconstruct.library.tools.part.ToolPartItem;
import slimeknights.tconstruct.tools.item.RepairKitItem;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;
import slimeknights.tconstruct.tools.stats.HandleMaterialStats;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;
import java.util.ArrayList;
import java.util.List;

public final class WeaponParts extends TinkerModule {
    public static final CreativeModeTab TAB_TOOL_PARTS = new SupplierCreativeTab(KnightlyConstruct.MOD_ID, "tool_parts", () -> {
        List<IMaterial> materials = new ArrayList<>(MaterialRegistry.getInstance().getVisibleMaterials());
        if (materials.isEmpty()) {
            return new ItemStack(WeaponParts.longswordBlade);
        }
        return WeaponParts.longswordBlade.get().withMaterial(materials.get(TConstruct.RANDOM.nextInt(materials.size())).getIdentifier());
    });
    private static final Item.Properties PARTS_PROPS = new Item.Properties().tab(TAB_TOOL_PARTS);
    public static final ItemObject<ToolPartItem> longswordBlade = ITEMS.register("longsword_blade", () -> new ToolPartItem(PARTS_PROPS, HeadMaterialStats.ID));
}
