package me.aleksilassila.litematica.printer.guides.interaction;

import java.util.Collections;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import me.aleksilassila.litematica.printer.SchematicBlockState;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;

public class EnderEyeGuide extends InteractionGuide {
    public EnderEyeGuide(SchematicBlockState state) {
        super(state);
    }

    @Override
    public boolean canExecute(ClientPlayerEntity player) {
        if (!super.canExecute(player))
            return false;

        if (currentState.contains(Properties.EYE) && targetState.contains(Properties.EYE)) {
            return !currentState.get(Properties.EYE) && targetState.get(Properties.EYE);
        }

        return false;
    }

    @Override
    protected @NotNull List<ItemStack> getRequiredItems() {
        return Collections.singletonList(new ItemStack(Items.ENDER_EYE));
    }
}
