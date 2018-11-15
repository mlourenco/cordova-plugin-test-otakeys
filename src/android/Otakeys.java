package com.mobiag.cordova.plugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

public class Otakeys extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args,
    final CallbackContext callbackContext) {
      
      if (action.equals("test")) {
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
        callbackContext.sendPluginResult(pluginResult);
        return true;
      }
      else {
        callbackContext.error("\"" + action + "\" is not a recognized action.");
        return false;
      }
  }
}
