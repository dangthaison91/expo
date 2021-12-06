package abi44_0_0.expo.modules.sms

import android.content.Context
import abi44_0_0.expo.modules.core.BasePackage
import abi44_0_0.expo.modules.core.ExportedModule

class SMSPackage : BasePackage() {
  override fun createExportedModules(reactContext: Context): List<ExportedModule> {
    return listOf(SMSModule(reactContext))
  }
}
