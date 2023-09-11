package lexal.cosmic.entity;

import lexal.cosmic.entity.renderer.SpaceZombieRenderer;
import net.minecraft.client.render.entity.MobRenderer;
import net.minecraft.client.render.model.ModelSkeleton;
import net.minecraft.client.render.model.ModelZombie;
import net.minecraft.core.entity.monster.EntitySkeleton;
import turniplabs.halplibe.helper.EntityHelper;

public class ModEntities {

    public static void register() {
        EntityHelper.createEntity(EntitySpaceZombie.class, new SpaceZombieRenderer(new ModelZombie(), 1), 900, "spaceZombie");
        EntityHelper.createEntity(EntitySpaceSkeleton.class, new MobRenderer<EntitySkeleton>(new ModelSkeleton(), 1), 901, "spaceSkeleton");
    }
}
