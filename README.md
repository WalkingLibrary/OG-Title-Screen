# Minecraft Alpha Screen


### Gradle

```
buildscript {
    repositories {
        jcenter()
    }


}


allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
...

dependencies {
    compile 'com.github.WalkingLibrary:McDevLib:$version'

}


```
License
----
![AUR license](https://img.shields.io/badge/License-MIT-blue)


