package superlord.prehistoricfauna.world;

import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.util.ResourceLocation;

public class PrehistoricLootTables {
	private static final Set<ResourceLocation> LOOT_TABLES = Sets.newHashSet();
	private static final Set<ResourceLocation> READ_ONLY_LOOT_TABLES = Collections.unmodifiableSet(LOOT_TABLES);

	public static final ResourceLocation HELL_CREEK_LOOT_TABLE = register("prehistoricfauna:chests/hell_creek_loot_table");

	
	private static ResourceLocation register(String id) {
		return register(new ResourceLocation(id));
	}
	
	private static ResourceLocation register(ResourceLocation id) {
		if (LOOT_TABLES.add(id)) {
			return id;
		} else {
			throw new IllegalArgumentException(id + " is already a registered built-in loot table");
		}
	}

	public static Set<ResourceLocation> func_215796_a() {
		return READ_ONLY_LOOT_TABLES;
	}
	
}
