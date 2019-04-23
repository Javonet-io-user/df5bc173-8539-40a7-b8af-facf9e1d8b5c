package Mongoose.WinStudio.Enums;

public enum DesignerInvokeAction {
  FormProperties(1L),
  Component(2L),
  EventHandler(3L),
  Variable(4L),
  ShortCutMenu(5L),
  String(6L),
  Validators(7L),
  Script(8L),
  ComponentClass(9L),
  PropertyClassExtension(10L),
  Filter(11L),
  CurrentFilter(12L),
  VisualBasicEditor(13L),
  EnterTabOrder(14L),
  EnterTabOrderAt(15L),
  LeaveTabOrder(16L),
  LeaveTabOrderAt(17L),
  NewFormWized(18L),
  CopyFormDefinition(19L),
  DeleteComponent(20L),
  AdjustGrid(21L),
  Cut(22L),
  Copy(23L),
  Paste(24L),
  Undo(25L),
  EditFormTemplate(26L),
  CopyFormTemplate(27L),
  Components(28L),
  ;
  private long numVal;

  DesignerInvokeAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
