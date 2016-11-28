//// This utility function helps automate repeated clicks on the TopLeft corner of the device screen.

  ///// intTimesClick: Input the times to click
  ///// intPaddingFromCorner: Provide offset or padding from the edge of the corner for the click point
    
    
    
    
    public void funcClickTopLeft(int intTimesClick, int intPaddingFromCorner) {
        int intX = intPaddingFromCorner;
        int intY = intPaddingFromCorner;

        this.funcClicksPoint(intTimesClick, intX, intY);
    }
