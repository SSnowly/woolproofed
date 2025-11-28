# Woolproofed

[![Fabric API](https://img.shields.io/badge/Fabric%20API-0.102.1%2B1.21.1-blue?style=flat-square)](https://modrinth.com/mod/fabric-api)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.1-green?style=flat-square)](https://minecraft.net)
[![Fabric Loader](https://img.shields.io/badge/Fabric%20Loader-0.16.14%2B-blue?style=flat-square)](https://fabricmc.net)
[![Java](https://img.shields.io/badge/Java-17%2B%20(runtime)%20%7C%2021%2B%20(build)-orange?style=flat-square)](https://adoptium.net)
[![License](https://img.shields.io/badge/License-MIT-lightgrey?style=flat-square)](LICENSE)

A Minecraft Fabric mod that blocks sounds when wool is placed between the sound source and the player. Perfect for creating soundproof rooms or reducing noise pollution in your builds!

<details>
  <summary>Video Preview</summary>

  [![Watch the video](https://img.youtube.com/vi/VL3ZaNkZjbY/0.jpg)](https://youtu.be/VL3ZaNkZjbY)
</details>

## Features

- **Sound Blocking:** Automatically blocks sounds when wool blocks are in the line of sight between the sound source and player
- **All Wool Colors:** Works with all 16 wool colors
- **Configurable:** Toggle sound blocking on/off with a key binding
- **Smart Detection:** Only blocks sounds far enough from the player to prevent cutting nearby sounds
- **Performance Optimized:** Efficient raycasting algorithm with configurable check intervals

## Compatibility

- **Minecraft:** 1.21.1
- **Fabric Loader:** 0.16.14+
- **Fabric API:** 0.102.1+1.21.1
- **Java:** 17+ runtime (Minecraft), 21+ build (Fabric Loom)

## Installation

1. Download the latest release from the [Releases](https://github.com/clamytoe/woolproofed/releases).
2. Place the JAR file in your `mods/` folder.
3. Install Fabric Loader and Fabric API for 1.21.1.
4. Launch Minecraft.

## Usage

- **Basic Sound Blocking:** Place wool between you and a sound source; sounds passing through wool are blocked.
- **Key Bindings:** Default **B** to toggle. Find under Controls → “Woolproofed”.
- **Configuration:**
  - **Enabled:** Toggle system on/off
  - **Minimum Distance:** Nearby sounds won’t be blocked (default: 1.0 blocks)
  - **Check Interval:** How often to check along the sound path (default: 0.5 blocks)
  - **Block UI Sounds:** Whether to block interface sounds (default: false)

## How It Works

1. When a sound is about to play, the mod computes the path to the player.
2. It raycasts along that path.
3. If any wool block is found, the sound is blocked; otherwise it plays.

## Building from source

- **Prerequisites:** Java 21 (build), Gradle wrapper included.

### Steps

1. Build the mod:

   ```bash
   ./gradlew build
   ```

2. The built JAR will be in `build/libs/`

## Authors

- **[SSnowly](https://github.com/SSnowly)** - Original creator
- **[clamytoe](https://github.com/clamytoe)** - Maintainer for 1.21.1 compatibility

## Changelog

### [1.0.1+mc1.21.1] - 2025-11-11

- Updated compatibility to **Minecraft 1.21.1**
- Downgraded **Fabric Loader** to `0.16.14` to make it compatible with certain modpacks
- Updated **Fabric API** to `0.102.1+1.21.1`
- Updated **Yarn mappings** to `1.21.1+build.2`
- Switched build environment to **Java 21** (required by Fabric Loom)
- Synced `fabric.mod.json` metadata with new versions
- Added **clamytoe** to authors list for 1.21.1 maintenance
- License clarified as **MIT** to match repo LICENSE file

### [1.0.0] - Original Release

- Initial release by **SSnowly**
- Added sound blocking when wool is placed between player and sound source
- Support for all 16 wool colors
- Configurable keybinding (default **B**) and detection options

## License

MIT - see [LICENSE](LICENSE).

## Support

- **Issues**: [https://github.com/SSnowly/woolproofed/issues](https://github.com/SSnowly/woolproofed/issues)
- **Discussions**: [https://github.com/SSnowly/woolproofed/discussions](https://github.com/SSnowly/woolproofed/discussions)

## Credits

- **Fabric API**: [https://github.com/FabricMC/fabric](https://github.com/FabricMC/fabric)
- **Minecraft**: Mojang Studios

---

**Note**: Client-side only. Each player needs the mod installed to benefit from sound blocking.
