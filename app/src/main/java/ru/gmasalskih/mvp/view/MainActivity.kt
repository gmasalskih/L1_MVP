package ru.gmasalskih.mvp.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.gmasalskih.mvp.R
import ru.gmasalskih.mvp.presenter.IPresenter
import ru.gmasalskih.mvp.presenter.Presenter

class MainActivity : AppCompatActivity() {

    private val presenter: IPresenter = Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initState()
        initListener()
    }

    @SuppressLint("SetTextI18n")
    private fun initState(){
        btn_count1.text = "${resources.getText(R.string.counter)} = ${presenter.getCurrentValueByIndex(0)}"
        btn_count2.text = "${resources.getText(R.string.counter)} = ${presenter.getCurrentValueByIndex(1)}"
        btn_count3.text = "${resources.getText(R.string.counter)} = ${presenter.getCurrentValueByIndex(2)}"
    }

    @SuppressLint("SetTextI18n")
    private fun initListener(){
        btn_count1.setOnClickListener {
            btn_count1.text = "${resources.getText(R.string.counter)} = ${presenter.getNewValueByIndex(0)}"
        }
        btn_count2.setOnClickListener {
            btn_count2.text = "${resources.getText(R.string.counter)} = ${presenter.getNewValueByIndex(1)}"
        }
        btn_count3.setOnClickListener {
            btn_count3.text = "${resources.getText(R.string.counter)} = ${presenter.getNewValueByIndex(2)}"
        }
    }
}
