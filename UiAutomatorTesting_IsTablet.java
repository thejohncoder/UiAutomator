/// This function checks to see if current running device is a tablet


public boolean funcIsTablet() throws Exception {
    double widthpx = mDevice.getDisplayWidth();
    double heightpx = mDevice.getDisplayHeight();

    Runtime runtime =  Runtime.getRuntime();
    Process process =  runtime.exec("getprop ro.sf.lcd_density");

    InputStream inputStream = process.getInputStream();
    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    double dpi = Double.parseDouble(bufferedReader.readLine());

    double widthdp = widthpx / (dpi / 160);
    double heightdp = heightpx / (dpi / 160);

    return (widthdp >= 640 && heightdp >= 480);
}
