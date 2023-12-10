package me.aleksilassila.litematica.printer.guides.placement;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import me.aleksilassila.litematica.printer.SchematicBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class FlowerPotGuide extends GeneralPlacementGuide {
    public FlowerPotGuide(SchematicBlockState state) {
        super(state);
    }

    @Override
    protected @NotNull List<ItemStack> getRequiredItems() {
        return Collections.singletonList(new ItemStack(Items.FLOWER_POT));
    }
}
