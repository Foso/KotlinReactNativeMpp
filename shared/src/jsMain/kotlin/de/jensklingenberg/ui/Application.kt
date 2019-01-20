package de.jensklingenberg.ui

import de.jensklingenberg.ui.main.main
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class Application : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        main()
    }
}