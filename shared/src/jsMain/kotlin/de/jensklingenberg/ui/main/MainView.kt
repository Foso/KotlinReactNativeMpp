package de.jensklingenberg.ui.main

import de.jensklingenberg.imports.ActionButton
import react.*
import react.RComponent
import react.RState
import react.native.Button
import react.native.Text
import react.native.View

interface AppState : RState {
    var counter: Int
}

class MainView : RComponent<RProps, AppState>(), MainContract.View {
    private var presenter: MainContract.Presenter? = null

    /****************************************** React Lifecycle methods  */

    init {
        state.counter = 0
    }

    override fun RBuilder.render() {

        View {
            attrs.style = object {
                val flex = 1
            }
            Button {
                attrs {
                    title = "Kotlin React Native Demo Home Page"
                    onPress = { presenter?.onCounterClicked() }
                }
            }
            View {
                attrs.style = object {
                    val flex = 1
                    val alignItems = "center"
                    val justifyContent = "center"
                }
                Text {
                    +"You have pushed the button this many times:"
                    attrs {

                        style = object {
                            val color = "black"
                        }
                    }

                }

                Text {
                    +"${state.counter}"
                    attrs {

                        style = object {
                            //  val backgroundColor = "green"
                            val color = "black"
                        }
                    }

                }
            }

            ActionButton {
                attrs {
                    buttonColor = "#3498db"
                    onPress = { presenter?.onCounterClicked() }
                    degrees = 0
                    elevation = 8

                }
            }
        }

    }

    override fun componentDidMount() {
        println("componentDidMount")
        presenter = MainPresenter(this)
        presenter?.componentDidMount()

    }


    override fun componentWillUnmount() {
        presenter?.componentWillUnmount()
    }

    /****************************************** Presenter methods  */


    override fun onCounterUpdate(counter: Int) {

        setState {
            this.counter = counter
        }

    }

}

fun RBuilder.main() = child(MainView::class) {}
