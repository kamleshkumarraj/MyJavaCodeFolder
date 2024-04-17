package JAVA;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class revision implements ActionListener {
    JFrame frame;
    JLabel name_lbl1, age_lbl2, info_label, password_Label, gender_Label, male_Label, female_Label, fruit_Label;
    JTextField ent1, ent2;
    JButton btn1, btn2, btn3, btn4;

    static JTextArea box;
    JPasswordField password;
    public static JRadioButton male_Button, female_Button;
    public static JCheckBox mango_Box, apple_Box, grapes_Box, papaya_Box, orange_Box, banana_Box, coconut_Box,watermelon_Box, cucumber_Box, blackberry_Box, lichi_Box, carrot_Box;
    JTabbedPane pane1, pane2, pane3;
    int row = -1;
    int row1 = -1;
    Container c, c1;
    JPopupMenu popupmenu;
    JMenuItem i1, i2, i3;
    Font font;
    JDialog frame2;

    // this code only for creating main window;
    revision() {
        frame = new JFrame();
        frame.setTitle("Revision class ");
        frame.setBounds(100, 10, 1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);

        font = new Font("Times new Roman", Font.BOLD, 24);

        // tabbedPane();
        pop();
        table();

        // formwindow();
        frame.setVisible(true);

    }

    // this code is only for creating popup - Menu.
    void pop() {
        popupmenu = new JPopupMenu();
        i1 = new JMenuItem("Registration Form");
        i2 = new JMenuItem("Edit");
        i3 = new JMenuItem("View");
        popupmenu.add(i1);
        JSeparator s = new JSeparator();
        popupmenu.add(s);
        popupmenu.add(i2);
        popupmenu.add(i3);
        i1.setFont(font);
        i2.setFont(font);
        i3.setFont(font);
        frame.add(popupmenu);
        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupmenu.show(c, x, y);
                }
            }
        });
        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                formwindow();
            }
        });

    }

    // popup on second window
    void secondpopup() {
        popupmenu = new JPopupMenu();
        i1 = new JMenuItem("Table Window");
        i2 = new JMenuItem("Edit");
        i3 = new JMenuItem("View");
        popupmenu.add(i1);
        JSeparator s = new JSeparator();
        popupmenu.add(s);
        popupmenu.add(i2);
        popupmenu.add(i3);
        i1.setFont(font);
        i2.setFont(font);
        i3.setFont(font);
        frame2.add(popupmenu);
        c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupmenu.show(c1, x, y);
                }
            }
        });
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                // formwindow();
                new revision();
            }
        });

    }

    // this code is make for other window
    void formwindow() {
        frame2 = new JDialog();
        frame2.setTitle("Revision class ");
        frame2.setBounds(100, 10, 1200, 800);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c1 = frame2.getContentPane();
        c1.setBackground(Color.cyan);
        c1.setLayout(null);
        label();
        radio();
        fruitItem();
        entrybox();
        button();
        textBox();
        secondpopup();
        frame2.setVisible(true);

    }

    // this code is only for create all label ;
    void label() {

        name_lbl1 = new JLabel("Enter Your Name : ");
        name_lbl1.setBounds(50, 30, 250, 50);
        name_lbl1.setFont(font);
        c1.add(name_lbl1);
        name_lbl1.setForeground(Color.BLUE);

        age_lbl2 = new JLabel("Enter Your Age : ");
        age_lbl2.setBounds(50, 80, 250, 50);
        age_lbl2.setFont(font);
        age_lbl2.setForeground(Color.BLUE);
        c1.add(age_lbl2);

        info_label = new JLabel("See Here all output :---  ");
        info_label.setBounds(700, 20, 300, 50);
        info_label.setFont(font);
        info_label.setForeground(Color.BLUE);
        c1.add(info_label);

        password_Label = new JLabel("Enter your password : ");
        password_Label.setBounds(50, 130, 300, 50);
        password_Label.setFont(font);
        password_Label.setForeground(Color.BLUE);
        c1.add(password_Label);

        gender_Label = new JLabel("Choose your gender : ");
        gender_Label.setBounds(50, 200, 300, 50);
        gender_Label.setFont(font);
        gender_Label.setForeground(Color.BLUE);
        c1.add(gender_Label);

        fruit_Label = new JLabel("Please Select fruit for your requirement : ");
        fruit_Label.setBounds(50, 270, 500, 50);
        fruit_Label.setFont(font);
        fruit_Label.setForeground(Color.blue);
        c1.add(fruit_Label);
    }

    // this code is only work on table;
    void table() {
        String head[] = { "Id", "Name ", "Age", "Roll number", "Total Marks", "Dob" };
        String data[][] = { { "001", "Kamlesh Kumar", "20", "T22EJICS064", "400", "06-05-2003" },
                { "002", "Pintu Kumar", "19", "T22EJICS065", "432", "02-06-2001" },
                { "003", "Rahul Kumar", "23", "T22EJICS066", "213", "03-05-2002" },
                { "004", "Manoj Kumar", "18", "T22EJICS067", "244", "04-06-2003" },
                { "005", "Sanoj Kumar", "17", "T22EJICS068", "445", "05-07-2004" },
                { "006", "Ankit Kumar", "16", "T22EJICS069", "432", "06-08-2001" },
                { "007", "Kishan Kumar", "18", "T22EJICS070", "345", "07-09-2005" },
                { "008", "Raju Kumar", "27", "T22EJICS071", "367", "08-10-2006" },
                { "009", "Bittu Kumar", "19", "T22EJICS072", "428", "09-02-2001" },
                { "010", "Alok Kumar", "17", "T22EJICS073", "356", "10-03-2005" },
                { "011", "Chandan Kumar", "16", "T22EJICS074", "378", "11-04-2002" },
                { "012", "Rajeev Kumar", "20", "T22EJICS075", "478", "12-05-2001" },
                { "013", "Pankaj Kumar", "21", "T22EJICS076", "498", "13-06-2004" },
                { "014", "Shivam Kumar", "22", "T22EJICS077", "412", "23-07-2003" },
                { "015", "Raviranjan Kumar", "25", "T22EJICS078", "465", "21-08-2002" },
                { "016", "Guddu Kumar", "19", "T22EJICS079", "454", "18-09-2004" },
                { "017", "Nitish Kumar", "17", "T22EJICS080", "421", "28-01-2005" },
                { "018", "Jitendra Kumar", "18", "T22EJICS081", "490", "19-12-2003" },
                { "019", "Niraj Kumar", "21", "T22EJICS082", "423", "20-11-2006" },
                { "020", "Dheeraj Kumar", "23", "T22EJICS083", "414", "12-06-2007" } };
        String mob[] = { "8294882976", "8603416388", "7896541236", "8745963217", "7857896541", "7852369874",
                "1234569874", "7894561237", "7894569874", "1236547892", "2003698741", "7896541236", "78965478965",
                "8965478978", "1254125412", "7739037852", "8292428625", "6203582892", "3369987545", "9953235395" };

        DefaultTableModel mod1 = new DefaultTableModel(data, head);
        JPanel p1 = new JPanel();
        p1.setBounds(20, 50, 800, 300);
        p1.setBackground(Color.red);
        p1.setLayout(new GridLayout());
        JTable table1 = new JTable(mod1);

        table1.setForeground(Color.blue);
        JScrollPane pane = new JScrollPane(table1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mod1.addColumn("Mobile Number", mob);

        p1.add(pane);
        c.add(p1);

        // now we work on all Attributes on the table.
        JLabel id_Label, name_Label, age_Label, roll_Label, marks_Label, DOB_Label;

        id_Label = new JLabel("Enter Id : ");
        id_Label.setBounds(20, 400, 150, 50);
        id_Label.setFont(font);
        id_Label.setForeground(Color.BLUE);
        c.add(id_Label);

        name_Label = new JLabel("Enter Name : ");
        name_Label.setBounds(170, 400, 150, 50);
        name_Label.setFont(font);
        name_Label.setForeground(Color.BLUE);
        c.add(name_Label);

        age_Label = new JLabel("Enter Age : ");
        age_Label.setBounds(350, 400, 150, 50);
        age_Label.setFont(font);
        age_Label.setForeground(Color.BLUE);
        c.add(age_Label);

        roll_Label = new JLabel("Enter Roll Number : ");
        roll_Label.setBounds(500, 400, 250, 50);
        roll_Label.setFont(font);
        roll_Label.setForeground(Color.BLUE);
        c.add(roll_Label);

        marks_Label = new JLabel("Enter Total Marks : ");
        marks_Label.setBounds(750, 400, 250, 50);
        marks_Label.setFont(font);
        marks_Label.setForeground(Color.BLUE);
        c.add(marks_Label);

        DOB_Label = new JLabel("Enter DOB : ");
        DOB_Label.setBounds(980, 400, 250, 50);
        DOB_Label.setFont(font);
        DOB_Label.setForeground(Color.BLUE);
        c.add(DOB_Label);

        JTextField id_entry, name_entry, age_entry, roll_entry, marks_entry, dob_entry;

        id_entry = new JTextField();
        id_entry.setBounds(20, 450, 100, 35);
        c.add(id_entry);
        id_entry.setBackground(Color.lightGray);
        id_entry.setFont(font);

        name_entry = new JTextField();
        name_entry.setBounds(140, 450, 180, 35);
        c.add(name_entry);
        name_entry.setBackground(Color.lightGray);
        name_entry.setFont(font);

        age_entry = new JTextField();
        age_entry.setBounds(355, 450, 100, 35);
        c.add(age_entry);
        age_entry.setBackground(Color.lightGray);
        age_entry.setFont(font);

        roll_entry = new JTextField();
        roll_entry.setBounds(490, 450, 230, 35);
        c.add(roll_entry);
        roll_entry.setBackground(Color.lightGray);
        roll_entry.setFont(font);

        marks_entry = new JTextField();
        marks_entry.setBounds(780, 450, 130, 35);
        c.add(marks_entry);
        marks_entry.setBackground(Color.lightGray);
        marks_entry.setFont(font);

        dob_entry = new JTextField();
        dob_entry.setBounds(950, 450, 200, 35);
        c.add(dob_entry);
        dob_entry.setBackground(Color.lightGray);
        dob_entry.setFont(font);

        JButton insert_Button, delete_Button, update_Button;

        insert_Button = new JButton("Click for Insert Row");
        insert_Button.setBounds(50, 500, 250, 50);
        insert_Button.setFont(font);
        insert_Button.setBackground(Color.green);
        c.add(insert_Button);

        update_Button = new JButton("Click for Update Row");
        update_Button.setBounds(380, 500, 300, 50);
        update_Button.setFont(font);
        update_Button.setBackground(Color.magenta);
        c.add(update_Button);

        delete_Button = new JButton("Click for Delete Row");
        delete_Button.setBounds(750, 500, 300, 50);
        delete_Button.setFont(font);
        delete_Button.setBackground(Color.YELLOW);
        c.add(delete_Button);

        // this code is give command on insert button.
        insert_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id_entry.getText().isEmpty() || name_entry.getText().isEmpty() || age_entry.getText().isEmpty()
                        || marks_entry.getText().isEmpty() || roll_entry.getText().isEmpty()
                        || dob_entry.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "please Fill all box then insert ", "Warning Message",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    String id = id_entry.getText();
                    String name = name_entry.getText();
                    String age = age_entry.getText();
                    String roll = roll_entry.getText();
                    String marks = marks_entry.getText();
                    String dob = dob_entry.getText();

                    String row[] = { id, name, age, roll, marks, dob };
                    mod1.addRow(row);
                    id_entry.setText("");
                    name_entry.setText("");
                    age_entry.setText("");
                    roll_entry.setText("");
                    marks_entry.setText("");
                    dob_entry.setText("");
                }

            }
        });

        // this code is give command on update button.
        table1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                row = table1.getSelectedRow();
                String id = mod1.getValueAt(row, 0).toString();
                String name = mod1.getValueAt(row, 1).toString();
                String age = mod1.getValueAt(row, 2).toString();
                String roll = mod1.getValueAt(row, 3).toString();
                String marks = mod1.getValueAt(row, 4).toString();
                String dob = mod1.getValueAt(row, 5).toString();

                id_entry.setText(id);
                name_entry.setText(name);
                age_entry.setText(age);
                roll_entry.setText(roll);
                marks_entry.setText(marks);
                dob_entry.setText(dob);

            }
        });

        update_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (row == -1) {
                    JOptionPane.showMessageDialog(frame, "Please select a row then you update this row ",
                            "Waring Message", JOptionPane.ERROR_MESSAGE);
                } else if (id_entry.getText().isEmpty() || name_entry.getText().isEmpty()
                        || age_entry.getText().isEmpty() || marks_entry.getText().isEmpty()
                        || roll_entry.getText().isEmpty()
                        || dob_entry.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Without select you can't update any row ! ",
                            "Warning Message", JOptionPane.ERROR_MESSAGE);
                }

                else {
                    String id = id_entry.getText();
                    String name = name_entry.getText();
                    String age = age_entry.getText();
                    String roll = roll_entry.getText();
                    String marks = marks_entry.getText();
                    String dob = dob_entry.getText();

                    mod1.setValueAt(id, row, 0);
                    mod1.setValueAt(name, row, 1);
                    mod1.setValueAt(age, row, 2);
                    mod1.setValueAt(roll, row, 3);
                    mod1.setValueAt(marks, row, 4);
                    mod1.setValueAt(dob, row, 5);

                    id_entry.setText("");
                    name_entry.setText("");
                    age_entry.setText("");
                    roll_entry.setText("");
                    marks_entry.setText("");
                    dob_entry.setText("");
                    row = -1;

                }

            }
        });

        // this code is give on command delete button.

        delete_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                row1 = table1.getSelectedRow();
                if (row1 == -1) {
                    JOptionPane.showMessageDialog(frame, "Without select you can't delete any row ! ", "Waring Message",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    int k = JOptionPane.showConfirmDialog(frame, "Are You Sure For delete this row ",
                            "Confirmation Box ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (k == JOptionPane.YES_OPTION) {
                        mod1.removeRow(row1);
                    }

                    id_entry.setText("");
                    name_entry.setText("");
                    age_entry.setText("");
                    roll_entry.setText("");
                    marks_entry.setText("");
                    dob_entry.setText("");
                    row1 = -1;
                }

            }
        });
    }

    // this code is only for creating a new tabbed pane;
    void tabbedPane() {
        pane1 = new JTabbedPane();
        pane1.setBounds(10, 10, 800, 300);
        pane1.setBackground(Color.green);
        JPanel p1 = new JPanel();
        // p1.setBounds(10, 20, 100, 200);
        p1.setLayout(null);
        pane1.add("Home", p1);
        p1.setBackground(Color.red);
        c.add(pane1);
        JLabel l = new JLabel("Hii my Name is : ");
        l.setBounds(20, 30, 200, 50);
        p1.add(l);

    }

    // this code is only for creating checkbox means fruit item;
    void fruitItem() {
        mango_Box = new JCheckBox("Mango");
        mango_Box.setBounds(50, 320, 180, 60);
        mango_Box.setFont(font);
        mango_Box.setForeground(Color.red);
        mango_Box.setBackground(Color.blue);
        c1.add(mango_Box);

        banana_Box = new JCheckBox("Banana");
        banana_Box.setBounds(240, 320, 180, 60);
        banana_Box.setFont(font);
        banana_Box.setForeground(Color.blue);
        banana_Box.setBackground(Color.magenta);
        c1.add(banana_Box);

        grapes_Box = new JCheckBox("Grapes");
        grapes_Box.setBounds(50, 390, 180, 60);
        grapes_Box.setFont(font);
        grapes_Box.setForeground(Color.black);
        grapes_Box.setBackground(Color.red);
        c1.add(grapes_Box);

        orange_Box = new JCheckBox("Orange");
        orange_Box.setBounds(240, 390, 180, 60);
        orange_Box.setFont(font);
        orange_Box.setForeground(Color.blue);
        orange_Box.setBackground(Color.green);
        c1.add(orange_Box);

        apple_Box = new JCheckBox("Apple");
        apple_Box.setBounds(50, 460, 180, 60);
        apple_Box.setFont(font);
        apple_Box.setForeground(Color.black);
        apple_Box.setBackground(Color.orange);
        c1.add(apple_Box);

        papaya_Box = new JCheckBox("Papaya");
        papaya_Box.setBounds(240, 460, 180, 60);
        papaya_Box.setFont(font);
        papaya_Box.setForeground(Color.blue);
        papaya_Box.setBackground(Color.pink);
        c1.add(papaya_Box);

        coconut_Box = new JCheckBox("Coconut");
        coconut_Box.setBounds(50, 530, 180, 60);
        coconut_Box.setFont(font);
        coconut_Box.setForeground(Color.black);
        coconut_Box.setBackground(Color.yellow);
        c1.add(coconut_Box);

        lichi_Box = new JCheckBox("Lichi");
        lichi_Box.setBounds(240, 530, 180, 60);
        lichi_Box.setFont(font);
        lichi_Box.setForeground(Color.blue);
        lichi_Box.setBackground(Color.gray);
        c1.add(lichi_Box);

        blackberry_Box = new JCheckBox("Black-berry");
        blackberry_Box.setBounds(50, 600, 180, 60);
        blackberry_Box.setFont(font);
        blackberry_Box.setForeground(Color.black);
        blackberry_Box.setBackground(Color.getHSBColor(50, 100, 30));
        c1.add(blackberry_Box);

        watermelon_Box = new JCheckBox("Watermelon");
        watermelon_Box.setBounds(240, 600, 180, 60);
        watermelon_Box.setFont(font);
        watermelon_Box.setForeground(Color.blue);
        watermelon_Box.setBackground(Color.getHSBColor(158, 166, 200));
        c1.add(watermelon_Box);

        mango_Box.addItemListener(new applyItemListener());
        banana_Box.addItemListener(new applyItemListener());
        grapes_Box.addItemListener(new applyItemListener());
        orange_Box.addItemListener(new applyItemListener());
        apple_Box.addItemListener(new applyItemListener());
        papaya_Box.addItemListener(new applyItemListener());
        coconut_Box.addItemListener(new applyItemListener());
        watermelon_Box.addItemListener(new applyItemListener());
        blackberry_Box.addItemListener(new applyItemListener());
        lichi_Box.addItemListener(new applyItemListener());

    }

    // this code is only for create radio Button;
    void radio() {
        ButtonGroup grp = new ButtonGroup();
        male_Button = new JRadioButton("Male");
        male_Button.setBounds(300, 200, 100, 40);
        male_Button.setBackground(Color.cyan);
        male_Button.setFont(font);
        c1.add(male_Button);

        female_Button = new JRadioButton("Female");
        female_Button.setBounds(420, 200, 100, 40);
        female_Button.setBackground(Color.cyan);
        female_Button.setFont(font);
        c1.add(female_Button);

        grp.add(male_Button);
        grp.add(female_Button);

        male_Button.addItemListener(new applyItemListener());
        female_Button.addItemListener(new applyItemListener());

    }

    // this code is only for create entry box
    void entrybox() {
        ent1 = new JTextField();
        ent1.setBounds(320, 40, 200, 40);
        ent1.setFont(font);
        ent1.setBackground(Color.gray);
        c1.add(ent1);

        ent2 = new JTextField();
        ent2.setBounds(320, 90, 200, 40);
        ent2.setFont(font);
        ent2.setBackground(Color.gray);
        c1.add(ent2);

        password = new JPasswordField();
        password.setBounds(320, 140, 200, 40);
        password.setFont(font);
        password.setBackground(Color.gray);
        password.setEchoChar('*');
        c1.add(password);
    }

    // this code is only for creating all button
    void button() {
        btn1 = new JButton("Submit");
        btn1.setBounds(80, 700, 150, 50);
        c1.add(btn1);
        btn1.setForeground(Color.red);
        btn1.setFont(font);
        btn1.addActionListener(this);

        btn2 = new JButton("Click-1");
        btn2.setBounds(280, 700, 150, 50);
        c1.add(btn2);
        btn2.setForeground(Color.red);
        btn2.setFont(font);
        btn2.addActionListener(this);

        btn3 = new JButton("Fruit Checker");
        btn3.setBounds(480, 700, 200, 50);
        c1.add(btn3);
        btn3.setForeground(Color.red);
        btn3.setFont(font);
        btn3.addActionListener(this);

        btn4 = new JButton("Click-3");
        btn4.setBounds(750, 700, 150, 50);
        c1.add(btn4);
        btn4.setForeground(Color.red);
        btn4.setFont(font);
        btn4.addActionListener(this);
    }

    // this code is only for create a text box
    void textBox() {
        box = new JTextArea();
        box.setBounds(650, 80, 500, 400);
        c1.add(box);
        box.setBackground(Color.lightGray);
        box.setFont(font);
        box.setForeground(Color.BLUE);
        box.setLineWrap(true);
    }

    // this is only for give on command on all button;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            String s1 = ent1.getText();
            String s2 = ent2.getText();
            char[] s3 = password.getPassword();
            String s4 = "";
            String s5 = "";
            if (male_Button.isSelected()) {
                s5 = "Male";
            }
            if (female_Button.isSelected()) {
                s5 = "Female";
            }
            for (char ch : s3) {
                s4 = s4 + ch;
            }
            box.setText("My Name Is : " + s1 + "\nMy age is : " + s2 + "\nMy Password is : " + s4 + "\nMy Gender is : "
                    + s5);
        }
        if (e.getSource() == btn2) {
            c1.setBackground(Color.green);
            male_Button.setBackground(Color.green);
            female_Button.setBackground(Color.green);
            
        }
        if (e.getSource() == btn3) {
            String fruit = "";
            int count = 0;
            if (mango_Box.isSelected()) {
                fruit = fruit + "Mango ";
                count++;
            }
            if (banana_Box.isSelected()) {
                fruit = fruit + "Banana ";
                count++;
            }
            if (grapes_Box.isSelected()) {
                fruit = fruit + "Grapes ";
                count++;
            }
            if (orange_Box.isSelected()) {
                fruit += "Orange ";
                count++;
            }
            if (apple_Box.isSelected()) {
                fruit += "Apple ";
                count++;
            }
            if (papaya_Box.isSelected()) {
                fruit += "Papaya ";
                count++;
            }
            if (coconut_Box.isSelected()) {
                fruit += "Coconut ";
                count++;
            }
            if (watermelon_Box.isSelected()) {
                fruit += "Watermelon ";
                count++;
            }
            if (blackberry_Box.isSelected()) {
                fruit += "Black Berry ";
                count++;
            }
            if (lichi_Box.isSelected()) {
                fruit += "Lichi ";
                count++;
            }
            box.setText("You select total " + count + " Fruits Like as :\n" + fruit);
        }
        if (e.getSource() == btn4) {
            c1.setBackground(Color.cyan);
            male_Button.setBackground(Color.cyan);
            female_Button.setBackground(Color.cyan);
        }
    }

    public static void main(String[] args) {
        revision obj = new revision();
    }

}

class applyItemListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == revision.male_Button) {
            revision.box.setText("You Selected Male : ");
        }
        if (e.getSource() == revision.female_Button) {
            revision.box.setText("You Selected Female : ");
        }
        if (e.getSource() == revision.mango_Box) {
            revision.box.setText("You Select Mango : ");
        }

        if (e.getSource() == revision.banana_Box) {
            revision.box.setText("You Select Banana : ");
        }

        if (e.getSource() == revision.grapes_Box) {
            revision.box.setText("You Select Grapes : ");
        }

        if (e.getSource() == revision.orange_Box) {
            revision.box.setText("You Select Orange : ");
        }

        if (e.getSource() == revision.apple_Box) {
            revision.box.setText("You Select Apple : ");
        }

        if (e.getSource() == revision.papaya_Box) {
            revision.box.setText("You Select Papaya : ");
        }

        if (e.getSource() == revision.coconut_Box) {
            revision.box.setText("You Select Coconut : ");
        }

        if (e.getSource() == revision.watermelon_Box) {
            revision.box.setText("You Select WaterMelon : ");
        }

        if (e.getSource() == revision.blackberry_Box) {
            revision.box.setText("You Select Blackberry : ");
        }

        if (e.getSource() == revision.lichi_Box) {
            revision.box.setText("You Select Lichi : ");
        }

    }

}
