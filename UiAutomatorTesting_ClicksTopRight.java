//// This utility function helps automate repeated clicks on the TopRight corner of the device screen.

  ///// intTimesClick: Input the times to click
  ///// intPaddingFromCorner: Provide offset or padding from the edge of the corner for the click point
    
  ///// This function calls funcClicksPoint() and may use the variable mDevice object.
    
    
    public void funcClickTopRight(int intTimesClick, int intPaddingFromCorner) {
        int intX = mDevice.getDisplayWidth() - intPaddingFromCorner;
        int intY = 0 + intPaddingFromCorner;

        this.funcClicksPoint(intTimesClick, intX, intY);
    }
