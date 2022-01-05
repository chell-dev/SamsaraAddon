# Usage
1. Clone this repository or download zip
2. Download the latest Samsara release
3. Rename it to samsara.jar
4. Put the file in your project folder
5. You need a class that extends Addon
6. The load() and unload() methods are called when the client is loaded and unloaded
7. Now you can do anything you want except add mixins and resources

## Modules
1. Create a class that extends Module
2. Make sure you don't use the empty constructor
3. Use ModuleManager.modules.add(ModuleClass()) to register it

### Values
```
@Register(0) val aValue = Value("Name", true)
@Register(1) val anotherValue = ValueBuilder("DifferentName", 1.0).bounds(0.0, 2.0).build()
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