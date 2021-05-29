package tk.zenithseeker.nofog.mixin;

import net.minecraft.client.renderer.DimensionSpecialEffects;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DimensionSpecialEffects.NetherEffects.class)
public class DimensionSpecialEffectsMixin {
	@Overwrite
	public boolean isFoggyAt(int a, int b) {
		return false;
	}
}
