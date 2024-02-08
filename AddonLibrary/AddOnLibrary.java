
import android.content.DialogInterface;
import android.os.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;

public class AddOnLibrary {

   // private WidgetInfoExtractor widgetInfoExtractor = new WidgetInfoExtractor();

    public static void logDataInEntryPointByActivityEventHandler(Activity activity, String packageName,
                                         String activityName, String methodName,
                                         List<Widget> widgetList) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append(getActivityEventHandlerSignatureForEntryPoint(activityName, packageName, methodName));
            if (activity != null) {
                fwriter.append("this\n");
                fwriter.append(activity.hashCode() + "\n1\n");
            }
            int index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void logDataInExitPointByActivityEventHandler(Activity activity, String packageName, String activitName,
                                       String methodName, List<Widget> widgetList, int exitPoint, String returnBlock) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append(getActivityEventHandlerSignatureForExitPoint(activitName, packageName, methodName, exitPoint));
            if (activity != null) {
                fwriter.append("this\n");
                fwriter.append(activity.hashCode() + "\n1\n");
            }
            int index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            // if (returnBlock != "")
            // fwriter.append(returnBlock);
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void logDataInEntryPointByDialogEventHandler(Activity activity, String packageName, String activityName,
                                          DialogInterface dialog, String subClassName,String methodName, List<Widget> widgetList,
                                          List<Widget> tmpWidgetList) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append(getDialogEventHandlerSignatureForEntryPoint(packageName, activityName, subClassName, methodName));
            if (dialog != null) {
                fwriter.append("this\n");
                fwriter.append(dialog.hashCode() + "\n1\n");
            }
            int index = 0;
            for (Widget innerWiddgetItem : tmpWidgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(innerWiddgetItem);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            fwriter.append(packageName + "." + activityName + ".this\n");
            fwriter.append(activity.hashCode() + "\n1\n");
            index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania", packageName + "." + activityName);
                fwriter.append(content);
                index++;
            }
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void logDataInExitPointByDialogEventHandler(Activity activity, String packageName, String activityName,
                                         DialogInterface dialog, String subClassName, String methodName, List<Widget> widgetList,
                                         List<Widget> tmpWidgetList, int exitPoint, String returnBlock) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append(getDialogEventHandlerSignatureForExitPoint(packageName, activityName, subClassName, methodName, exitPoint));
            if (dialog != null) {
                fwriter.append("this\n");
                fwriter.append(dialog.hashCode() + "\n1\n");
            }
            int index = 0;
            for (Widget innerWidgetItem : tmpWidgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(innerWidgetItem);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            fwriter.append(packageName + "." + activityName + ".this\n");
            fwriter.append(activity.hashCode() + "\n1\n");
            index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania", packageName + "." + activityName);
                fwriter.append(content);
                index++;
            }
            // if (returnBlock != "")
            // fwriter.append(returnBlock);
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void constructor(Activity activity, String packageName, String activityName, List<Widget> widgetList,int exitPoint) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append("\n" + packageName + "." + activityName + "." + activityName + "():::ENTER\n");
            fwriter.append("\n" + packageName + "." + activityName + "." + activityName + "():::EXIT" + exitPoint + "\n");
            fwriter.append("this\n");
            fwriter.append(activity.hashCode() + "\n1\n");
            int index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void captureInnerClass(Activity activity, String activityName, String packageName,
                                  String innerClassName, DialogInterface dialog, List<Widget> widgetList,
                                  List<Widget> tmpWidgetList, int exitPoint) {
        File filePath = new File(Environment.getExternalStorageDirectory(), "MyData/" + packageName);
        if (!filePath.exists())
            filePath.mkdirs();
        File traceFile = new File(filePath, "_traceData.txt");
        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(traceFile, true);
            fwriter.append("\n" + packageName + "." + activityName + "$" + innerClassName  +
                    "." + innerClassName  + "(" + packageName + "." + activityName + "):::ENTER\n");
            // fwriter.append("ppt-type enter\n");
            if (activity != null) {
                fwriter.append(packageName + "." + activityName + ".this\n");
                fwriter.append(activity.hashCode() + "\n1\n");
            }
            int index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania", packageName + "." + activityName);
                fwriter.append(content);
                index++;
            }
            fwriter.append("\n" + packageName + "." + activityName + "$" + innerClassName +  "." +
                    innerClassName  + "(" + packageName + "." + activityName + "):::EXIT" + exitPoint + "\n");
            // fwriter.append("ppt-type subexit\n");
            index = 0;
            if (dialog != null) {
                fwriter.append("this\n");
                fwriter.append(dialog.hashCode() + "\n1\n");
            }
            for (Widget innerWidgetItem : tmpWidgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(innerWidgetItem);
                content = content.replaceAll("Ania.", "");
                fwriter.append(content);
                index++;
            }
            fwriter.append(packageName + "." + activityName + ".this\n");
            fwriter.append(activity.hashCode() + "\n1\n");
            index = 0;
            for (Widget widget : widgetList) {
                String content = WidgetInfoExtractor.captureWidgetInfo(widget);
                content = content.replaceAll("Ania", packageName + "." + activityName);
                fwriter.append(content);
                index++;
            }
            fwriter.flush();
            fwriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static String getActivityEventHandlerSignatureForEntryPoint(String activityName, String packageName, String methodName) {
        String block = "\n" + packageName + "." + activityName + "." + methodName + "():::ENTER\n";
        return block;
    }

    private static String getActivityEventHandlerSignatureForExitPoint(String activityName, String packageName, String methodName, int exitPoint) {
        return "\n" + packageName + "." + activityName + "." + methodName + "():::EXIT" + exitPoint + "\n";
    }

    private static String getDialogEventHandlerSignatureForEntryPoint(String packageName, String mainClassName, String subClassName, String methodName) {
        String block = "";
    
        block = "\n" + packageName + "." + mainClassName + "$" + subClassName + "." + methodName + "():::ENTER\n";
    
        return block;
    }

    private static String getDialogEventHandlerSignatureForExitPoint(String packageName, String mainClassName, String subClassName, String methodName, int exitPoint) {
        String block = "";
        
        block = "\n" + packageName + "." + mainClassName + "$" + subClassName + "." + methodName +"():::EXIT" + exitPoint + "\n";
        
        return block;
    }

    public static String getReturnBlock(String returnType, Object object) {
        String block = "";
        if (returnType == "int" || returnType == "float" || returnType == "boolean" || returnType == "char" || returnType == "Integer") {
            block += "return\n";
            block += object.toString() + "\n";
            block += "1\n";
        } else if (returnType == "String") {
            block += "return\n";
            block += object.hashCode() + "\n";
            block += "1\n";
            block += "return.toString\n";
            block += object.toString() + "\n";
            block += "1\n";
        } else {
        }
        return block;
    }

    public static String getReturnBlock(String returnType, List<?> list) {
        String block = "";
        List<Integer> hashCodes = new ArrayList<>();
        if (returnType != "void") {
            block += "return\n";
            block += list.hashCode() + "\n";
            block += "1\n";
            block += "return[..]\n";
            block += "[";
            for (Object item : list) block += item + ",";
            if (block.contains(","))
                block = block.substring(0, block.lastIndexOf(','));
            block += "]\n";
            block += "1\n";
            block += "return[..].getClass().getName()\n";
            if (list.size() > 0)
                block += "[" + list.get(0).getClass().getName() + "]\n";
            else
                block += "[]\n";
            block += "1\n";
            block += "return.getClass().getName()\n";
            block += "\"" + list.getClass().getName() + "\"\n";
            block += "1\n";
        }
        return block;
    }
}

