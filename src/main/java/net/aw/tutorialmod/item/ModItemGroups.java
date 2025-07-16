package net.aw.tutorialmod.item;

import net.aw.tutorialmod.TutorialMod;
import net.aw.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "mod_items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TOKAN))
                            .displayName(Text.translatable("itemgroup.tutorialmod.mod_items"))
                            .entries(((displayContext, entries) -> {
                                entries.add(ModItems.TOKAN);
                                entries.add(ModItems.PIG_TOKAN);
                                entries.add(ModBlocks.LEMON_LOG);
                                entries.add(ModBlocks.LEMON_BRICKS);


                            })).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("REgistering ITem Groups for " + TutorialMod.MOD_ID);
    }
}
