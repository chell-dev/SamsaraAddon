package me.chell.example

import me.chell.samsara.api.event.EventHandler
import me.chell.samsara.api.feature.Widget
import me.chell.samsara.impl.event.PlayerTickEvent
import me.chell.samsara.impl.gui.click.Button
import net.minecraft.client.util.math.MatrixStack

class ExampleWidget: Widget("Example") {
    init {
        width = fontRenderer.getWidth("Sample Text").toDouble()
        height = fontRenderer.fontHeight.toDouble()
    }
    override fun render(matrices: MatrixStack, mouseX: Double, mouseY: Double, tickDelta: Float) {
        super.render(matrices, mouseX, mouseY, tickDelta)
        if(mouseX < 0 && !pinned.value) return

        fontRenderer.drawWithShadow(matrices, "Sample Text", x.value.toFloat(), y.value.toFloat(), Button.primaryText.color.argb)
    }

    @EventHandler
    fun onTick(event: PlayerTickEvent) {
        // do stuff
    }
}