

/// Very useful utilities for use with Android Testing for UiAutomator.

/// This function shuts down a running app specified by its Package Name passed in by the function parameter
public boolean funcShutDownApp(String strPackageName) {

    try {
        mDevice.executeShellCommand("am force-stop " + strPackageName);
        Log.i("ShutDown--", strPackageName);
        return true;
    } catch (Exception e) {
        Log.e("Err", "Err in App Shutdown: " + strPackageName);
        return false;
    }

}




