package me.chell.example

import me.chell.samsara.api.event.EventHandler
import me.chell.samsara.api.feature.Module
import me.chell.samsara.api.value.Register
import me.chell.samsara.api.value.Value
import me.chell.samsara.impl.event.PlayerTickEvent
import me.chell.samsara.impl.event.RenderHudEvent

class ExampleModule: Module("Example", Category.MISC, "This is an example module.") {

    @Register val setting = Value("A Value", 2.0, min = 0.0, max = 5.0)

    @EventHandler
    fun onTick(event: PlayerTickEvent) {
        if(setting.value > 1.0)
            player.isSprinting = true
    }

    @EventHandler
    fun onRender2D(event: RenderHudEvent.Post) {
        fontRenderer.draw(event.matrices, "Hi", 2f, 2f, -1)
    }
}