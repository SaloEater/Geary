package com.mineinabyss.geary.minecraft

import com.mineinabyss.geary.ecs.actions.*
import com.mineinabyss.geary.ecs.actions.components.*
import com.mineinabyss.geary.ecs.types.GearyEntityType
import com.mineinabyss.geary.minecraft.dsl.attachToGeary

internal fun GearyPlugin.registerSerializers() {
    // This will also register a serializer for GearyEntityType
    attachToGeary<GearyEntityType> {
        components {
            component(Conditions.serializer())
        }

        actions {
            action(DebugAction.serializer())
            action(EntityAction.serializer())
            action(CooldownAction.serializer())
            action(ConditionalAction.serializer())
            action(CancelEventAction.serializer())

            action(AddComponentAction.serializer())
            action(RemoveComponentAction.serializer())
            action(DisableComponentAction.serializer())
            action(EnableComponentAction.serializer())
        }
    }
}