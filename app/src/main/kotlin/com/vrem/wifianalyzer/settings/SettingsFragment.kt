package com.vrem.wifianalyzer.settings

import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.vrem.util.buildMinVersionQ
import com.vrem.wifianalyzer.R

open class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(bundle: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.settings)
        findPreference<Preference>(getString(R.string.wifi_off_on_exit_key))!!.isVisible = !buildMinVersionQ()
    }

}