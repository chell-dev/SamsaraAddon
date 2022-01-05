package me.chell.example

import me.chell.samsara.api.addon.Addon
import me.chell.samsara.api.util.Globals

class ExampleAddon: Addon("Example"), Globals {
    override fun load() {
        LOG.info("Example Addon loaded.")
    }

    override fun unload() {
    }
}