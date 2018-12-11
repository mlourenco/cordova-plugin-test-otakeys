package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.otakeys.sdk.OtaKeysApplication;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else  if (action.equals("test")) {
          String name = data.getString(0);
          String message = "Teste OK, " + getOtaSdk() == null;
          callbackContext.success(message);

          return true;
        }else{

            return false;

        }
    }

    public OtaKeysApplication getOtaSdk() {
        return ((OtaKeysApplication) getApplication()); 
    }
            
}
