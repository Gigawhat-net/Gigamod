/*
 * Gigamod, A Minecraft mod by Gigawhat.
 * Copyright (C) 2021-2022 Gigawhat Programming Team.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * For further inquiries you can contact the Gigawhat Programming Team via e-mail:
 * contact.gpt@gigawhat.net
 */

package net.gigawhat.gigawhat_gigamod.core.itemgroup;

import net.gigawhat.gigawhat_gigamod.core.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GigamodGroup
{
    public static final ItemGroup GIGAMOD_GROUP = new ItemGroup("gigamodtab") 
    {
        @Override
        public ItemStack makeIcon() 
        {
            return new ItemStack(BlockInit.BLOCK_TEST.get());
        }
    };
}