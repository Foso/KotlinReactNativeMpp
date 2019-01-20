<h1 align="center">Kotlin React-Native Mpp </h1>

[![jCenter](https://img.shields.io/badge/Apache-2.0-green.svg
)](https://github.com/Foso/KotlinReactNativeMpp/blob/master/LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![All Contributors](https://img.shields.io/badge/all_contributors-1-range.svg?style=flat-square)](#contributors)
  <a href="https://twitter.com/intent/tweet?text=Hey, check out KotlinReactNativeMpp https://github.com/Foso/KotlinReactNativeMpp via @jklingenberg_ #Android 
"><img src="https://img.shields.io/twitter/url/https/github.com/angular-medellin/meetup.svg?style=social" alt="Tweet"></a>

> A React-Native App written with Kotlin JS

<p align="left">
    <img src ="https://github.com/Foso/KotlinReactNativeMpp/blob/master/docs/Screenshot.png" height=500 />
 
</p>

## Introduction 🙋‍♂️
This is an example project to show how you can use KotlinJS to write React-Native Apps.
You can click on an floating action button and a counter will update

# 🏠 Architecture

## 🛠️ Built With
### Kotlin
[![jCenter](https://img.shields.io/badge/Kotlin-1.3.11-green.svg
)]()

### Tools
[![jCenter](https://img.shields.io/badge/ReactNative-0.52.0-green.svg
)]()
* [Yarn](https://yarnpkg.com/lang/en/)
* [Haul](https://github.com/callstack/haul)

### Projekt Structure
* <kbd>android</kbd> - Base android project directory
* <kbd>ios</kbd> - Base ios project directory
* <kbd>shared</kbd> - This module is using the Kotlin Multiplatform Plugin, but is only configured to compile to Javascript/React.
The main entry of the module is inside the <kbd>index.kt</kbd>.  In the <kbd>imports</kbd>-folder are all relevant wrapper for the React modules.
 In the <kbd>ui</kbd>-folder are all (you might guessed it), ui relevant files

# Development
1. Install  [Yarn](https://yarnpkg.com/lang/en/). 
2. Run `yarn install` to install all the javascript dependencies.
3. Run `./gradlew -t :shared:assemble` - compiles the Kotlin javascript module located in `./shared`, and watches it for changes. Leave this terminal open. Remove the `-t` argument if you don't want gradle to watch for changes and auto-rebuild.
4. Run `yarn haul start --platform android`. You should now see the message "You can now run the app on your * device"
5. Run the Android app in an Android emulator. Open the app menu,  press Command + M on OSX or Ctrl + M on Linux and Windows. Inside "Dev Settings" disable "JS Delta". Leave the dev settings.
6. Changes in the "shared" folder should now trigger the app to update the content. Altenative you can manually trigger a reload in the app menu.

## ✍️ Feedback

Feel free to send feedback on [Twitter](https://twitter.com/jklingenberg_) or [file an issue](https://github.com/foso/KotlinReactNativeMpp/issues/new). Feature requests are always welcome.


## 📜 License

This project is licensed under the Apache License, Version 2.0 - see the [LICENSE.md](https://github.com/Foso/KotlinReactNativeMpp/blob/master/LICENSE) file for details

### Find this project useful ? :heart:
* Support it by clicking the :star: button on the upper right of this page. :v:

License
-------

    Copyright 2019 Jens Klingenberg

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



