package com.mineinabyss.geary.ecs.conditions

import com.mineinabyss.geary.ecs.api.conditions.GearyCondition
import com.mineinabyss.geary.ecs.api.entities.GearyEntity
import com.mineinabyss.geary.ecs.serialization.Formats
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("entity")
public class ComponentConditions(
    @SerialName("has")
    public val components: Set<String> = emptySet(),
): GearyCondition() {
    //TODO this is getting boilerplatey, reused from ComponentAction
    private val componentClasses by lazy { components.map { Formats.getClassFor(it) } }

    override fun GearyEntity.check(): Boolean =
        hasAll(componentClasses)
}
