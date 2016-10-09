package com.yuhilda.smooch;

import android.app.Application;

import io.smooch.core.Smooch;

/**
 * Created by hilda on 09/10/2016.
 */
public class myApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Smooch.init(this, "6ut86dy6u65y9gqc8ujvr0sqt");
    }
}
