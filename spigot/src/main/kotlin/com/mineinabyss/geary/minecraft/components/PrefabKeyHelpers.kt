package com.mineinabyss.geary.minecraft.components

import com.mineinabyss.geary.ecs.prefab.PrefabKey
import com.mineinabyss.geary.ecs.prefab.PrefabManager
import org.bukkit.plugin.Plugin

public fun PrefabKey.Companion.of(plugin: Plugin, name: String): PrefabKey =
    PrefabKey(plugin.name.toLowerCase(), name)

public fun PrefabManager.getPrefabsFor(plugin: Plugin): List<PrefabKey> =
    getPrefabsFor(plugin.name.toLowerCase())
