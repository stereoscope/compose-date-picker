package com.dt.composedatepicker

import java.util.Date

interface SelectDateListener {
    fun onDateSelected(date: Date)
    fun onCanceled()
}