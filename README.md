# Woolproofed

[![Fabric API](https://img.shields.io/badge/Fabric%20API-Required-blue?style=flat-square)](https://modrinth.com/mod/fabric-api)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-green?style=flat-square)](https://minecraft.net)
[![Fabric Loader](https://img.shields.io/badge/Fabric%20Loader-0.17.2+-blue?style=flat-square)](https://fabricmc.net)
[![Java](https://img.shields.io/badge/Java-17+-orange?style=flat-square)](https://adoptium.net)
[![License](https://img.shields.io/badge/License-CC0%201.0-lightgrey?style=flat-square)](LICENSE)

A Minecraft Fabric mod that blocks sounds when wool is placed between the sound source and the player. Perfect for creating soundproof rooms or reducing noise pollution in your builds!

## Features

- **Sound Blocking**: Automatically blocks sounds when wool blocks are in the line of sight between the sound source and player
- **All Wool Colors**: Works with all 16 wool colors (white, orange, magenta, light blue, yellow, lime, pink, gray, light gray, cyan, purple, blue, brown, green, red, black)
- **Configurable**: Toggle sound blocking on/off with a key binding
- **Smart Detection**: Only blocks sounds that are far enough from the player to prevent blocking nearby sounds
- **Performance Optimized**: Efficient raycasting algorithm with configurable check intervals

## Installation

### Prerequisites
- Minecraft 1.20.1
- Fabric Loader 0.17.2 or higher
- Fabric API
- Java 17 or higher

### Steps
1. Download the latest release from the [releases page](https://github.com/SSnowly/woolproofed/releases)
2. Place the JAR file in your `mods` folder
3. Make sure you have Fabric API installed
4. Launch Minecraft with Fabric Loader

## Usage

### Basic Sound Blocking
Simply place wool blocks between yourself and any sound source. The mod will automatically detect and block sounds that pass through the wool.

### Key Bindings
- **B Key** (default): Toggle sound blocking on/off
- You can change this key binding in the Controls menu under the "Woolproofed" category

### Configuration
The mod includes several configurable options:
- **Enabled**: Toggle the entire sound blocking system
- **Minimum Distance**: Sounds closer than this distance won't be blocked (default: 1.0 blocks)
- **Check Interval**: How frequently to check for wool blocks along the sound path (default: 0.5 blocks)
- **Block UI Sounds**: Whether to block interface sounds (default: false)

## How It Works

The mod uses a raycasting algorithm to check if there are any wool blocks in a straight line between the sound source and the player:

1. When a sound is about to play, the mod calculates the direction from the sound source to the player
2. It checks every block along this path at regular intervals
3. If any wool block is found, the sound is blocked
4. If no wool blocks are found, the sound plays normally

## Building from Source

### Prerequisites
- Java 17 or higher
- Gradle

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/SSnowly/woolproofed.git
   cd woolproofed
   ```

2. Build the mod:
   ```bash
   ./gradlew build
   ```

3. The built JAR will be in `build/libs/`

## Development

### Contributing
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

- **Issues**: Report bugs or request features on the [GitHub issues page](https://github.com/SSnowly/woolproofed/issues)
- **Discussions**: Join the conversation on [GitHub discussions](https://github.com/SSnowly/woolproofed/discussions)

## Credits

- **Author**: [SSnowly](https://github.com/SSnowly)
- **Fabric API**: [FabricMC](https://github.com/FabricMC/fabric)
- **Minecraft**: Mojang Studios

---

**Note**: This mod is client-side only and will not affect other players on multiplayer servers. Each player needs to have the mod installed to benefit from sound blocking.
