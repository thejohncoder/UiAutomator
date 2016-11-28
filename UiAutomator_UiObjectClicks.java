/// This utility function clicks or longClicks a passed in UiObject by custom multiple times.
  /// Input:  intTimesClick - the times the item is clicked
  /// Input: intClickType - how is the item is clicked [0 for normal click, 1 for longClick]
  /// Input: obj - the UiObject you pass in to click the item


    public void funcUIObjectClicks(int intTimesClick, int intClickType, UiObject obj) throws Exception {
        int intCnt = 0;
        while (intCnt < intTimesClick) {
            switch (intClickType) {
                case 0:
                    obj.click();
                    break;
                case 1:
                    obj.longClick();
                    break;
                default:
                    obj.click();
            }
            intCnt++;
        }
        
    }
