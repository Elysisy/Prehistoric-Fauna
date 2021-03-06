package superlord.prehistoricfauna.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SoupItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import superlord.prehistoricfauna.PrehistoricFauna;
import superlord.prehistoricfauna.PrehistoricFauna.PFBook;
import superlord.prehistoricfauna.PrehistoricFauna.PFEggs;
import superlord.prehistoricfauna.PrehistoricFauna.PFEntities;
import superlord.prehistoricfauna.PrehistoricFauna.PFFossil;
import superlord.prehistoricfauna.PrehistoricFauna.PFPlants;
import superlord.prehistoricfauna.entity.PrehistoricBoatEntity;
import superlord.prehistoricfauna.item.CretaceousTimeTotemItem;
import superlord.prehistoricfauna.item.CustomArmorItem;
import superlord.prehistoricfauna.item.JurassicTimeTotemItem;
import superlord.prehistoricfauna.item.PaleopediaItem;
import superlord.prehistoricfauna.item.PrehistoricBoatItem;
import superlord.prehistoricfauna.item.SpawnSkeletonItem;
import superlord.prehistoricfauna.item.TriassicTimeTotemItem;
import superlord.prehistoricfauna.util.ArmorMaterialInit;

;

public class ItemInit {
	@SuppressWarnings("deprecation")
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PrehistoricFauna.MODID);

	//Spawn eggs
	public static final RegistryObject<SpawnEggItem> THESCELOSAURUS_SPAWN_EGG = ITEMS.register("thescelosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.THESCELOSAURUS_ENTITY, 0x582C20, 0x000000, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> TRICERATOPS_SPAWN_EGG = ITEMS.register("triceratops_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.TRICERATOPS_ENTITY, 0x494427, 0x000000, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> ANKYLOSAURUS_SPAWN_EGG = ITEMS.register("ankylosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.ANKYLOSAURUS_ENTITY, 0x696726, 0x1F1E13, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> TYRANNOSAURUS_SPAWN_EGG = ITEMS.register("tyrannosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.TYRANNOSAURUS_ENTITY, 0x56483E, 0x614C38, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> BASILEMYS_SPAWN_EGG = ITEMS.register("basilemys_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.BASILEMYS_ENTITY, 0x6B3727, 0x373519, new Item.Properties().group(PFEggs.instance))); 
	public static final RegistryObject<SpawnEggItem> DAKOTARAPTOR_SPAWN_EGG = ITEMS.register("dakotaraptor_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.DAKOTARAPTOR_ENTITY, 0x453018, 0x986529, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> DIDELPHODON_SPAWN_EGG = ITEMS.register("didelphodon_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.DIDELPHODON_ENTITY, 0x3E2419, 0xAF9663, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> ALLOSAURUS_SPAWN_EGG = ITEMS.register("allosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.ALLOSAURUS_ENTITY, 0x5E5D2D, 0x643F23, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> STEGOSAURUS_SPAWN_EGG = ITEMS.register("stegosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.STEGOSAURUS_ENTITY, 0xB0A047, 0x875D2A, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> CERATOSAURUS_SPAWN_EGG = ITEMS.register("ceratosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.CERATOSAURUS_ENTITY, 0x352217, 0x4056A0, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> DRYOSAURUS_SPAWN_EGG = ITEMS.register("dryosaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.DRYOSAURUS_ENTITY, 0x8E6746, 0x629698, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> HESPERORNITHOIDES_SPAWN_EGG = ITEMS.register("hesperornithoides_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.HESPERORNITHOIDES_ENTITY, 0x1F667D, 0x6F97A5, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> EILENODON_SPAWN_EGG = ITEMS.register("eilenodon_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.EILENODON_ENTITY, 0xA57B48, 0x84A36A, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> CAMARASAURUS_SPAWN_EGG = ITEMS.register("camarasaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.CAMARASAURUS_ENTITY, 0x7E5E2D, 0x7E311C, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> EXAERETODON_SPAWN_EGG = ITEMS.register("exaeretodon_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.EXAERETODON_ENTITY, 0x473023, 0xDBC7BA, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> CHROMOGISAURUS_SPAWN_EGG = ITEMS.register("chromogisaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.CHROMOGISAURUS_ENTITY, 0x513935, 0x4E594B, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> HERRERASAURUS_SPAWN_EGG = ITEMS.register("herrerasaurus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.HERRERASAURUS_ENTITY, 0x372721, 0xE7E0C9, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> HYPERODAPEDON_SPAWN_EGG = ITEMS.register("hyperodapedon_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.HYPERODAPEDON_ENTITY, 0x3A1F18, 0xAF9586, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> SILLOSUCHUS_SPAWN_EGG = ITEMS.register("sillosuchus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.SILLOSUCHUS_ENTITY, 0x2F2E27, 0x58301B, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> SAUROSUCHUS_SPAWN_EGG = ITEMS.register("saurosuchus_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.SAUROSUCHUS_ENTITY, 0x4F2622, 0x8E4F34, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> ISCHIGUALASTIA_SPAWN_EGG = ITEMS.register("ischigualastia_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.ISCHIGUALASTIA_ENTITY, 0x242820, 0x808776, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnEggItem> TIME_GUARDIAN_SPAWN_EGG = ITEMS.register("time_guardian_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.TIME_GUARDIAN_ENTITY, 0x2F2E27, 0x58301B, new Item.Properties().group(PFEggs.instance)));
	public static final RegistryObject<SpawnSkeletonItem> TYRANNOSAURUS_SKULL = ITEMS.register("tyrannosaurus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.TYRANNOSAURUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> TYRANNOSAURUS_SKELETON = ITEMS.register("tyrannosaurus_skeleton", () -> new SpawnSkeletonItem(ModEntityTypes.TYRANNOSAURUS_SKELETON, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> ANKYLOSAURUS_SKULL = ITEMS.register("ankylosaurus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.ANKYLOSAURUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> TRICERATOPS_SKULL = ITEMS.register("triceratops_skull", () -> new SpawnSkeletonItem(ModEntityTypes.TRICERATOPS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> HERRERASAURUS_SKULL = ITEMS.register("herrerasaurus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.HERRERASAURUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> SAUROSUCHUS_SKULL = ITEMS.register("saurosuchus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.SAUROSUCHUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> STEGOSAURUS_SKULL = ITEMS.register("stegosaurus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.STEGOSAURUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<SpawnSkeletonItem> CERATOSAURUS_SKULL = ITEMS.register("ceratosaurus_skull", () -> new SpawnSkeletonItem(ModEntityTypes.CERATOSAURUS_SKULL, new Item.Properties().group(PFFossil.instance)));
	//Drops
	public static final RegistryObject<Item> TYRANNOSAURUS_TOOTH = ITEMS.register("tyrannosaurus_tooth", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> TAIL_CLUB = ITEMS.register("tail_club", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> TRICERATOPS_HORN = ITEMS.register("triceratops_horn", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> ANKYLOSAURUS_SCUTE = ITEMS.register("ankylosaurus_scute", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> DAKOTARAPTOR_CLAW = ITEMS.register("dakotaraptor_claw", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> MOSS_BALL = ITEMS.register("moss_ball", () -> new Item(new Item.Properties().group(PFPlants.instance)));
	public static final RegistryObject<Item> PTILOPHYLLUM_FRONDS = ITEMS.register("ptilophyllum_fronds", () -> new Item(new Item.Properties().group(PFPlants.instance)));
	public static final RegistryObject<Item> DIDELPHODON_HIDE = ITEMS.register("didelphodon_hide", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> EXAERETODON_HIDE = ITEMS.register("exaeretodon_hide", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> STEGOSAURUS_THAGOMIZERS = ITEMS.register("stegosaurus_thagomizer", () -> new Item(new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL = ITEMS.register("tyrannosaurus_fossil", () -> new Item(new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<Item> TRICERATOPS_FOSSIL = ITEMS.register("triceratops_fossil", () -> new Item(new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL = ITEMS.register("ankylosaurus_fossil", () -> new Item(new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<Item> STEGOSAURUS_FOSSIL = ITEMS.register("stegosaurus_fossil", () -> new Item(new Item.Properties().group(PFFossil.instance)));
	public static final RegistryObject<Item> HERRERASAURUS_FOSSIL = ITEMS.register("herrerasaurus_fossil", () -> new Item(new Item.Properties().group(PFFossil.instance)));
	//Meat
	public static final RegistryObject<Item> RAW_ANKYLOSAURUS_MEAT = ITEMS.register("raw_ankylosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_ANKYLOSAURUS_MEAT = ITEMS.register("cooked_ankylosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(9).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_TYRANNOSAURUS_MEAT = ITEMS.register("raw_tyrannosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(5).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_TYRANNOSAURUS_MEAT = ITEMS.register("cooked_tyrannosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(10).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_TRICERATOPS_MEAT = ITEMS.register("raw_triceratops_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(5).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_TRICERATOPS_MEAT = ITEMS.register("cooked_triceratops_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(10).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_THESCELOSAURUS_MEAT = ITEMS.register("raw_thescelosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_THESCELOSAURUS_MEAT = ITEMS.register("cooked_thescelosaurus_meat",() -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_DAKOTARAPTOR_MEAT = ITEMS.register("raw_dakotaraptor_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_DAKOTARAPTOR_MEAT = ITEMS.register("cooked_dakotaraptor_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(7).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_ALLOSAURUS_MEAT = ITEMS.register("raw_allosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_ALLOSAURUS_MEAT = ITEMS.register("cooked_allosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_STEGOSAURUS_MEAT = ITEMS.register("raw_stegosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_STEGOSAURUS_MEAT = ITEMS.register("cooked_stegosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(8).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_CERATOSAURUS_MEAT = ITEMS.register("raw_ceratosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_CERATOSAURUS_MEAT = ITEMS.register("cooked_ceratosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(7).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_DRYOSAURUS_MEAT = ITEMS.register("raw_dryosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_DRYOSAURUS_MEAT = ITEMS.register("cooked_dryosaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_HESPERORNITHOIDES_MEAT = ITEMS.register("raw_hesperornithoides_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_HESPERORNITHOIDES_MEAT = ITEMS.register("cooked_hesperornithoides_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_CAMARASAURUS_MEAT = ITEMS.register("raw_camarasaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_CAMARASAURUS_MEAT = ITEMS.register("cooked_camarasaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(12).saturation(0.8F).meat().build())));
	public static final RegistryObject<Item> RAW_EILENODON_MEAT = ITEMS.register("raw_eilenodon_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_EILENODON_MEAT = ITEMS.register("cooked_eilenodon_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_HERRERASAURUS_MEAT = ITEMS.register("raw_herrerasaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_HERRERASAURUS_MEAT = ITEMS.register("cooked_herrerasaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(6).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_CHROMOGISAURUS_MEAT = ITEMS.register("raw_chromogisaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_CHROMOGISAURUS_MEAT = ITEMS.register("cooked_chromogisaurus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_HYPERODAPEDON_MEAT = ITEMS.register("raw_hyperodapedon_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(2).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_HYPERODAPEDON_MEAT = ITEMS.register("cooked_hyperodapedon_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_SILLOSUCHUS_MEAT = ITEMS.register("raw_sillosuchus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(4).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_SILLOSUCHUS_MEAT = ITEMS.register("cooked_sillosuchus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(8).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_SAUROSUCHUS_MEAT = ITEMS.register("raw_saurosuchus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(3).saturation(0.3F).meat().build())));
	public static final RegistryObject<Item> COOKED_SAUROSUCHUS_MEAT = ITEMS.register("cooked_saurosuchus_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(5).saturation(0.6F).meat().build())));
	public static final RegistryObject<Item> RAW_ISCHIGUALASTIA_MEAT = ITEMS.register("raw_ischigualastia_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(5).saturation(0.4F).meat().build())));
	public static final RegistryObject<Item> COOKED_ISCHIGUALASTIA_MEAT = ITEMS.register("cooked_ischigualastia_meat", () -> new Item(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(7).saturation(0.6F).meat().build())));
	public static final RegistryObject<SoupItem> CRASSOSTREA_OYSTER_SOUP = ITEMS.register("crassostrea_oyster_soup", () -> new SoupItem(new Item.Properties().group(PFEntities.instance).food(new Food.Builder().hunger(8).saturation(0.6F).build())));
	//Armor
	public static final RegistryObject<CustomArmorItem> ANKYLOSAURUS_HELMET = ITEMS.register("ankylosaurus_helmet", () -> new CustomArmorItem(ArmorMaterialInit.ANKYLOSAURUS, EquipmentSlotType.HEAD, new Item.Properties().group(PFEntities.instance)));
	public static final RegistryObject<ArmorItem> ANKYLOSAURUS_CHESTPLATE = ITEMS.register("ankylosaurus_chestplate", () -> new ArmorItem(ArmorMaterialInit.ANKYLOSAURUS, EquipmentSlotType.CHEST, new Item.Properties().group(PFEntities.instance)));
	//Paleopedia
	public static final RegistryObject<PaleopediaItem> PALEOPEDIA = ITEMS.register("paleopedia", () -> new PaleopediaItem());
	public static final RegistryObject<Item> PALEOPAGE = ITEMS.register("paleopage", () -> new Item(new Item.Properties().group(PFBook.instance)));
	//Boats
	public static final RegistryObject<PrehistoricBoatItem> ARAUCARIA_BOAT = ITEMS.register("araucaria_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.ARAUCARIA, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> METASEQUOIA_BOAT = ITEMS.register("metasequoia_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.METASEQUOIA, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> PROTOPICEOXYLON_BOAT = ITEMS.register("protopiceoxylon_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.PROTOPICEOXYLON, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> ZAMITES_BOAT = ITEMS.register("zamites_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.ZAMITES, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> PROTOJUNIPER_BOAT = ITEMS.register("protojuniper_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.PROTOJUNIPER, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> HEIDIPHYLLUM_BOAT = ITEMS.register("heidiphyllum_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.HEIDIPHYLLUM, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	public static final RegistryObject<PrehistoricBoatItem> LIRIODENDRITES_BOAT = ITEMS.register("liriodendrites_boat", () -> new PrehistoricBoatItem(PrehistoricBoatEntity.PFType.LIRIODENDRITES, (new Item.Properties().maxStackSize(1).group(PFBook.instance))));
	//Misc
	public static final RegistryObject<Item> TIME_TOTEM = ITEMS.register("time_totem", () -> new Item(new Item.Properties().group(PFBook.instance)));
	public static final RegistryObject<CretaceousTimeTotemItem> CRETACEOUS_TIME_TOTEM = ITEMS.register("cretaceous_time_totem", () -> new CretaceousTimeTotemItem(new Item.Properties().group(PFBook.instance).maxDamage(8)));
	public static final RegistryObject<JurassicTimeTotemItem> JURASIC_TIME_TOTEM = ITEMS.register("jurassic_time_totem", () -> new JurassicTimeTotemItem(new Item.Properties().group(PFBook.instance).maxDamage(8)));
	public static final RegistryObject<TriassicTimeTotemItem> TRIASSIC_TIME_TOTEM = ITEMS.register("triassic_time_totem", () -> new TriassicTimeTotemItem(new Item.Properties().group(PFBook.instance).maxDamage(8)));
	public static final RegistryObject<Item> TRIASSIC_FOSSIL = ITEMS.register("triassic_fossil", () -> new Item(new Item.Properties().group(PFBook.instance)));
	public static final RegistryObject<Item> JURASSIC_FOSSIL = ITEMS.register("jurassic_fossil", () -> new Item(new Item.Properties().group(PFBook.instance)));
	public static final RegistryObject<Item> CRETACEOUS_FOSSIL = ITEMS.register("cretaceous_fossil", () -> new Item(new Item.Properties().group(PFBook.instance)));
	public static final RegistryObject<Item> CLADOPHEBLIS_STICK = ITEMS.register("cladophlebis_stick", () -> new Item(new Item.Properties().group(PFBook.instance).maxStackSize(1)));
	//Opublic static final RegistryObject<HangingEntityItem> PALEOPAINTING = ITEMS.register("paleopainting", () -> new HangingEntityItem(ModEntityTypes.PALEOPAINTING, (new Item.Properties()).group(PFBook.instance)));

}