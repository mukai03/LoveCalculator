package kg.geektech.lovecalculator

import android.app.Application
import kg.geektech.lovecalculator.model.LoveApi


class App : Application() {
    companion object{
        lateinit var loveApi: LoveApi

    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        loveApi = retrofitService.getApi()
    }
}