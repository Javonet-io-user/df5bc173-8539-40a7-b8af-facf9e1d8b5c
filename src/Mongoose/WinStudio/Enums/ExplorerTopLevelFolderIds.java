package Mongoose.WinStudio.Enums;

public enum ExplorerTopLevelFolderIds {
  AllForms(-5L),
  User(-4L),
  Users(-3L),
  Public(-2L),
  Master(-1L),
  ;
  private long numVal;

  ExplorerTopLevelFolderIds(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
