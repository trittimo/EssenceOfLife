package trittimo.essenceoflife.common.util.startup;

import net.minecraft.creativetab.CreativeTabs;
import trittimo.essenceoflife.common.items.ItemSoulTablet;
import trittimo.essenceoflife.common.items.ModItem;

public class ItemHandler {
    public static ModItem essenceExtractor;

    public static void init() {
        essenceExtractor = new ItemSoulTablet(CreativeTabs.tabTools).init();
    }
}
