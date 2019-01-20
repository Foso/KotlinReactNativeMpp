package de.jensklingenberg.ui.main

import de.jensklingenberg.ui.common.ReactPresenter


interface MainContract {

    interface View {

        fun onCounterUpdate(counter: Int)
    }

    interface Presenter : ReactPresenter {
        fun onCounterClicked()

    }

}