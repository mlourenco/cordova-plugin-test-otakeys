package com.example.plugin;

import com.otakeys.sdk.OtaKeysApplication;
import com.otakeys.sdk.Api;

public class MyApplication extends OtaKeysApplication {


	@Override
	public void onCreate() {
		super.onCreate();

		setDebugMode(true);
    }
    
    public static Api getOtaAPI(){
        return (Api) getApi();
    }

}

