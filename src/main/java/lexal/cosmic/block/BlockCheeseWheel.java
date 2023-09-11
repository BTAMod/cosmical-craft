package lexal.cosmic.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockCake;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import lexal.cosmic.CosmicCraft;
import turniplabs.halplibe.helper.TextureHelper;

public class BlockCheeseWheel extends BlockCake {
    public BlockCheeseWheel(String key, int id) {
        super(key, id);
    }
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause != EnumDropCause.PICK_BLOCK && meta != 0 ? null : new ItemStack[]{new ItemStack(ModBlocks.cheeseore)};
    }
    public int getBlockTextureFromSideAndMetadata(Side side, int j) {
        if (j > 0 && side == Side.WEST) {
            int[] texture = TextureHelper.getOrCreateBlockTexture(CosmicCraft.MOD_ID, "cheese_block.png");
            return Block.texCoordToIndex(texture[0], texture[1]);
        }
        return this.atlasIndices[side.getId()];
    }
}