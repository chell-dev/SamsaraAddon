# Usage
1. Clone this repository or download zip
2. Change samsara_version in gradle.properties to the version or commit you want (see [jitpack](https://jitpack.io/#chell-dev/Samsara))
3. Create a class that extends Addon
4. The load() and unload() methods are called when the client is loaded and unloaded

## Modules
1. Create a class that extends Module
2. Make sure you don't use the empty constructor
3. Use ModuleManager.modules.add(ModuleClass()) to register it

### Values
```
@Register(0) val aValue = Value("Name", true)
@Register(1) val anotherValue = Value("DifferentName", 1.0, min = 0.0, max = 5.0)
```

## Events
```
@EventHandler
fun onEvent(event: ExampleEvent) {
    // do stuff
}
```
Make sure to call EventHandler.register(ClassWithEventHandler())

Modules are automatically registered and unregistered in onEnable() and onDisable()