package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.otakeys.sdk.OtaKeysApplication;

public class Hello extends CordovaPlugin {

    private MyApplication app;

    public Hello(){
        app = new MyApplication();
    }

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + ((Boolean)app.getApi()==null);
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
            
}
