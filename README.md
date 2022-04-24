# Minecraft Alpha Title Screen
![Forge Version](https://img.shields.io/badge/Forge-Mod-blue)
![Gradle Version](https://img.shields.io/badge/Gradle-7.4.2-yellow)


### About

```
 Includes the Animation
```




![Image](https://raw.githubusercontent.com/WalkingLibrary/OG-Title-Screen/master/src/main/resources/assets/example.gif)






# Supported Minecraft Versions

- 1.12.2



# Java Version

```bash
admin@MyLinuxPC:~/Java/OG-Title-Screen/build/libs$ java --version
openjdk 17.0.2 2022-01-18
OpenJDK Runtime Environment (build 17.0.2+8-Debian-1deb11u1)
OpenJDK 64-Bit Server VM (build 17.0.2+8-Debian-1deb11u1, mixed mode, sharing)
admin@MyLinuxPC:~/Java/OG-Title-Screen/build/libs$
```


# How To Clone

```bash
admin@MyLinuxPC:~/Java$ sudo git clone https://github.com/WalkingLibrary/OG-Title-Screen
Cloning into 'OG-Title-Screen'...
remote: Enumerating objects: 102, done.
remote: Counting objects: 100% (102/102), done.
remote: Compressing objects: 100% (54/54), done.
remote: Total 102 (delta 22), reused 98 (delta 18), pack-reused 0
Receiving objects: 100% (102/102), 158.73 KiB | 913.00 KiB/s, done.
Resolving deltas: 100% (22/22), done.
admin@MyLinuxPC:~/Java$ cd OG-Title-Screen/
admin@MyLinuxPC:~/Java/OG-Title-Screen$ ls
build.gradle  gradle  gradle.properties  gradlew  gradlew.bat  LICENSE  README.md  settings.gradle  src
admin@MyLinuxPC:~/Java/OG-Title-Screen$ sudo chmod 700 ./gradlew
```


# How to Build

```bash
admin@MyLinuxPC:~/Java/OG-Title-Screen$ sudo ./gradlew build
To honour the JVM settings for this build a single-use Daemon process will be forked. See https://docs.gradle.org/7.4.2/userguide/gradle_daemon.html#sec:disabling_the_daemon.
Daemon will be stopped at the end of the build

> Configure project :
Build Version: 0.1.3

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.4.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 47s
9 actionable tasks: 9 executed
admin@MyLinuxPC:~/Java/OG-Title-Screen$ cd ./build/libs/
admin@MyLinuxPC:~/Java/OG-Title-Screen/build/libs$ ls
alphatitlescreen-0.1.3-final.jar  alphatitlescreen-0.1.3.jar
admin@MyLinuxPC:~/Java/OG-Title-Screen/build/libs$
```



# How to Use

```bash

1. Install Forge
2. Place the built Jar into the Mods Folder in your .minecraft Folder

```













License
----
![AUR license](https://img.shields.io/badge/License-MIT-blue)


