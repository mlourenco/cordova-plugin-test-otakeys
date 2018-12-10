package com.example.plugin;

import com.otakeys.monkey.test.R;
import com.otakeys.sdk.OtaKeysApplication;

public class MyApplication extends OtaKeysApplication {


	@Override
	public void onCreate() {
		super.onCreate();

		setDebugMode(true);
	}

}

