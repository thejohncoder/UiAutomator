/// This utility function calls funcClickPoint() function and passes the input of the following:

///  intTimesClick, widthmidpx, heightmidpx;


public void funcClicksCenter(int intTimesClick) {
  int intCnt=0;
  int widthmidpx = mDevice.getDisplayWidth() / 2;
  int heightmidpx = mDevice.getDsiplayHeigth() / 2;
  
  funcClicksPoint(intTimesClick, widthmidpx, heightmidpx);

}
