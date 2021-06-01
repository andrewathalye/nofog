package tk.zenithseeker.nofog.mixin;

import net.minecraft.client.Camera;
import net.minecraft.world.level.material.FogType;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Camera.class)
public class CameraMixin {
	@Overwrite
	public FogType getFluidInCamera() {
		return FogType.NONE;
	}
}
