package Mongoose.WinStudio.Enums;

public enum ExplorerObjectType {
  AllForms(65L),
  Folder(70L),
  QueryForm(81L),
  NormalForm(82L),
  Workspace(87L),
  ;
  private long numVal;

  ExplorerObjectType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
