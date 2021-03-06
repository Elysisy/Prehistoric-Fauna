package superlord.prehistoricfauna.world.dimension.jurassic;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import superlord.prehistoricfauna.core.world.PHFBiomes;

import java.util.Set;

public class JurassicBiomeProvider extends BiomeProvider {

	protected JurassicBiomeProvider() {
		super(biomeList);
	}
	
	private static final Set<Biome> biomeList = ImmutableSet.of(PHFBiomes.MORRISON_SAVANNAH);

	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
		return PHFBiomes.MORRISON_SAVANNAH;
	}

}
