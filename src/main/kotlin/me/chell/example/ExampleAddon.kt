package me.chell.example

import me.chell.samsara.api.Loadable
import me.chell.samsara.api.addon.Addon
import me.chell.samsara.api.feature.FeatureManager
import me.chell.samsara.api.util.Globals

class ExampleAddon: Addon(), Globals {

    private val features = mutableListOf<Loadable>()

    override fun load() {
        FeatureManager.modules.add(ExampleModule().also { features.add(it) })
        FeatureManager.widgets.add(ExampleWidget().also { features.add(it) })

        for(f in features) f.load()

        LOG.info("Example Addon loaded.")
    }

    override fun unload() {
        for(f in features) f.load()
        features.clear()
    }
}