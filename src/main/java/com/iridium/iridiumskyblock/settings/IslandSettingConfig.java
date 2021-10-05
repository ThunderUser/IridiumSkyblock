package com.iridium.iridiumskyblock.settings;

import com.iridium.iridiumcore.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Represents a permission in the Island permissions system.
 * Serialized in the Configuration files.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class IslandSettingConfig {

    /**
     * The Item used to display the item
     */
    private Item item;
    /**
     * The default value of this Setting
     */
    private String defaultValue;

}