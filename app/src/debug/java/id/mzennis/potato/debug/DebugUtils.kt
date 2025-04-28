package id.mzennis.potato.debug

import android.content.Context
import android.content.Intent

object DebugUtils {
    
    fun openDebugScreen(context: Context) {
        val intent = Intent(context, DebugActivity::class.java)
        context.startActivity(intent)
    }
}