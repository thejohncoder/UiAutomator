//// Utility function to get the Display Dimensions information of currently running device.

//// The info is output to AndroidStudio's Log window


public void funcShowDisplayDimensions() {

  Log.i("Display Dimensions", "Wd: " + mDevice.getDisplayWidth() + " | Ht: " + mDevice.getDisplayHeight());

}
