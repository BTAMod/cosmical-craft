package lexal.cosmic.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;

import java.lang.reflect.Field;

public class ModBlockTags {
    public static Tag<Block> GAS_DESTROYS = Tag.of("gas_destroys");
    public static Tag<Block> IS_GAS = Tag.of("is_gas");

    static {
        for (Field field : ModBlockTags.class.getDeclaredFields()) {
            if (!field.getType().equals(Tag.class)) continue;
            try {
                BlockTags.TAG_LIST.add((Tag)field.get(null));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void register(){}
}
