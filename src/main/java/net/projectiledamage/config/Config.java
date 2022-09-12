package net.projectiledamage.config;

import net.minecraft.util.math.MathHelper;

public class Config {
    public float status_effect_accuracy_multiplier_per_stack = 0.2F;
    public float default_bow_damage = 6;
    public float default_crowssbow_damage = 9;
    public boolean add_default_attributes_for_unspecified_bows = true;
    public boolean add_default_attributes_for_unspecified_crossbows = true;

    public float default_bow_damage() {
        return MathHelper.clamp(default_bow_damage, 0F, 10000F);
    }

    public float default_crowssbow_damage() {
        return MathHelper.clamp(default_crowssbow_damage, 0F, 10000F);
    }
}
