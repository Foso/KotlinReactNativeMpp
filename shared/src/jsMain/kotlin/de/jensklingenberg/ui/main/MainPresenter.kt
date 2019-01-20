package de.jensklingenberg.ui.main


class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    var counter = 0

    override fun componentWillUnmount() {

    }

    override fun componentDidMount() {
    }


    override fun onCounterClicked() {
        counter++
        view.onCounterUpdate(counter)

    }

}