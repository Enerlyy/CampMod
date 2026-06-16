package net.mcreator.camp.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SleepingBagBlock extends BedBlock {


	public SleepingBagBlock() {
		this(DyeColor.RED);
	}


	public SleepingBagBlock(DyeColor color) {
		super(color, BlockBehaviour.Properties.of()
				.ignitedByLava()
				.sound(net.minecraft.world.level.block.SoundType.WOOL)
				.strength(1f, 10f)
				.noOcclusion()
				.pushReaction(PushReaction.DESTROY)
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction bedFacing = context.getHorizontalDirection();


		BlockPos headPos = context.getClickedPos().relative(bedFacing);
		Level world = context.getLevel();


		if (!world.getBlockState(headPos).is(BlockTags.create(new ResourceLocation("camp:freespace")))) {
			return null;
		}


		return this.defaultBlockState().setValue(FACING, bedFacing).setValue(PART, BedPart.FOOT);
	}


	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.box(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.MODEL;
	}
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
		if (level.isClientSide) {
			return InteractionResult.SUCCESS;
		} else {

			if (!level.isNight() && !level.isThundering()) {
				player.displayClientMessage(net.minecraft.network.chat.Component.translatable("block.minecraft.bed.no_sleep"), true);
				return InteractionResult.CONSUME;
			}


			return super.use(state, level, pos, player, hand, hitResult);
		}
	}

}