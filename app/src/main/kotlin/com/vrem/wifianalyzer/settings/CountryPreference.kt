package com.vrem.wifianalyzer.settings

import android.content.Context
import android.util.AttributeSet
import com.vrem.util.defaultCountryCode
import com.vrem.wifianalyzer.MainContext
import com.vrem.wifianalyzer.wifi.band.WiFiChannelCountry
import java.util.*

private fun data(): List<Data> {
    val currentLocale: Locale = MainContext.INSTANCE.settings.languageLocale()
    return WiFiChannelCountry.findAll()
            .map { Data(it.countryCode(), it.countryName(currentLocale)) }
            .sorted()
}

class CountryPreference(context: Context, attrs: AttributeSet) :
        CustomPreference(context, attrs, data(), defaultCountryCode())
