@file:Suppress("unused")

package react.native


fun <T> Platform.select(ios: T, android: T): T {
    @Suppress("UnsafeCastFromDynamic")
    return select(
            jsObject {
                this.ios = ios
                this.android = android
            }
    )
}

val Platform.isIos: Boolean
    get() = Platform.OS == "ios"

val Platform.isAndroid: Boolean
    get() = Platform.OS == "android"

inline fun jsObject(init: dynamic.() -> Unit): dynamic {
    val o = jsObject()
    init(o)
    return o
}


@Suppress("NOTHING_TO_INLINE")
inline fun jsObject(): dynamic = js("{}")

