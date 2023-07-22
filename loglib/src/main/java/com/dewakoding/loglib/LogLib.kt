package com.dewakoding.loglib

import android.util.Log


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
website : dewakoding.com

 **/
class LogLib {
    companion object Builder {
        private const val TAG = "LOG_LIB"

        fun run(message: String) {
            Log.i(TAG, message)
        }
    }
}