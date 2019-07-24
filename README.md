# Redux-Kotlin

[![CircleCI](https://circleci.com/gh/reduxkotlin/redux-kotlin-thunk.svg?style=svg)](https://circleci.com/gh/reduxkotlin/redux-kotlin-thunk)


![badge][badge-android]
![badge][badge-native]
![badge][badge-js]
![badge][badge-jvm]
![badge][badge-linux]
![badge][badge-windows]
![badge][badge-mac]
![badge][badge-wasm]

A Redux Reselect implementation for memoized dispatch on state selectors.  Forked from [Reduks](https://github.com/beyondeye/Reduks) implementation.

Documentation to come.

Example usage:

```
val subscriber: StoreSubscriber = SelectorSubscriberFn<AppState>(store) {
    withSingleField({ it.isLoadingItems }) {  <--  only called when isLoadingItems changes from previous state.
        if (state.isLoadingItems) {
                view?.showLoading()
            } else {
                view?.hideLoading()
            }
        }

store.subscribe(subscriber)

```

__How to add to project:__

Artifacts are hosted on maven central.  For multiplatform, add the following to your shared module:

```
kotlin {
  sourceSets {
        commonMain { //   <---  name may vary on your project
            dependencies {
                implementation "org.reduxkotlin:redux-kotlin-reselect:0.2.5"
            }
        }
 }
```

For JVM only:
```
  implementation "org.reduxkotlin:redux-kotlin-jvm-reselect:0.2.5"
```

[badge-android]: http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat
[badge-native]: http://img.shields.io/badge/platform-native-lightgrey.svg?style=flat	
[badge-native]: http://img.shields.io/badge/platform-native-lightgrey.svg?style=flat
[badge-js]: http://img.shields.io/badge/platform-js-yellow.svg?style=flat
[badge-js]: http://img.shields.io/badge/platform-js-yellow.svg?style=flat
[badge-jvm]: http://img.shields.io/badge/platform-jvm-orange.svg?style=flat
[badge-jvm]: http://img.shields.io/badge/platform-jvm-orange.svg?style=flat
[badge-linux]: http://img.shields.io/badge/platform-linux-important.svg?style=flat
[badge-linux]: http://img.shields.io/badge/platform-linux-important.svg?style=flat 
[badge-windows]: http://img.shields.io/badge/platform-windows-informational.svg?style=flat
[badge-windows]: http://img.shields.io/badge/platform-windows-informational.svg?style=flat
[badge-mac]: http://img.shields.io/badge/platform-macos-lightgrey.svg?style=flat
[badge-mac]: http://img.shields.io/badge/platform-macos-lightgrey.svg?style=flat
[badge-wasm]: https://img.shields.io/badge/platform-wasm-darkblue.svg?style=flat
