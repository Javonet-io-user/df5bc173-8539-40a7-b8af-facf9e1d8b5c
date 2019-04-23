package Mongoose.WinStudio.Enums;

public enum GlobalObjectType {
  Variable(0L),
  Validator(1L),
  String(2L),
  Script(3L),
  ComponentClass(4L),
  PropertyClassExtension(5L),
  ShortCutMenu(6L),
  Filter(7L),
  Form(8L),
  FormTemplate(9L),
  None(-1L),
  ;
  private long numVal;

  GlobalObjectType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
