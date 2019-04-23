package Mongoose.WinStudio.Enums;

public enum EditLevels {
  None(0L),
  BasicUser(1L),
  FullUser(2L),
  SiteDev(3L),
  VendorDev(4L),
  ;
  private long numVal;

  EditLevels(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
