package trittimo.essenceoflife.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import trittimo.essenceoflife.common.util.Constants;

public class ModItem extends Item {
	private String itemName;
	private String textureName;
	private CreativeTabs creativeTab;
	
	public ModItem(String itemName, String textureName, CreativeTabs creativeTab) {
		this.itemName = itemName;
		this.textureName = textureName;
		this.creativeTab = creativeTab;
	}
	
	public ModItem init() {
		this.setTextureName(Constants.MOD_ID + ":" + this.textureName);
		this.setUnlocalizedName(this.itemName);
		this.setCreativeTab(this.creativeTab);
		
		GameRegistry.registerItem(this, this.itemName);
		return this;
	}
}
