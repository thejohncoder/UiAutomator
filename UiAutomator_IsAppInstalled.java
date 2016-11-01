/// This utility function is used to check if an app is installed in the device


public boolean funcIsAppInstalled(String strPackageName, PackageManager tmpPM) {
  try{
      tmpPM.getPackageInfo(strPackageName, PackageManager.GET_ACTIVITIES);
      Log.i{"App Installed Chk", "Installed: " + strPackageName);
      return true;
  } catch (Exception e) {
      Log.i("App Installed Chk", "Not Installed: " + strPackageName);
      return false;
  }

}
