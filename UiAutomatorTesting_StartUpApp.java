/// Utility function for use in UiAutomator Android Testing. 
/// To Use this function, copy function definition to your Testing Java file inside the 
/// class definition and call the function with parameter values.

/// This function starts up an app specified by the Package Name specified by the first parameter String.
public boolean funcStartUpApp(String strPackageName, String strActivityName) {

    try {

        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        Intent i = context.getPackageManager().getLaunchIntentForPackage(strPackageName);

        if (i != null) {
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            context.startActivity(i);
            mDevice.waitForIdle();
        } else {
            Log.i("ErrStartApp", "Can't Start App: " + strPackageName);
        }

    } catch (Exception e) {

        Log.e("Err:", e.getMessage());

    }

    return true;
}
