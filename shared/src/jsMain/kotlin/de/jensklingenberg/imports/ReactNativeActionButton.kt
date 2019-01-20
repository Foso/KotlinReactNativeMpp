package de.jensklingenberg.imports

import react.RClass
import react.RProps


@JsModule("react-native-action-button")
external val ActionButtonImport: dynamic


external interface ActionButtonProps : RProps {
    var buttonColor: String
    var onPress: () -> Unit
    var degrees: Int
    var elevation: Int


}


var ActionButton: RClass<ActionButtonProps> = ActionButtonImport.default