package me.aleksilassila.litematica.printer.guides.interaction;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import me.aleksilassila.litematica.printer.SchematicBlockState;
import net.minecraft.block.AbstractCandleBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;

public class LightCandleGuide extends InteractionGuide {
    boolean shouldBeLit;
    boolean isLit;

    public LightCandleGuide(SchematicBlockState state) {
        super(state);

        shouldBeLit = getProperty(targetState, Properties.LIT).orElse(false);
        isLit = getProperty(currentState, Properties.LIT).orElse(false);
    }

    @Override
    protected @NotNull List<ItemStack> getRequiredItems() {
        return Collections.singletonList(new ItemStack(Items.FLINT_AND_STEEL));
    }

    @Override
    public boolean canExecute(ClientPlayerEntity player) {
        if (!super.canExecute(player))
            return false;

        return (currentState.getBlock() instanceof AbstractCandleBlock) && shouldBeLit && !isLit;
    }
}
