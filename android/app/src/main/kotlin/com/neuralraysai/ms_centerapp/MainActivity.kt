package com.neuralraysai.ms_centerapp

import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 2
        super.onCreate(savedInstanceState)
        AppCenter.start(getApplication(), "a8c09c1d-816e-4e09-86b1-24057adb0ef6",
                Analytics::class.java, Crashes::class.java)
    }
}
