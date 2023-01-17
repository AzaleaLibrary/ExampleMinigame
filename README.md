## Boilerplate Azalea Minigame Plugin

This is repo provides some template code for setting up an Azalea minigame plugin with **Maven**.

#### Default minecraft version: `1.19`
> ℹ️ The version can be change by updating the `mc.version` maven property.

#### Default output directory: `out/`
> ℹ️ To make your life easier, the output directory of the jar file when building an artifact can be specified directly to your spigot server *plugins* directory by updating the `plugins.dir` maven property.

Maven properties can be changed directly in **pom.xml** or, assuming you are using Intellij, via a **Run Configuration** (Run > Edit Configurations... > *maven run*, under *Java Options*/*Properties*).
This is useful when packaging your plugin for relatively newer minecraft versions (ei. 1.19, 1.18, 1.17) where the spigot API hasn't changed much.

### Setup

To fully set up the plugin, there are a few preliminary steps to take before fully customized.

#### In *pom.xml*, replace:

* `example` - the project's artifact id (name).
* `1.0.0` - the project's version (ei `1.0-SNAPSHOT`).
