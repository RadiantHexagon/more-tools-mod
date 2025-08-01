package net.expiredsprite.moretools.util;

import net.expiredsprite.moretools.MoreTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

        public static class Blocks {


            public static final TagKey<Block> NEEDS_REINFORCED_GOLD_TOOL = createTag("needs_reinforced_gold_tool");
            public static final TagKey<Block> INCORRECT_FOR_REINFORCED_GOLD_TOOL = createTag("incorrect_for_reinforced_gold_tool");

            private static TagKey<Block> createTag(String name) {
                return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreTools.MOD_ID, name));
            }
        }

        public static class Items {

            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreTools.MOD_ID, name));
            }
        }

    }

