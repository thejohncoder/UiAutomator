/// This utility function clicks a certain point on the device screen by intTimesClick times.
  /// pass in the times (intTimesClick) to click, the X coordinates and the Y coordinates


public void funcClicksPoint(int intTimesClick, int intX, int intY) {
  
  int intCnt=0;
  while (intCnt<intTimesClick) {
    mDevice.click(intX, intY);
    intCnt++;
  }


}
