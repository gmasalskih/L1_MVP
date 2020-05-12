package ru.gmasalskih.mvp.model

interface IModel {
    fun getValueByIndex(index: Int):Int
    fun setValueByIndex(index: Int, value: Int)
}