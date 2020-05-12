package ru.gmasalskih.mvp.presenter

import ru.gmasalskih.mvp.model.IModel
import ru.gmasalskih.mvp.model.Model

object Presenter : IPresenter {

    private val model: IModel = Model

    override fun getNewValueByIndex(index: Int): Int {
        var value = model.getValueByIndex(index)
        value++
        model.setValueByIndex(index, value)
        return value
    }

    override fun getCurrentValueByIndex(index: Int) = model.getValueByIndex(index)

}