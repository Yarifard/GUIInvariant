
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Switch;
import android.view.MenuItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ViewVisitor {

    public String visit(EditText view, String viewName,int id) {
        String result = "";
        if (view != null) {
            
            result += "Ania.this.EditText_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.EditText_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";
            
            result += "Ania.this.EditText_" + id + "_" + viewName + "_editable\n";
            if (view.isInEditMode())
                result += "true\n1\n";
            else
                result += "false\n1\n";
            
            result += "Ania.this.EditText_" + id + "_" + viewName + "_text\n";
            result += Math.abs(view.getText().hashCode()) + "\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_text.toString\n";
            result += "\"" + view.getText() + "\"\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_length\n";
            result += view.length() + "\n1\n";
        } else {
        	result += "Ania.this.EditText_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_editable\n";
            result += "false\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_text\n";
            result += "null\n1\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_text.toString\n";
            result += "nonsensical\n2\n";
            result += "Ania.this.EditText_" + id + "_" + viewName + "_length\n";
            result += "0\n1\n";
        }
        return result;
    }

    public String visit(TextView view, String viewName,int id) {
        String result = "";
        if (view != null) {
            result += "Ania.this.TextView_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.TextView_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";

            result += "Ania.this.TextView_" + id + "_" + viewName + "_text\n";
            result += Math.abs(view.getText().hashCode()) + "\n1\n";

            result += "Ania.this.TextView_" + id + "_" + viewName + "_text.toString\n";
            result += "\"" + view.getText() + "\"\n1\n";

//            result += "Ania.this.TextView_" + id + "_" + viewName + "_length\n";
//            result += view.length() + "\n1\n";
        } else {
            
            result += "Ania.this.TextView_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";

            result += "Ania.this.TextView_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
                    
            result += "Ania.this.TextView_" + id + "_" + viewName + "_text\n";
            result += "null\n1\n";
            
            result += "Ania.this.TextView_" + id + "_" + viewName + "_text.toString\n";
            result += "nonsensical\n2\n";
//            result += "Ania.this.TextView_" + id + "_" + viewName + "_length\n";
//            result += "0\n1\n";
        }
        return result;
    }

    public String visit(CheckBox view, String viewName,int id) {
        String result = "";
        if (view != null) {
            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";

            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_checked\n";
            if (view.isChecked())
                result += "true\n1\n";
            else
                result += "false\n1\n";

//            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_text\n";
//            result += Math.abs(view.getText().hashCode()) + "\n1\n";
//            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_text.toString\n";
//            result += "\"" + view.getText() + "\"\n1\n";
        } else {
            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_checked\n";
            result += "false\n1\n";
//            result += "Ania.this.CheckBox_" + id + "_" + viewName + "_text.toString\n";
//            result += "\"nonsensical\"" + "\n2\n";
        }
        return result;
    }

    public String visit(ListView view, String viewName,int id) {
        String result = "";
        if (view != null) {
            result += "Ania.this.ListView_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.ListView_" + id + "_" + viewName + "_size\n";
            if (view.getAdapter() != null)
                result += view.getAdapter().getCount() + "\n1\n";
            else
                result += "0\n1\n";
        } else {
            result += "Ania.this.ListView_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.ListView_" + id + "_" + viewName + "_size\n";
            result += "0\n1\n";
        }
        return result;
    }

    public String visit(FloatingActionButton view, String viewName,int id) {
        String result = "";
        if (view != null) {
            result += "Ania.this.FloatingActionButton_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.FloatingActionButton_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";
        } else {
            result += "Ania.this.FloatingActionButton_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.FloatingActionButton_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
        }
        return result;
    }

    public String visit(Button view, String viewName,int id) {
        String result = "";
        if (view != null) {
            result += "Ania.this.Button_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.Button_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";

            result += "Ania.this.Button_" + id + "_" + viewName + "_text\n";
            result += Math.abs(view.getText().hashCode()) + "\n1\n";

            result += "Ania.this.Button_" + id + "_" + viewName + "_text.toString\n";
            result += "\"" + view.getText() + "\"\n1\n";

        } else {
            result += "Ania.this.Button_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.Button_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
            result += "Ania.this.Button_" + id + "_" + viewName + "_text\n";
            result += "null\n1\n";
            result += "Ania.this.Button_" + id + "_" + viewName + "_text.toString\n";
            result += "nonsensical\n2\n";
        }
        return result;
    }

    public String visit(ImageButton view, String viewName, int id) {
        String result = "";
        if (view != null) {
             result += "Ania.this.ImageButton_" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.ImageButton_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";
        } else {
            result += "Ania.this.ImageButton_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.ImageButton_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
        }
        return result;
    }

    public String visit(Switch view, String viewName, int id) {
        String result = "";
        if (view != null) {
             result += "Ania.this.Switch" + id + "_" + viewName + "_visibility\n";
            if(view.getVisibility() == View.VISIBLE)
            	result += "true\n1\n";
            else
            	result += "false\n1\n";

            result += "Ania.this.Switch_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";

            result += "Ania.this.Switch_" + id + "_" + viewName + "_checked\n";
            if(view.isChecked())
            	result += "true\n1\n";
            else
                result += "false\n1\n";
        } else {
            result += "Ania.this.Switch_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.Switch_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
            result += "Ania.this.Switch_" + id + "_" + viewName + "_checked\n";
            result += "false\n1\n";
        }
        return result;
    }

    public String visit(MenuItem view, String viewName, int id) {
        String result = "";
        if (view != null) {
             result += "Ania.this.MainMenuItem_" + id + "_" + viewName + "_visibility\n";
            if(view.isVisible())
                result += "true\n1\n";
            else
                result += "false\n1\n";

            result += "Ania.this.MainMenuItem_" + id + "_" + viewName + "_enable\n";
            if (view.isEnabled())
                result += "true\n1\n";
            else
                result += "false\n1\n";
        } else {
            result += "Ania.this.MainMenuItem_" + id + "_" + viewName + "_visibility\n";
            result += "false\n1\n";
            result += "Ania.this.MainMenuItem_" + id + "_" + viewName + "_enable\n";
            result += "false\n1\n";
        }
        return result;
    }
}

