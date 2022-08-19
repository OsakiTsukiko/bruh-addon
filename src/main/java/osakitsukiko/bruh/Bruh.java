package osakitsukiko.bruh;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.slf4j.Logger;
import osakitsukiko.bruh.modules.misc.*;

public class Bruh extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY_MISC = new Category("BRUH Misc", new ItemStack(Items.MUSIC_DISC_5));

    @Override
    public void onInitialize() {
        LOG.info("Initializing BRUH");

        // Modules
        Modules modules = Modules.get();
        modules.add(new AutoEZ());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY_MISC);
    }

    @Override
    public String getPackage() {
        return "osakitsukiko.bruh";
    }
}
