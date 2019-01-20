package react

@JsModule("react")
external object React {
    abstract class Component<P, S>(
            props: P? = definedExternally,
            context: Any? = definedExternally
    ) {
        abstract fun render(): dynamic
        abstract fun componentDidMount()
        abstract fun componentWillUnmount()
    }

    fun createElement(elementClass: dynamic, props: dynamic, vararg children: dynamic): ReactElement
}



