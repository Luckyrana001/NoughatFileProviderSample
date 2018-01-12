package org.androidluckyguys;

import android.app.Application;

/**
 * Created by LuckyRana on 28/08/2017.
 */

public class MyClass extends Application {

    // Singleton instance
    private static MyClass sInstance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        // Setup singleton instance
        sInstance = this;
    }

    // Getter to access Singleton instance
    public static MyClass getInstance() {
        return sInstance ;
    }
}