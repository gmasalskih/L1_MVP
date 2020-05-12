package ru.gmasalskih.mvp.model

object Model : IModel {
    private val list = arrayListOf(0, 0, 0)

    override fun getValueByIndex(index: Int) = list[index]

    override fun setValueByIndex(index: Int, value: Int) {
        list[index] = value
    }
}