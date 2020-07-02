package superlord.prehistoricfauna.entity;

import java.util.Random;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowParentGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.stats.Stats;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import superlord.prehistoricfauna.block.ThescelosaurusEggBlock;
import superlord.prehistoricfauna.init.BlockInit;
import superlord.prehistoricfauna.init.ModEntityTypes;

public class EntityThescelosaurus extends EntityPrehistoric {
	
   private static final DataParameter<BlockPos> HOME_POS = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BLOCK_POS);
   private static final DataParameter<Boolean> HAS_EGG = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> IS_DIGGING = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BOOLEAN);
   private static final DataParameter<BlockPos> TRAVEL_POS = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BLOCK_POS);
   private static final DataParameter<Boolean> GOING_HOME = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BOOLEAN);
   private static final DataParameter<Boolean> TRAVELLING = EntityDataManager.createKey(EntityThescelosaurus.class, DataSerializers.BOOLEAN);
   private int isDigging;

	public EntityThescelosaurus(EntityType<? extends EntityThescelosaurus> type, World worldIn) {
		super(type, worldIn);
	}
	
	public void setHome(BlockPos position) {
		this.dataManager.set(HOME_POS, position);
	}

	private BlockPos getHome() {
		return this.dataManager.get(HOME_POS);
	}
		   
	public boolean hasEgg() {
		return this.dataManager.get(HAS_EGG);
	}

	private void setHasEgg(boolean hasEgg) {
		this.dataManager.set(HAS_EGG, hasEgg);
	}

	public boolean isDigging() {
		return this.dataManager.get(IS_DIGGING);
	}
	
	private void setDigging(boolean isDigging) {
		this.isDigging = isDigging ? 1 : 0;
		this.dataManager.set(IS_DIGGING, isDigging);
	}
	
	private void setTravelPos(BlockPos position) {
	      this.dataManager.set(TRAVEL_POS, position);
	   }

	private BlockPos getTravelPos() {
		return this.dataManager.get(TRAVEL_POS);
	}
	   
	public boolean isBreedingItem(ItemStack stack) {
		return stack.getItem() == BlockInit.HORSETAIL.asItem();
	}
	   
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		EntityThescelosaurus entity = new EntityThescelosaurus(ModEntityTypes.ENTITY_THESCELOSAURUS, this.world);
		entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)), SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT)null);
		return entity;
	}
	
	protected void registerData() {
	      super.registerData();
	      this.dataManager.register(HOME_POS, BlockPos.ZERO);
	      this.dataManager.register(HAS_EGG, false);
	      this.dataManager.register(TRAVEL_POS, BlockPos.ZERO);
	      this.dataManager.register(GOING_HOME, false);
	      this.dataManager.register(TRAVELLING, false);
	      this.dataManager.register(IS_DIGGING, false);
	   }

	   public void writeAdditional(CompoundNBT compound) {
	      super.writeAdditional(compound);
	      compound.putInt("HomePosX", this.getHome().getX());
	      compound.putInt("HomePosY", this.getHome().getY());
	      compound.putInt("HomePosZ", this.getHome().getZ());
	      compound.putBoolean("HasEgg", this.hasEgg());
	      compound.putInt("TravelPosX", this.getTravelPos().getX());
	      compound.putInt("TravelPosY", this.getTravelPos().getY());
	      compound.putInt("TravelPosZ", this.getTravelPos().getZ());
	   }

	   public void readAdditional(CompoundNBT compound) {
	      int i = compound.getInt("HomePosX");
	      int j = compound.getInt("HomePosY");
	      int k = compound.getInt("HomePosZ");
	      this.setHome(new BlockPos(i, j, k));
	      super.readAdditional(compound);
	      this.setHasEgg(compound.getBoolean("HasEgg"));
	      int l = compound.getInt("TravelPosX");
	      int i1 = compound.getInt("TravelPosY");
	      int j1 = compound.getInt("TravelPosZ");
	      this.setTravelPos(new BlockPos(l, i1, j1));
	   }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.25F));
		this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.1D));
		this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
		this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(7, new AvoidEntityGoal(this, PlayerEntity.class, 10F, 2D, 2D));
		this.goalSelector.addGoal(8, new EntityThescelosaurus.LayEggGoal(this, 1.0D));
		this.goalSelector.addGoal(2, new EntityThescelosaurus.MateGoal(this, 1.0D));
		this.goalSelector.addGoal(7, new AvoidEntityGoal(this, EntityTyrannosaurus.class, 10F, 2D, 2D));
	}
	
	@Override
	protected void updateAITasks() {
		super.updateAITasks();
	}
	
	@Override
	public void livingTick() {
		super.livingTick();
	}
	
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void handleStatusUpdate(byte id) {
		super.handleStatusUpdate(id);
	}
	
	@Override
	public void onStruckByLightning(LightningBoltEntity lightningBolt) {
		this.setGlowing(true);
	}
	
	static class LayEggGoal extends MoveToBlockGoal {
	      private final EntityThescelosaurus thescelosaurus;

	      LayEggGoal(EntityThescelosaurus thescelosaurus, double speedIn) {
	         super(thescelosaurus, speedIn, 16);
	         this.thescelosaurus = thescelosaurus;
	      }

	      /**
	       * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
	       * method as well.
	       */
	      public boolean shouldExecute() {
	         return this.thescelosaurus.hasEgg() ? super.shouldExecute() : false;
	      }

	      /**
	       * Returns whether an in-progress EntityAIBase should continue executing
	       */
	      public boolean shouldContinueExecuting() {
	         return super.shouldContinueExecuting() && this.thescelosaurus.hasEgg();
	      }

	      /**
	       * Keep ticking a continuous task that has already been started
	       */
	      public void tick() {
	         super.tick();
	         BlockPos blockpos = new BlockPos(this.thescelosaurus);
	         if (!this.thescelosaurus.isInWater() && this.getIsAboveDestination()) {
	            if (this.thescelosaurus.isDigging < 1) {
	               this.thescelosaurus.setDigging(true);
	            } else if (this.thescelosaurus.isDigging > 200) {
	               World world = this.thescelosaurus.world;
	               world.playSound((PlayerEntity)null, blockpos, SoundEvents.ENTITY_TURTLE_LAY_EGG, SoundCategory.BLOCKS, 0.3F, 0.9F + world.rand.nextFloat() * 0.2F);
	               world.setBlockState(this.destinationBlock.up(), BlockInit.THESCELOSAURUS_EGG.getDefaultState().with(ThescelosaurusEggBlock.EGGS, Integer.valueOf(this.thescelosaurus.rand.nextInt(4) + 1)), 3);
	               this.thescelosaurus.setHasEgg(false);
	               this.thescelosaurus.setDigging(false);
	               this.thescelosaurus.setInLove(600);
	            }

	            if (this.thescelosaurus.isDigging()) {
	               this.thescelosaurus.isDigging++;
	            }
	         }

	      }

	      /**
	       * Return true to set given position as destination
	       */
	      protected boolean shouldMoveTo(IWorldReader worldIn, BlockPos pos) {
	         if (!worldIn.isAirBlock(pos.up())) {
	            return false;
	         } else {
	            Block block = worldIn.getBlockState(pos).getBlock();
	            return block == Blocks.COARSE_DIRT;
	         }
	      }
	   }

	static class MateGoal extends BreedGoal {
	      private final EntityThescelosaurus thescelosaurus;

	      MateGoal(EntityThescelosaurus thescelosaurus, double speedIn) {
	         super(thescelosaurus, speedIn);
	         this.thescelosaurus = thescelosaurus;
	      }

	      /**
	       * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
	       * method as well.
	       */
	      public boolean shouldExecute() {
	         return super.shouldExecute() && !this.thescelosaurus.hasEgg();
	      }

	      /**
	       * Spawns a baby animal of the same type.
	       */
	      protected void spawnBaby() {
	         ServerPlayerEntity serverplayerentity = this.animal.getLoveCause();
	         if (serverplayerentity == null && this.targetMate.getLoveCause() != null) {
	            serverplayerentity = this.targetMate.getLoveCause();
	         }

	         if (serverplayerentity != null) {
	            serverplayerentity.addStat(Stats.ANIMALS_BRED);
	            CriteriaTriggers.BRED_ANIMALS.trigger(serverplayerentity, this.animal, this.targetMate, (AgeableEntity)null);
	         }

	         this.thescelosaurus.setHasEgg(true);
	         this.animal.resetInLove();
	         this.targetMate.resetInLove();
	         Random random = this.animal.getRNG();
	         if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT)) {
	            this.world.addEntity(new ExperienceOrbEntity(this.world, this.animal.getPosX(), this.animal.getPosY(), this.animal.getPosZ(), random.nextInt(7) + 1));
	         }

	      }
	   }
	
}