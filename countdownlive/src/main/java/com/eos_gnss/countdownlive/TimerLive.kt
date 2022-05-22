package com.eos_gnss.countdownlive

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TimerLive private constructor(millisInFuture: Long, countDownInterval: Long) {

    private val _tickLive: MutableLiveData<Long> = MutableLiveData<Long>()
    private val tickLive: LiveData<Long> = _tickLive

    init {
        object : CountDownTimer(millisInFuture, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                _tickLive.value = millisUntilFinished
            }

            override fun onFinish() {
                _tickLive.value = 0
                cancel()
            }
        }.start()
    }
    companion object {

        /**
         * Create TimerLive instance
         *
         * @param millisInFuture Long
         * @param countDownInterval Long
         * @return LiveData<Long> returning counter live data
         */
        fun create(millisInFuture: Long, countDownInterval: Long): LiveData<Long> {
            return TimerLive(millisInFuture, countDownInterval).tickLive
        }
    }
}