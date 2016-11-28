//// This utility function helps automate repeated clicks on the BottomLeft corner of the device screen.

  ///// intTimesClick: Input the times to click
  ///// intPaddingFromCorner: Provide offset or padding from the edge of the corner for the click point
    
  ///// This function calls funcClicksPoint() and may use the variable mDevice object.



    public void funcClickBottomLeft(int intTimesClick, int intPaddingFromCorner) {
        int intX = intPaddingFromCorner;
        int intY = mDevice.getDisplayHeight() - intPaddingFromCorner;

        this.funcClicksPoint(intTimesClick, intX, intY);
    }
