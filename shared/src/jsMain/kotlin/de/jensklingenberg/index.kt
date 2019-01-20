package de.jensklingenberg

import de.jensklingenberg.ui.Application
import react.native.AppRegistry


fun run() = { Application() }

fun main(args: Array<String>) {
    println("Main Kotlin function is running...")
    AppRegistry.registerComponent("KotlinReactNativeMpp") {
        run()
    }
}
