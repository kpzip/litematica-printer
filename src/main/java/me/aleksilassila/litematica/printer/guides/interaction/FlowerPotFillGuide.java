package me.aleksilassila.litematica.printer.guides.interaction;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import me.aleksilassila.litematica.printer.SchematicBlockState;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;

public class FlowerPotFillGuide extends InteractionGuide {
    private final Block content;

    public FlowerPotFillGuide(SchematicBlockState state) {
        super(state);

        Block targetBlock = state.targetState.getBlock();
        if (targetBlock instanceof FlowerPotBlock) {
            this.content = ((FlowerPotBlock) targetBlock).getContent();
        } else {
            this.content = null;
        }
    }

    @Override
    public boolean canExecute(ClientPlayerEntity player) {
        if (content == null)
            return false;
        if (!(currentState.getBlock() instanceof FlowerPotBlock))
            return false;

        return super.canExecute(player);
    }

    @Override
    protected @NotNull List<ItemStack> getRequiredItems() {
        if (content == null)
            return Collections.emptyList();
        else
            return Collections.singletonList(new ItemStack(content));
    }
}
