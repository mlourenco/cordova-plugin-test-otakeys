package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import com.otakeys.sdk.OtaKeysApplication;
import com.otakeys.sdk.service.Api;

public class Hello extends CordovaPlugin {

    private MyApplication myApp;

    public Hello(){
        myApp = new MyApplication();
        myApp.onCreate();
    }

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else  if (action.equals("test")) {
          String name = data.getString(0);
          Api api = myApp.getApi();
          Boolean bool = null == api;
          String message = "Teste OK, " + bool;
          callbackContext.success(message);

          return true;
        }else{

            return false;

        }
    }
            
}
