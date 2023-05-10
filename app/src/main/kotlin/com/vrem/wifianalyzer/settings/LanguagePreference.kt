package com.vrem.wifianalyzer.settings

import android.content.Context
import android.util.AttributeSet
import com.vrem.util.defaultLanguageTag
import com.vrem.util.supportedLanguages
import com.vrem.util.toCapitalize
import com.vrem.util.toLanguageTag
import java.util.*

private fun data(): List<Data> = supportedLanguages()
        .map { map(it) }
        .sorted()

private fun map(it: Locale): Data =
        Data(toLanguageTag(it), it.getDisplayName(it).toCapitalize(Locale.getDefault()))

class LanguagePreference(context: Context, attrs: AttributeSet) :
        CustomPreference(context, attrs, data(), defaultLanguageTag())