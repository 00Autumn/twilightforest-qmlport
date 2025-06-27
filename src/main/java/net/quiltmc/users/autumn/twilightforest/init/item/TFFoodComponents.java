package net.quiltmc.users.autumn.twilightforest.init.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Items;

public class TFFoodComponents {
	public static final FoodComponent RAW_VENISON = new FoodComponent.Builder().hunger(3).saturation(0.3F)
		.build();

	public static final FoodComponent COOKED_VENISON = new FoodComponent.Builder().hunger(8).saturation(0.8F)
		.build();

	public static final FoodComponent RAW_MEEF = new FoodComponent.Builder().hunger(2).saturation(0.3F)
		.build();

	public static final FoodComponent COOKED_MEEF = new FoodComponent.Builder().hunger(6).saturation(0.6F)
		.build();

	public static final FoodComponent MEEF_STROGANOFF = createStew(8)
		.build();

	public static final FoodComponent HYDRA_CHOP = new FoodComponent.Builder().hunger(18).saturation(2.0F)
		.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100),1.0F).build();

	public static final FoodComponent TORCHBERRIES = new FoodComponent.Builder().alwaysEdible()
		.statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100), 0.75F).build();

	public static final FoodComponent EXPERIMENT_115 = new FoodComponent.Builder().hunger(4).saturation(0.3F)
		.build();

	public static final FoodComponent MAZE_WAFER = new FoodComponent.Builder().hunger(4)
		.build();

	private static FoodComponent.Builder createStew(int hunger) {
		return new FoodComponent.Builder().hunger(hunger).saturation(0.6F).usingConvertsTo(Items.BOWL);
	}

	public static void registerFoodComponents(){
		//ENSURES LOADING
	}
}
