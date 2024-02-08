
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Switch;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WidgetInfoExtractor {

    public static String captureWidgetInfo(Widget widget) {
        
        String result = "";
        ViewVisitor visitor = new ViewVisitor();
        switch(widget.getWidgetType()) {
            case "ListView":
                result = visitor.visit((ListView) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "EditText":
                result = visitor.visit((EditText) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "TextView":
                result = visitor.visit((TextView) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "CheckBox":
                result = visitor.visit((CheckBox) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "FloatingActionButton":
                result = visitor.visit((FloatingActionButton) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "Button":
                result = visitor.visit((Button) widget.getView(), widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "ImageButton":
                result = visitor.visit((ImageButton) widget.getView(),widget.getViewName(),widget.getWidgetDatabaseId());
                break; 
            case "Switch":
                result = visitor.visit((Switch) widget.getView(),widget.getViewName(),widget.getWidgetDatabaseId());
                break;
            case "MainMenuItem" :
                result = visitor.visit(widget.getMenuItem(),widget.getViewName(),widget.getWidgetDatabaseId());
                break;               
        }
        return result;
    }
}

