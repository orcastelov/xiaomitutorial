package com.monkey.xiaomitutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_day01.*
import java.util.*
import java.util.Calendar.*

class Day01SetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day01)

        val dateString = getDateIDString()
        day01_welcome.text = "Hai Selamat Datang!\nHari ini adalah hari $dateString."
    }

    private fun getDateIDString(): String {
        val calendar = Calendar.getInstance()
        val dayNameString = convertDayOfWeekToIDString(calendar.get(DAY_OF_WEEK))
        val dayString = calendar.get(DAY_OF_MONTH)
        val monthString = convertMonthToIDString(calendar.get(MONTH))
        val yearString = calendar.get(YEAR)
        return "$dayNameString, $dayString $monthString $yearString"
    }

    private fun convertDayOfWeekToIDString(dayOfWeek: Int): String {
        return when (dayOfWeek) {
            MONDAY -> "Senin"
            TUESDAY -> "Selasa"
            WEDNESDAY -> "Rabu"
            THURSDAY -> "Kamis"
            FRIDAY -> "Jumat"
            SATURDAY -> "Sabtu"
            SUNDAY -> "Minggu"
            else -> "Senin"
        }
    }

    private fun convertMonthToIDString(month: Int): String {
        return when (month) {
            JANUARY -> "Januari"
            FEBRUARY -> "Februari"
            MARCH -> "Maret"
            APRIL -> "April"
            MAY -> "Mei"
            JUNE -> "Juni"
            JULY -> "Juli"
            AUGUST -> "Agustus"
            SEPTEMBER -> "September"
            OCTOBER -> "Oktober"
            NOVEMBER -> "November"
            DECEMBER -> "Desember"
            else -> "Januari"
        }
    }
}
