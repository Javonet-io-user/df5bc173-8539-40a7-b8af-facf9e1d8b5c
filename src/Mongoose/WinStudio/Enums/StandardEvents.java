package Mongoose.WinStudio.Enums;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Mongoose.WinStudio.Enums.*;

public class StandardEvents {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_REFRESH() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_REFRESH");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_REFRESH(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_REFRESH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NEW() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NEW");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NEW(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NEW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COPY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COPY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COPY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COPY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SAVE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_SAVE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SAVE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_SAVE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SAVE_CURRENT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_SAVE_CURRENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SAVE_CURRENT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_SAVE_CURRENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_FILTER() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_FILTER");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_FILTER(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_FILTER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_DELETE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_DELETE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_DELETE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_DELETE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_FIRST() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_FIRST");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_FIRST(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_FIRST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LAST() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_LAST");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LAST(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_LAST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NEXT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NEXT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NEXT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NEXT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_PREVIOUS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_PREVIOUS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_PREVIOUS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_PREVIOUS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_REFRESH_CURRENT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_REFRESH_CURRENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_REFRESH_CURRENT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_REFRESH_CURRENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_GET_MORE_ROWS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_GET_MORE_ROWS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_GET_MORE_ROWS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_GET_MORE_ROWS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NOTES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NOTES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NOTES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NOTES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NOTES_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NOTES_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NOTES_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NOTES_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_NOTES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_CURRENT_NOTES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_NOTES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_CURRENT_NOTES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_NOTES_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_CURRENT_NOTES_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_NOTES_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_CURRENT_NOTES_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_DOCS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_CURRENT_DOCS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_DOCS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_CURRENT_DOCS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_DOCS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_CURRENT_DOCS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_DOCS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_CURRENT_DOCS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LINK_UPDATE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_LINK_UPDATE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LINK_UPDATE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_LINK_UPDATE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_FIND() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COL_FIND");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_FIND(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COL_FIND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_REPLACE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COL_REPLACE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_REPLACE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COL_REPLACE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_SORT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COL_SORT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_SORT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COL_SORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_GRAPH() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_GRAPH");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_GRAPH(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_GRAPH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SPREADSHEET_COPY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_SPREADSHEET_COPY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SPREADSHEET_COPY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_SPREADSHEET_COPY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_VIEW_WORKFLOW() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_VIEW_WORKFLOW");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_VIEW_WORKFLOW(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_VIEW_WORKFLOW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_REFRESH_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_REFRESH_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_REFRESH_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_REFRESH_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NEW_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NEW_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NEW_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NEW_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COPY_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COPY_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COPY_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COPY_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SAVE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_SAVE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SAVE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_SAVE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SAVE_CURRENT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_SAVE_CURRENT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SAVE_CURRENT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_SAVE_CURRENT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_FILTER_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_FILTER_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_FILTER_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_FILTER_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_DELETE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_DELETE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_DELETE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_DELETE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_FIRST_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_FIRST_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_FIRST_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_FIRST_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LAST_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_LAST_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LAST_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_LAST_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_NEXT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_NEXT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_NEXT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_NEXT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_PREVIOUS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_PREVIOUS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_PREVIOUS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_PREVIOUS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_REFRESH_CURRENT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_REFRESH_CURRENT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_REFRESH_CURRENT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_REFRESH_CURRENT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_GET_MORE_ROWS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_GET_MORE_ROWS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_GET_MORE_ROWS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_GET_MORE_ROWS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LINK_UPDATE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_LINK_UPDATE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LINK_UPDATE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_LINK_UPDATE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_FIND_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COL_FIND_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_FIND_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_COL_FIND_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_REPLACE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_COL_REPLACE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_REPLACE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_COL_REPLACE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COL_SORT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COL_SORT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COL_SORT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_COL_SORT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_GRAPH_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_GRAPH_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_GRAPH_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_GRAPH_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_SPREADSHEET_COPY_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_SPREADSHEET_COPY_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_SPREADSHEET_COPY_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_SPREADSHEET_COPY_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_VIEW_WORKFLOW_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_VIEW_WORKFLOW_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_VIEW_WORKFLOW_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_VIEW_WORKFLOW_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_MODAL_CHILD_FORM_READY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_MODAL_CHILD_FORM_READY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_MODAL_CHILD_FORM_READY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_MODAL_CHILD_FORM_READY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_REFRESH() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_REFRESH");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_REFRESH(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_REFRESH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_NEW() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_NEW");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_NEW(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_NEW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_COPY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_COPY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_COPY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_COPY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SAVE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_SAVE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SAVE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_SAVE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SAVE_CURRENT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_SAVE_CURRENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SAVE_CURRENT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_SAVE_CURRENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_DELETE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_DELETE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE_NEW() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_DELETE_NEW");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE_NEW(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_DELETE_NEW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE_EXISTING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_DELETE_EXISTING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE_EXISTING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_DELETE_EXISTING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_FIRST() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_FIRST");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_FIRST(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_FIRST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_LAST() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_LAST");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_LAST(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_LAST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_NEXT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_NEXT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_NEXT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_NEXT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_PREVIOUS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_PREVIOUS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_PREVIOUS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_PREVIOUS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_REFRESH_CURRENT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_REFRESH_CURRENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_REFRESH_CURRENT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_REFRESH_CURRENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SELECT_CURRENT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_SELECT_CURRENT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SELECT_CURRENT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_SELECT_CURRENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_GET_MORE_ROWS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_GET_MORE_ROWS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_GET_MORE_ROWS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_GET_MORE_ROWS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_REFRESH_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_REFRESH_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_REFRESH_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_REFRESH_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_NEW_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_NEW_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_NEW_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_NEW_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_COPY_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_COPY_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_COPY_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_COPY_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SAVE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_SAVE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SAVE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_SAVE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SAVE_CURRENT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_SAVE_CURRENT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SAVE_CURRENT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_SAVE_CURRENT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_DELETE_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_DELETE_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE_NEW_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_DELETE_NEW_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE_NEW_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_DELETE_NEW_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_DELETE_EXISTING_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_DELETE_EXISTING_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_DELETE_EXISTING_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_DELETE_EXISTING_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_FIRST_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_FIRST_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_FIRST_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_FIRST_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_LAST_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_LAST_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_LAST_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_LAST_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_NEXT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_NEXT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_NEXT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("OBJ_NEXT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_PREVIOUS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("OBJ_PREVIOUS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_PREVIOUS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_PREVIOUS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_REFRESH_CURRENT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_REFRESH_CURRENT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_REFRESH_CURRENT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_REFRESH_CURRENT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_SELECT_CURRENT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_SELECT_CURRENT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_SELECT_CURRENT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_SELECT_CURRENT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOBJ_GET_MORE_ROWS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("OBJ_GET_MORE_ROWS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOBJ_GET_MORE_ROWS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("OBJ_GET_MORE_ROWS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORMPAGE_POP() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORMPAGE_POP");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORMPAGE_POP(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORMPAGE_POP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_PREDISPLAY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_PREDISPLAY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_PREDISPLAY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_PREDISPLAY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CALLED_FORM_RETURNED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_CALLED_FORM_RETURNED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CALLED_FORM_RETURNED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_CALLED_FORM_RETURNED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CLOSE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_CLOSE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CLOSE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_CLOSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_CACHE_CHANGING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_CURRENT_CACHE_CHANGING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_CACHE_CHANGING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_CURRENT_CACHE_CHANGING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_CURRENT_CACHE_CHANGED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_CURRENT_CACHE_CHANGED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_CURRENT_CACHE_CHANGED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_CURRENT_CACHE_CHANGED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_INIT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_INIT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_INIT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_INIT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_TIMER_TICK() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_TIMER_TICK");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_TIMER_TICK(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_TIMER_TICK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LOAD_BOUND_COMPONENT_VALUES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_LOAD_BOUND_COMPONENT_VALUES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LOAD_BOUND_COMPONENT_VALUES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_LOAD_BOUND_COMPONENT_VALUES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_LOAD_DERIVED_COMPONENT_VALUES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_LOAD_DERIVED_COMPONENT_VALUES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_LOAD_DERIVED_COMPONENT_VALUES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_LOAD_DERIVED_COMPONENT_VALUES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_GET_BOUND_COMPONENT_VALUES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_GET_BOUND_COMPONENT_VALUES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_GET_BOUND_COMPONENT_VALUES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_GET_BOUND_COMPONENT_VALUES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_PUT_BOUND_COMPONENT_VALUES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_PUT_BOUND_COMPONENT_VALUES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_PUT_BOUND_COMPONENT_VALUES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_PUT_BOUND_COMPONENT_VALUES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_PERFORM_VALIDATIONS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_PERFORM_VALIDATIONS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_PERFORM_VALIDATIONS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_PERFORM_VALIDATIONS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_EXIT_OK() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_EXIT_OK");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_EXIT_OK(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_EXIT_OK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_EXIT_CANCEL() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_EXIT_CANCEL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_EXIT_CANCEL(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_EXIT_CANCEL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_HELP() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_HELP");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_HELP(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_HELP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_COMPONENT_HELP() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FORM_COMPONENT_HELP");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_COMPONENT_HELP(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FORM_COMPONENT_HELP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFORM_VALIDATIONS_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FORM_VALIDATIONS_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFORM_VALIDATIONS_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FORM_VALIDATIONS_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_FIND() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("CUR_COMPONENT_FIND");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_FIND(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("CUR_COMPONENT_FIND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_DETAILS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("CUR_COMPONENT_DETAILS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_DETAILS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_DETAILS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_ADD() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("CUR_COMPONENT_ADD");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_ADD(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("CUR_COMPONENT_ADD", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_GRAPH_PROPERTIES() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_GRAPH_PROPERTIES");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_GRAPH_PROPERTIES(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_GRAPH_PROPERTIES", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_GRIDCOL_MAINT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_GRIDCOL_MAINT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_GRIDCOL_MAINT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_GRIDCOL_MAINT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_CLIPBOARD_COPY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_CLIPBOARD_COPY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_CLIPBOARD_COPY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_CLIPBOARD_COPY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_CLIPBOARD_PASTE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_CLIPBOARD_PASTE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_CLIPBOARD_PASTE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_CLIPBOARD_PASTE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_CLIPBOARD_CUT() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_CLIPBOARD_CUT");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_CLIPBOARD_CUT(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_CLIPBOARD_CUT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_CLIPBOARD_PASTE_APPEND() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_CLIPBOARD_PASTE_APPEND");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_CLIPBOARD_PASTE_APPEND(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_CLIPBOARD_PASTE_APPEND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCUR_COMPONENT_CLIPBOARD_PASTE_OVERWRITE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("CUR_COMPONENT_CLIPBOARD_PASTE_OVERWRITE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCUR_COMPONENT_CLIPBOARD_PASTE_OVERWRITE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("CUR_COMPONENT_CLIPBOARD_PASTE_OVERWRITE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getQUERY_FORM_INITIALIZE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("QUERY_FORM_INITIALIZE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setQUERY_FORM_INITIALIZE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("QUERY_FORM_INITIALIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getQUERY_FORM_ADD_ADDITIONAL() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("QUERY_FORM_ADD_ADDITIONAL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setQUERY_FORM_ADD_ADDITIONAL(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("QUERY_FORM_ADD_ADDITIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getQUERY_FORM_REMOVE_ADDITIONAL() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("QUERY_FORM_REMOVE_ADDITIONAL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setQUERY_FORM_REMOVE_ADDITIONAL(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("QUERY_FORM_REMOVE_ADDITIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getQUERY_FORM_CLEAR() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("QUERY_FORM_CLEAR");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setQUERY_FORM_CLEAR(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("QUERY_FORM_CLEAR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getQUERY_FORM_SELECT_ADDITIONAL_PROPERTY() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("QUERY_FORM_SELECT_ADDITIONAL_PROPERTY");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setQUERY_FORM_SELECT_ADDITIONAL_PROPERTY(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("QUERY_FORM_SELECT_ADDITIONAL_PROPERTY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_BEGIN() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FILTER_IN_PLACE_BEGIN");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_BEGIN(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_BEGIN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_OK() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FILTER_IN_PLACE_OK");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_OK(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("FILTER_IN_PLACE_OK", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_CANCEL() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FILTER_IN_PLACE_CANCEL");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_CANCEL(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_CANCEL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_TOGGLE() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("FILTER_IN_PLACE_TOGGLE");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_TOGGLE(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_TOGGLE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_BEGIN_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FILTER_IN_PLACE_BEGIN_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_BEGIN_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_BEGIN_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_OK_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FILTER_IN_PLACE_OK_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_OK_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_OK_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFILTER_IN_PLACE_CANCEL_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("FILTER_IN_PLACE_CANCEL_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFILTER_IN_PLACE_CANCEL_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("FILTER_IN_PLACE_CANCEL_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGRAPH_ELEMENT_CLICKED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("GRAPH_ELEMENT_CLICKED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGRAPH_ELEMENT_CLICKED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("GRAPH_ELEMENT_CLICKED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGRAPH_ELEMENT_CLICKED_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("GRAPH_ELEMENT_CLICKED_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGRAPH_ELEMENT_CLICKED_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("GRAPH_ELEMENT_CLICKED_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getLAST_IME_VALUE_UPDATED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("LAST_IME_VALUE_UPDATED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLAST_IME_VALUE_UPDATED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("LAST_IME_VALUE_UPDATED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getINBOX_PAYLOAD_INIT_COMPLETED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("INBOX_PAYLOAD_INIT_COMPLETED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINBOX_PAYLOAD_INIT_COMPLETED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("INBOX_PAYLOAD_INIT_COMPLETED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAPP_LAUNCH_INBOX() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("APP_LAUNCH_INBOX");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAPP_LAUNCH_INBOX(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("APP_LAUNCH_INBOX", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAPP_LAUNCH_TASKS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").get("APP_LAUNCH_TASKS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAPP_LAUNCH_TASKS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents").set("APP_LAUNCH_TASKS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWEB_CONTAINER_MESSAGE_RECEIVED() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
              .get("WEB_CONTAINER_MESSAGE_RECEIVED");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWEB_CONTAINER_MESSAGE_RECEIVED(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.StandardEvents")
          .set("WEB_CONTAINER_MESSAGE_RECEIVED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StandardEvents(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
