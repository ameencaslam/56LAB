import java.awt.*;
import java.awt.event.*;

class q20 extends Frame implements ActionListener {
    List itemList;     // List box
    TextField input;   // Text field for input
    Button addBtn, removeBtn; // Buttons

    // Constructor
    q20() {
        setTitle("AWT List Box Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Create Components
        itemList = new List(5);  // List box with max 5 visible items
        input = new TextField(20);
        addBtn = new Button("Add");
        removeBtn = new Button("Remove");

        // Add Components to Frame
        add(new Label("Enter Item:"));
        add(input);
        add(addBtn);
        add(removeBtn);
        add(itemList);

        // Add Action Listeners
        addBtn.addActionListener(this);
        removeBtn.addActionListener(this);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String text = input.getText();
            if (!text.isEmpty()) {
                itemList.add(text);
                input.setText(""); // Clear input
            }
        } else if (e.getSource() == removeBtn) {
            int selectedIndex = itemList.getSelectedIndex();
            if (selectedIndex != -1) {
                itemList.remove(selectedIndex);
            }
        }
    }

    public static void main(String[] args) {
        new q20();
    }
}
