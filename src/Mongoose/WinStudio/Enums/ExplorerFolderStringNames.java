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

public class ExplorerFolderStringNames {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_FOLDER_ID_MASTER() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_FOLDER_ID_MASTER");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_FOLDER_ID_MASTER(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_FOLDER_ID_MASTER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_FOLDER_ID_PUBLIC() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_FOLDER_ID_PUBLIC");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_FOLDER_ID_PUBLIC(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_FOLDER_ID_PUBLIC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_FOLDER_ID_USERS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_FOLDER_ID_USERS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_FOLDER_ID_USERS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_FOLDER_ID_USERS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_FOLDER_ID_MYFOLDERS() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_FOLDER_ID_MYFOLDERS");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_FOLDER_ID_MYFOLDERS(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_FOLDER_ID_MYFOLDERS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_MASTER_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_MASTER_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_MASTER_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_MASTER_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_PUBLIC_FOLDERS_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_PUBLIC_FOLDERS_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_PUBLIC_FOLDERS_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_PUBLIC_FOLDERS_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_USER_FOLDERS_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_USER_FOLDERS_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_USER_FOLDERS_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_USER_FOLDERS_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_MY_FOLDERS_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_MY_FOLDERS_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_MY_FOLDERS_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_MY_FOLDERS_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_EXPLORER_CAPTION() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_EXPLORER_CAPTION");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_EXPLORER_CAPTION(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_EXPLORER_CAPTION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_AUTORUN_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_AUTORUN_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_AUTORUN_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_AUTORUN_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEXP_PRELOAD_STRING() {
    try {
      java.lang.String res =
          Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
              .get("EXP_PRELOAD_STRING");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEXP_PRELOAD_STRING(java.lang.String param) {
    try {
      Javonet.getType("Mongoose.WinStudio.Enums.ExplorerFolderStringNames")
          .set("EXP_PRELOAD_STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExplorerFolderStringNames() {
    try {
      javonetHandle = Javonet.New("Mongoose.WinStudio.Enums.ExplorerFolderStringNames");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExplorerFolderStringNames(NObject handle) {
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
