package me.chell.example

import me.chell.samsara.api.addon.Addon
import me.chell.samsara.api.feature.FeatureManager
import me.chell.samsara.api.util.Globals

class ExampleAddon: Addon(), Globals {

    private val module: ExampleModule = ExampleModule()

    override fun load() {
        LOG.info("Example Addon loaded.")

        FeatureManager.modules.add(module)
        module.load()
    }

    override fun unload() {
        module.unload()
    }
}