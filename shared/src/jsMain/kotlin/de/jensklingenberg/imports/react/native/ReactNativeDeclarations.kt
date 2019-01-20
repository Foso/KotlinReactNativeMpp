@file:JsModule("react-native")
@file:Suppress("unused")

package react.native

import react.RClass
import react.RComponent
import react.RProps

@JsName("AppRegistry")
external object AppRegistry {
    fun registerComponent(appKey: String, getComponentFunc: () -> Any)
}


external interface RState


external interface PlatformSelectConfig<T> {
    var ios: T
    var android: T
}

external object StyleSheet {
    fun create(style: dynamic): dynamic
}

@JsName("Platform")
external object Platform {
    /**
     * Has the value 'ios' or 'android'
     */
    val OS: String

    /**
     * On iOS, the [VERSION] is a result of -[UIDevice systemVersion], which is a [String] with the
     * current version of the operating system. An example of the system version is "10.3".
     *
     * On Android, the [VERSION] is an [Int] representing the api level. An example is that
     */
    @JsName("Version")
    val VERSION: dynamic

    fun <T> select(select: PlatformSelectConfig<T>): T
}


external interface ViewProps : RProps {
    var children: List<Any>
    var style: dynamic
}

external interface ButtonProps : RProps {
    var title: String
    var onPress: () -> Unit
}

external interface TextStyles {
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
}


external interface TextProps : RProps {
    var titleText: String
    var style: dynamic

    // var onPress: () -> Unit
}


external val View: RClass<ViewProps>
external val Text: RClass<TextProps>
external val Button: RClass<ButtonProps>
external val Image: RClass<dynamic>

