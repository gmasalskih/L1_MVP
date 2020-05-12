package ru.gmasalskih.mvp.presenter

interface IPresenter {
    fun getNewValueByIndex(index: Int): Int
    fun getCurrentValueByIndex(index: Int): Int
}