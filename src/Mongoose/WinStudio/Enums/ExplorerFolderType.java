package Mongoose.WinStudio.Enums;

public enum ExplorerFolderType {
  Root(0L),
  MasterFolders(1L),
  PublicFolders(2L),
  UserFolders(3L),
  UsersMyFolder(4L),
  AllFormsFolders(5L),
  Normal(6L),
  AutoRunPreload(7L),
  None(-1L),
  ;
  private long numVal;

  ExplorerFolderType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
