
import java.awt.Applet;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Panel;
import java.awt.RadioButton;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxAndRadioButtonApplet extends Applet {

    // Checkboxes
    Checkbox checkbox1, checkbox2, checkbox3;

    // CheckboxGroup for radio buttons
    CheckboxGroup radioGroup;

    // Radio buttons
    Checkbox radioButton1, radioButton2, RadioButton3;

    // Textarea to display the checked options
    TextArea textarea;

    public void init() {
        // Set layout
        setLayout(new BorderLayout());

        // Panel for checkboxes
        Panel checkboxPanel = new Panel();
        checkboxPanel.setLayout(new GridLayout(3, 1));

        // Create checkboxes
        checkbox1 = new Checkbox("1");
        checkbox2 = new Checkbox("2");
        checkbox3 = new Checkbox("3");

        // Add item listeners to checkboxes
        checkbox1.addItemListener(new CheckBoxListener());
        checkbox2.addItemListener(new CheckBoxListener());
        checkbox3.addItemListener(new CheckBoxListener());

        // Add checkboxes to the panel
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        checkboxPanel.add(checkbox3);

        // Panel for radio buttons
        Panel radioPanel = new Panel();
        radioPanel.setLayout(new GridLayout(3, 1));

        // Create CheckboxGroup for radio buttons
        radioGroup = new CheckboxGroup();

        // Create radio buttons
        radioButton1 = new Checkbox("1", radioGroup, true);
        radioButton2 = new Checkbox("2", radioGroup, false);
        RadioButton3 = new Checkbox("3", radioGroup, false);

        // Add item listeners to radio buttons
        radioButton1.addItemListener(new RadioButtonListener());
        radioButton2.addItemListener(new RadioButtonListener());
        RadioButton3.addItemListener(new RadioButtonListener());

        // Add radio buttons to the panel
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        radioPanel.add(RadioButton3);

        // Textarea to display the checked options
        textarea = new TextArea(10, 20);

        // Add components to the applet
        add(checkboxPanel, BorderLayout.WEST);
        add(radioPanel, BorderLayout.EAST);
        add(textarea, BorderLayout.SOUTH);
    }

    // ItemListener for checkboxes
    class CheckBoxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            String checkedOptions = "";
            if (checkbox1.getState()) {
                checkedOptions += "1 ";
            }
            if (checkbox2.getState()) {
                checkedOptions += "2 ";
            }
            if (checkbox3.getState()) {
                checkedOptions += "3 ";
            }
            textarea.append("Checked Checkboxes: " + checkedOptions + "\n");
        }
    }

    // ItemListener for radio buttons
    class RadioButtonListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Checkbox selected = radioGroup.getSelectedCheckbox();
            if (selected == radioButton1) {
                textarea.append("Selected Radio Button: 1\n");
            } else if (selected == radioButton2) {
                textarea.append("Selected Radio Button: 2\n");
            } else if (selected == RadioButton3) {
                textarea.append("Selected Radio Button: 3\n");
            }
        }
    }
}