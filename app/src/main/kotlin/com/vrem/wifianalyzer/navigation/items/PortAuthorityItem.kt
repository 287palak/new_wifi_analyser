package com.vrem.wifianalyzer.navigation.items

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.MenuItem
import com.vrem.annotation.OpenClass
import com.vrem.wifianalyzer.MainActivity
import com.vrem.wifianalyzer.navigation.NavigationMenu

@OpenClass
internal class PortAuthorityItem : NavigationItem {
    override fun activate(mainActivity: MainActivity, menuItem: MenuItem, navigationMenu: NavigationMenu) {
        try {
            val context: Context = mainActivity.applicationContext
            val intent = findPortAuthority(context.packageManager)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (e: Exception) {
            // No Store or Port Authority Available
        }
    }

    private fun findPortAuthority(packageManager: PackageManager): Intent =
        portAuthorities
            .firstNotNullOfOrNull { packageManager.getLaunchIntentForPackage(it) }
            ?: redirectToStore()

    fun redirectToStore(): Intent {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("market://details?id=$PORT_AUTHORITY_FREE")
        return intent
    }

    companion object {
        private const val PORT_AUTHORITY = "com.aaronjwood.portauthority"
        private const val PORT_AUTHORITY_DONATE = "$PORT_AUTHORITY.donate"
        private const val PORT_AUTHORITY_FREE = "$PORT_AUTHORITY.free"
        private val portAuthorities = arrayOf(PORT_AUTHORITY_DONATE, PORT_AUTHORITY_FREE, PORT_AUTHORITY)
    }
}