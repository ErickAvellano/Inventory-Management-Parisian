package inventoryparisian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Erick Avellano
 */
public class InventoryParisian extends JFrame{

    JFrame frame;
    JLabel fpanel1 = new JLabel();
    ImageIcon img1 = new ImageIcon("Parisian_img1.png"); 
    JPanel panel1 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JLabel fpanel2 = new JLabel();
    ImageIcon img2 = new ImageIcon("Parisian_img2.png");
    JPanel panel2 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JLabel textDisplay = new JLabel("DISPLAY ITEMS FROM INVENTORY");
    JLabel prodname = new JLabel("Enter Index");
    JLabel prodqty = new JLabel ("Enter Quantity");
    JLabel name = new JLabel("Item Name:");
    JLabel quan = new JLabel("Quantity:");
    JLabel price = new JLabel("Price:");
    JLabel textAdd = new JLabel("ADD ITEM TO INVENTORY");
    JPanel panel3 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel4 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel5 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel6 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel7 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel8 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JPanel panel9 = new JPanel((new FlowLayout(FlowLayout.CENTER, 0, 0)));
    JTextField searchfield = new JTextField();
    JLabel textsearch = new JLabel("SEARCH ITEM IN INVENTORY");
    JLabel deltext = new JLabel("DELETE ITEM IN INVENTORY");
    JLabel tsearch = new JLabel("Search Item by Name:");
    JLabel tedit1 = new JLabel("Name:");
    JLabel tedit2 = new JLabel("Qty:");
    JLabel tedit3 = new JLabel("Price:");
    JLabel textedit = new JLabel("EDIT ITEM IN INVENTORY");
    JButton addItem = new JButton("ADD ITEM");
    JButton trans = new JButton("Sales Invoice");
    JButton tabaddItem = new JButton("Add Item");
    JTextField tempedit = new JTextField();
    JTextField newName = new JTextField();
    JTextField newQuan = new JTextField();
    JTextField newPrice = new JTextField();
    JButton tabsearch = new JButton("Search Item");
    JButton search = new JButton("SEARCH ITEM");
    JButton tabdelete = new JButton("Delete Item");
    JButton delete = new JButton("DELETE");
    JButton tabedit = new JButton("Edit Item");
    JButton edit = new JButton("Edit Item");
    JButton display = new JButton("Display Item");
    String col[]= {"Index", "Item", "Qty.", "Unit Price"};
    Object row[][] = {};
    DefaultTableModel model1 = new DefaultTableModel(row,col);
    DefaultTableModel model2 = new DefaultTableModel(row,col);
    DefaultTableModel model3 = new DefaultTableModel(row,col);
    DefaultTableModel model4 = new DefaultTableModel(row,col);
    DefaultTableModel model5 = new DefaultTableModel(row,col);
    Font font = new Font ("Times New Roman",Font.BOLD, 20);
    Font font1 = new Font ("Times New Roman",Font.BOLD, 15);
    JTextField Iname = new JTextField();
    JTextField Quantity = new JTextField();
    JTextField Price = new JTextField();
    JTextField del = new JTextField();
    JTable table1 = new JTable(model1){   
    };
    JTable table2 = new JTable(model2){    
    };
    JTable table3 = new JTable(model3){    
    };
    JTable table4 = new JTable(model4){    
    };
    JTable table5 = new JTable(model5){    
    };
    JTextField pitem = new JTextField();
    JTextField pqty = new JTextField();
    JButton purchase = new JButton("Add More Items");
    JButton fpurchase = new JButton("Finalize Receipt");
    JTextField Receipt = new JTextField();
    JLabel design1 = new JLabel("*******************************************");
    JLabel design2 = new JLabel("*******************************************");
    JLabel design3 = new JLabel("*******************************************");
    JLabel totaltext = new JLabel("TOTAL");
    JLabel cashtext = new JLabel("CASH");
    JLabel changetext = new JLabel("CHANGE");
    JLabel No = new JLabel("No. of Items:");
    JTextField ftotal = new JTextField();
    JTextField fcash = new JTextField();
    JTextField fchange = new JTextField();
    JLabel pwdtext1 = new JLabel("With Senior Citizen/");
    JLabel pwdtext2 = new JLabel("PWD / Other Discount");
    JButton pwdconfirm = new JButton("Yes");
    JTextField cash = new JTextField();
    JLabel cashtext2 = new JLabel("Cash Payment"); 
    JButton Confirm = new JButton("Pay");
    JButton clear = new JButton("Proceed to next customer");
    JTextField nitem = new JTextField();
    JScrollPane scroll1 = new JScrollPane(table1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane scroll2 = new JScrollPane(table2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane scroll3 = new JScrollPane(table3,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane scroll4 = new JScrollPane(table4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane scroll5 = new JScrollPane(table5, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    public InventoryParisian() throws IOException{
        frame= new JFrame("Parisian Inventory");
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font ("Times New Roman",Font.BOLD, 13));
        textArea.setBorder(BorderFactory.createBevelBorder(2));
        textArea.append("\tThank You For Shopping\n"          
                          + "\t         at Parisian\n");
            textArea.append("\t     Bicol University\n "
                         + "\t  College Of Science\n");
            textArea.append("\t   Legazpi City, Albay");
        
        
         panel2.add(textArea).setBounds(50, 0, 2000, 80);

        panel2.setLayout(null);
        panel2.setBackground(new Color( 255, 255 ,255));
        panel2.setBounds(887, 60, 380, 525);
        panel2.add(scroll5).setBounds(15, 100, 350, 225);
        panel2.add(design2).setBounds(15, -155, 350, 500);
        panel2.add(design1).setBounds(15, 220, 350, 225);
        panel2.add(design3).setBounds(15, 160, 350, 500);
        
        design1.setFont(font1);
        
        design2.setFont(font1);
        design3.setFont(font1);
        totaltext.setFont(font1);
        cashtext.setFont(font1);
        changetext.setFont(font1);
        panel2.add(totaltext).setBounds(20, 240, 350, 225);
        panel2.add(cashtext).setBounds(20, 260, 350, 225);
        panel2.add(changetext).setBounds(20, 280, 350, 225);
        panel2.add(ftotal).setBounds(260, 343, 100, 20);
        panel2.add(fcash).setBounds(260, 363, 100, 20);
        panel2.add(fchange).setBounds(260, 383, 100, 20);

        panel2.add(nitem).setBounds(100, 440, 50, 20);
        panel2.add(No).setBounds(15, 440, 100, 20);

        ftotal.setEditable(false);
        fcash.setEditable(false);
        fchange.setEditable(false);
        
        nitem.setBorder(BorderFactory.createLineBorder(Color.black,0));
        ftotal.setBorder(BorderFactory.createLineBorder(Color.black,0));
        fcash.setBorder(BorderFactory.createLineBorder(Color.black,0));
        fchange.setBorder(BorderFactory.createLineBorder(Color.black,0));
        ftotal.setBackground(Color.white);
        fcash.setBackground(Color.white);
        fchange.setBackground(Color.white);
        
        frame.add(panel2);
        table5.setShowGrid(false);
        
        trans.setVisible(true);
        trans.setBounds(310,250,85,50);
        trans.setBackground(Color.decode("#bf9774")); //button background color
        trans.setForeground(Color.white); //set text color
        trans.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(trans);
        
        tabaddItem.setBounds(310,310,85,50);
        tabaddItem.setBackground(Color.decode("#bf9774")); //button background color
        tabaddItem.setForeground(Color.white); //set text color
        tabaddItem.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(tabaddItem);
        
        tabsearch.setBounds(310,370,85,50);
        tabsearch.setBackground(Color.decode("#bf9774")); //button background color
        tabsearch.setForeground(Color.white); //set text color
        tabsearch.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(tabsearch);
        
        tabdelete.setBounds(310,430,85,50);
        tabdelete.setBackground(Color.decode("#bf9774")); //button background color
        tabdelete.setForeground(Color.white); //set text color
        tabdelete.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(tabdelete);
        
        tabedit.setBounds(310,490,85,50);
        tabedit.setBackground(Color.decode("#bf9774")); //button background color
        tabedit.setForeground(Color.white); //set text color
        tabedit.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(tabedit);
        
        display.setBounds(310,550,85,50);
        display.setBackground(Color.decode("#bf9774")); //button background color
        display.setForeground(Color.white); //set text color
        display.setBorder(BorderFactory.createLineBorder(Color.black,2)); //solid border
        frame.add(display);
        
        fpanel1.setIcon(img1);  
        panel1.setBounds(0,0,400,650);
        panel1.add(fpanel1);
        frame.add(panel1);
        
        fpanel2.setIcon(img2);
        panel9.setBounds(870,0,430,650);
        panel9.add(fpanel2);
        frame.add(panel9);
        
        

        panel3.setBounds(410, 315, 450, 325);
        panel3.add(scroll1).setBounds(15,50,420,250);
        panel3.setLayout(null);
        textDisplay.setFont(font);
        panel3.add(textDisplay).setBounds(55,-100,430,250);
        //panel3.setBackground(Color.decode("#b18765")); // change the background
          frame.add(panel3);
          
         table1.setRowHeight(table1.getRowHeight()+10); 
         for (int i = 0; i < 100; i++){// To Add Rows in the table
            model1.addRow(new Object[][]{}); 
        } 
        table1.setDefaultEditor(Object.class, null); 
        table1.getTableHeader().setReorderingAllowed(false);
        scroll1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(10);
            table1.getColumnModel().getColumn(1).setPreferredWidth(150);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(10);
            table1.getColumnModel().getColumn(3).setPreferredWidth(10);  
        }
        
        Iname.setEditable(true);//TextField for add; Name
        Iname.setBounds(50,110,350,35);
        Iname.setBorder(BorderFactory.createLineBorder(Color.white,5));
          
        Quantity.setEditable(true);
        Quantity.setBounds(50,175,140,35);
        Quantity.setBorder(BorderFactory.createLineBorder(Color.white,5));
          
        Price.setEditable(true);//TextField
        Price.setBounds(200,175,200,35);
        Price.setBorder(BorderFactory.createLineBorder(Color.white,5));
          
        addItem.setBounds(140,240,170,40);
        addItem.setBackground(Color.white); //button background color
        addItem.setBorder(BorderFactory.createLineBorder(Color.black,1)); //solid border
          
        panel4.setBounds(410, 315, 450, 325);
        frame.add(panel4);
        panel4.add(name).setBounds(52,-30,430,250);//text
        panel4.add(quan).setBounds(52,35,430,250);//text
        panel4.add(price).setBounds(200,35,430,250);//text
        panel4.add(Iname);
        panel4.add(Quantity);
        panel4.add(Price);
        panel4.add(addItem);
        panel4.setLayout(null);
        textAdd.setFont(font);
        panel4.add(textAdd).setBounds(98,-75,430,250);
        
        searchfield.setBorder(BorderFactory.createLineBorder(Color.white,5));   
        search.setBounds(140,265,170,40);
        search.setBackground(Color.white); //button background color
        search.setBorder(BorderFactory.createLineBorder(Color.black,1)); //solid border
        
        panel5.setBounds(410, 315, 450, 325);
        panel5.setLayout(null);
        textsearch.setFont(font);
        panel5.add(textsearch).setBounds(82,-75,430,250);
        panel5.add(tsearch).setBounds(40,60,370,40);
        panel5.add(searchfield).setBounds(40,95,370,35);
        panel5.add(scroll2).setBounds(40,140,370,115);
        panel5.add(search);
        frame.add(panel5);
        
        table2.setRowHeight(table3.getRowHeight()+10);
        table2.setDefaultEditor(Object.class, null); 
        table2.getTableHeader().setReorderingAllowed(false);
        scroll2.setViewportView(table2);
        for (int i = 0; i < 100; i++){// To Add Rows in the table
            model2.addRow(new Object[][]{}); 
        }
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setPreferredWidth(10);
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setPreferredWidth(140);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setPreferredWidth(25);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(3).setPreferredWidth(10);  
            table2.getColumnModel().getColumn(3).setResizable(false);
        }
        
        delete.setBounds(140,260,170,40);
        delete.setBackground(Color.white); //button background color
        delete.setBorder(BorderFactory.createLineBorder(Color.black,1)); //solid border
        
        del.setEditable(false);
        del.setVisible(false);
        del.setBounds(50,215,350,35);
        del.setBorder(BorderFactory.createLineBorder(Color.white,5));
        
        panel6.setBounds(410, 315, 450, 325);
        panel6.setLayout(null);
        deltext.setFont(font);
        panel6.add(del);
        panel6.add(deltext).setBounds(82,-100,430,250);
        panel6.add(delete);
        panel6.add(scroll3).setBounds(15,50,420,190);
        frame.add(panel6);
        table3.setRowHeight(table3.getRowHeight()+10);
         for (int i = 0; i < 100; i++){// To Add Rows in the table
            model3.addRow(new Object[][]{}); 
        } 
        table3.setDefaultEditor(Object.class, null); 
        table3.getTableHeader().setReorderingAllowed(false);
        scroll3.setViewportView(table3);
        if (table3.getColumnModel().getColumnCount() > 0) {
            table3.getColumnModel().getColumn(0).setPreferredWidth(10);
            table3.getColumnModel().getColumn(0).setResizable(false);
            table3.getColumnModel().getColumn(1).setPreferredWidth(140);
            table3.getColumnModel().getColumn(1).setResizable(false);
            table3.getColumnModel().getColumn(2).setPreferredWidth(25);
            table3.getColumnModel().getColumn(2).setResizable(false);
            table3.getColumnModel().getColumn(3).setPreferredWidth(10);  
            table3.getColumnModel().getColumn(3).setResizable(false);
        }
        
        panel7.setBounds(410, 7, 450, 308);
        panel7.setLayout(null);
        pitem.setVisible(true);
        panel7.add(prodname).setBounds(30,30,200,40);
        panel7.add(prodqty).setBounds(260,30,200,40);
        panel7.add(pitem).setBounds(30,60,200,40);
        panel7.add(pqty).setBounds(260,60,100,40);
        panel7.add(purchase).setBounds(30,110,200,40);
        panel7.add(fpurchase).setBounds(260,110,180,40);
        panel7.add(pwdtext1).setBounds(30,150,130,40);
        panel7.add(pwdtext2).setBounds(30,165,130,40);
        panel7.add(pwdconfirm).setBounds(30,200,150,40);
        panel7.add(cashtext2).setBounds(230,165,130,40);
        panel7.add(cash).setBounds(230,200,100,40);
        panel7.add(Confirm).setBounds(340,200,90,40);
        panel7.add(clear).setBounds(125,250,200,40);
        
        cash.setEnabled(false);
        Confirm.setEnabled(false);
        pwdconfirm.setEnabled(false);
        purchase.setEnabled(false);
        fpurchase.setEnabled(false);
        pitem.setEnabled(false);
        pqty.setEnabled(false);
        clear.setEnabled(false);
   
        table5.setRowHeight(table5.getRowHeight()+10); 
         for (int i = 0; i < 100; i++){// To Add Rows in the table
            model5.addRow(new Object[][]{}); 
        } 
        table5.setDefaultEditor(Object.class, null); 
        table5.getTableHeader().setReorderingAllowed(false);
        scroll5.setViewportView(table5);
        if (table5.getColumnModel().getColumnCount() > 0) {
            table5.getColumnModel().getColumn(0).setPreferredWidth(20);
            table5.getColumnModel().getColumn(0).setResizable(false);
            table5.getColumnModel().getColumn(1).setPreferredWidth(140);
            table5.getColumnModel().getColumn(1).setResizable(false);
            table5.getColumnModel().getColumn(2).setPreferredWidth(10);
            table5.getColumnModel().getColumn(2).setResizable(false);
            table5.getColumnModel().getColumn(3).setPreferredWidth(30);  
            table5.getColumnModel().getColumn(3).setResizable(false); 
        }
//        JComboBox itemSelect = new JComboBox();
//
//            BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));    
//            Object[] items = rdfile.lines().toArray();
//
//        int b;
//            for
//                (int y = 0; y< items.length; y++){
//                String line = items[y].toString();
//                String line2 = line.replaceAll("[0-9]","\n");
//                String line3 = line2.replaceAll("[.]","\n");
//                String line4 = line3.stripTrailing();
//                itemSelect.addItem(line4);
//
//            } 
//             
//            rdfile.close();

//        panel7.add(itemSelect).setBounds(0, 7, 250, 40);

        frame.add(panel7);
        panel8.setBounds(410, 315, 450, 325);
        panel8.setLayout(null);
        textedit.setFont(font);
        panel8.add(scroll4).setBounds(15,50,420,140);
        panel8.add(textedit).setBounds(98,-100,430,250);
        panel8.add(newName).setBounds(20,215,250,30);
        panel8.add(newQuan).setBounds(280,215,65,30);
        panel8.add(newPrice).setBounds(355,215,65,30);
        panel8.add(tedit1).setBounds(20,190,65,30);
        panel8.add(tedit2).setBounds(280,190,65,30);
        panel8.add(tedit3).setBounds(355,190,65,30);
        panel8.add(edit).setBounds(140,260,170,40);
        tempedit.setBounds(20,215,250,30);
        panel8.add(tempedit).setVisible(false);
        table4.setRowHeight(table4.getRowHeight()+10);
         for (int i = 0; i < 100; i++){// To Add Rows in the table
            model4.addRow(new Object[][]{}); 
        } 
        table4.setDefaultEditor(Object.class, null);  
        table4.getTableHeader().setReorderingAllowed(false);
        scroll4.setViewportView(table4);
        if (table4.getColumnModel().getColumnCount() > 0) {
            table4.getColumnModel().getColumn(0).setPreferredWidth(10);
            table4.getColumnModel().getColumn(0).setResizable(false);
            table4.getColumnModel().getColumn(1).setPreferredWidth(140);
            table4.getColumnModel().getColumn(1).setResizable(false);
            table4.getColumnModel().getColumn(2).setPreferredWidth(25);
            table4.getColumnModel().getColumn(2).setResizable(false);
            table4.getColumnModel().getColumn(3).setPreferredWidth(10);  
            table4.getColumnModel().getColumn(3).setResizable(false);
        }
        try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        table1.setValueAt(null, r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    table1.setValueAt((1000 + x + 1), x, 0);// Pwede alisin para mawala yung index
                    for (int j = 1; j < 4; j++) {
                        table1.setValueAt(temp[j - 1], x, j);
                    }
                    x++;
                }
                rdfile.close();

            } catch (IOException f) {
            }
        
        
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel8.setVisible(false);
        frame.add(panel8);
        
        
        frame.setSize (1300,685); //jframe size
        frame.setResizable(false);
        frame.setLayout (null); //set JPanel layout
        frame.setVisible(true); //frame wil be visible
        frame.getContentPane().setBackground(Color.decode("#b18765"));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //terminate program when close selected

        // TAB ACTION LISTENER=============================================================
        tabaddItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            panel4.setVisible(true);
            panel3.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel8.setVisible(false);
            cash.setEnabled(false);
            Confirm.setEnabled(false);
            pwdconfirm.setEnabled(false);
            purchase.setEnabled(false);
            fpurchase.setEnabled(false);
            pitem.setEnabled(false);
            pqty.setEnabled(false);
            clear.setEnabled(false);
            }
        });
        tabsearch.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            panel4.setVisible(false);
            panel3.setVisible(false);
            panel5.setVisible(true);
            panel6.setVisible(false);
            panel8.setVisible(false);
            cash.setEnabled(false);
            Confirm.setEnabled(false);
            pwdconfirm.setEnabled(false);
            purchase.setEnabled(false);
            fpurchase.setEnabled(false);
            pitem.setEnabled(false);
            pqty.setEnabled(false);
            clear.setEnabled(false);
            
            }
        });
        tabdelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            panel4.setVisible(false);
            panel3.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(true);
            panel8.setVisible(false);
            cash.setEnabled(false);
            Confirm.setEnabled(false);
            pwdconfirm.setEnabled(false);
            purchase.setEnabled(false);
            fpurchase.setEnabled(false);
            pitem.setEnabled(false);
            pqty.setEnabled(false);
            clear.setEnabled(false);
            try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        table3.setValueAt(null, r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    table3.setValueAt((1000 + x + 1), x, 0);
                    for (int j = 1; j < 4; j++) {
                        table3.setValueAt(temp[j - 1], x, j);
                    }
                    x++;
                }
                rdfile.close();

            } catch (IOException f) {
            }
            
            }
        });
        
        
        
        tabedit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            panel4.setVisible(false);
            panel3.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel8.setVisible(true);
            cash.setEnabled(false);
            Confirm.setEnabled(false);
            pwdconfirm.setEnabled(false);
            purchase.setEnabled(false);
            fpurchase.setEnabled(false);
            pitem.setEnabled(false);
            pqty.setEnabled(false);
            clear.setEnabled(false);
            try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        table4.setValueAt(null, r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    table4.setValueAt((1000 + x + 1), x, 0);// Pwede alisin para mawala yung index
                    for (int j = 1; j < 4; j++) {
                        table4.setValueAt(temp[j - 1], x, j);
                    }
                    x++;
                }
                rdfile.close();

            } 
            catch (IOException f) {
            } 
 }
});
        table3.addMouseListener(new MouseAdapter(){
                
                @Override
            public void mouseClicked(MouseEvent e){
            int i = table3.getSelectedRow();
            del.setText(model3.getValueAt(i,1).toString());

                }
            });
        table4.addMouseListener(new MouseAdapter(){
                
                @Override
            public void mouseClicked(MouseEvent e){
            int i = table4.getSelectedRow();
            tempedit.setText(model4.getValueAt(i,1).toString());
            newName.setText(model4.getValueAt(i,1).toString());
            newQuan.setText(model4.getValueAt(i,2).toString());
            newPrice.setText(model4.getValueAt(i,3).toString());
                } 
            
            });
        table1.addMouseListener(new MouseAdapter(){
                
                @Override
            public void mouseClicked(MouseEvent e){
            int i = table1.getSelectedRow();
            pitem.setText(model1.getValueAt(i,0).toString());
                } 
            });
        
        
        edit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{   
            if( tempedit.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter item!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);
           
            else{
                BufferedReader rdfile= new BufferedReader( new FileReader("Inventoryitems.txt"));

                String[] itemline= new String[100];
                String temp[];
                String search= "", prod="", Qty="", Price="";
                search= tempedit.getText();
                int qty=0, x=0; double price=0.0;
                boolean found= false;

                prod= newName.getText();
                Qty= newQuan.getText();
                Price= newPrice.getText();
                if( (!(prod.equals(""))) || (!(Qty.equals(""))) || (!(Price.equals(""))) ){
                    while(( itemline[x]= rdfile.readLine()) != null){
                        temp= itemline[x].split("\t");

                        if( search.equals( temp[0])){
                            if( prod.equals(""))
                                prod= temp[0];
                            if( Qty.equals(""))
                                qty= Integer.parseInt(temp[1]);
                            else
                                qty= Integer.parseInt( Qty );
                            
                            if( Price.equals(""))
                                price= Double.parseDouble(temp[2]);
                            else
                                price= Double.parseDouble( Price);

                            itemline[x]= prod+"\t"+qty+"\t"+price;
                            found= true;
                        }
                        x++;


                    }
                    rdfile.close();

                    if( found ){
                        PrintWriter wrfile= new PrintWriter( new FileWriter("Inventoryitems.txt"));

                        for( int j=0; itemline[j] != null; j++)
                            wrfile.println( itemline[j]);

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Changes Saved!");
                    } else
                        JOptionPane.showMessageDialog(null, "Item Not Found!");
                    
                    tempedit.setText("");
                    newName.setText("");
                    newQuan.setText("");
                    newPrice.setText("");
                    
                    } else
                    JOptionPane.showMessageDialog( null, "No Changes Yet!");
            }
                
        }catch(IOException f){} catch(NumberFormatException f){
            JOptionPane.showMessageDialog(null, "Some input may be invalid!");
            
                    newName.setText("");
                    newQuan.setText("");
                    newPrice.setText("");
        }
    
    }
                
        });
        
        // BUTTON ACTION LISTENER=============================================================
        addItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             try {
            if (Iname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Add Item!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] itemline = new String[100];
                String prod = "";
                int qty = 0;
                double price = 0.0;
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();

                if (!(x >= 100)) {
                    prod = Iname.getText();

                    for (int j = 0; itemline[j] != null; j++) {      //check whether item is in the list already
                        String[] temp = itemline[j].split("\t");

                        if (prod.equals(temp[0])) {
                            found = true;
                        }
                    }
                    if (found) {
                        JOptionPane.showMessageDialog(null, "Item(s) already exist!", "Add Item", JOptionPane.WARNING_MESSAGE);
                    } else {
                        qty = Integer.parseInt(Quantity.getText());
                        price = Double.parseDouble(Price.getText());

                        itemline[x] = prod + "\t" + qty + "\t" + price;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("Inventoryitems.txt"));

                        for (int j = 0; itemline[j] != null; j++) {
                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", "Add Item", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }

            Iname.setText("");
            Quantity.setText("");
            Price.setText("");

        } catch (IOException g) {
        } catch (NumberFormatException g) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Warning!", JOptionPane.WARNING_MESSAGE);

            Iname.setText("");//3Iname
            Quantity.setText("");//4Quantity
            Price.setText("");//5Price
        }
    }

});
        
        search.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 try{
            if( searchfield.getText().equals(""))
                JOptionPane.showMessageDialog(null, "No Item(s) Entered", "Search Error", JOptionPane.ERROR_MESSAGE);
            else{
                for( int r=0; r<100; r++)   //initializing row
                    for( int c=0; c<4; c++) //initializing column
                        table2.setValueAt("", r, c);
                
               BufferedReader rdfile= new BufferedReader( new FileReader("Inventoryitems.txt"));
               String[] line= new String[100];
               String search="", output="", target="";
                
                boolean same= false, found=false;

                int x=0, row=0;
                while( (line[x]= rdfile.readLine()) != null)//reading items.txt; asigning to array[] line
                    x++;

                rdfile.close();

                search= searchfield.getText();

                for( int k=0; line[k] != null; k++){
                    same= false;
                    target="";
                    for( int j=0; j < search.length(); j++)
                        target+= line[k].charAt(j);

                    if( search.equals(target))
                        same=true;

                    if( same){
                        String[] temp= line[k].split("\t");
                        table2.setValueAt((1000+k+1), row, 0);
                        for( int i=1; i<4; i++)
                            table2.setValueAt(temp[i-1], row,i);
                        row++;
                        found=true;
                    }
               } 

                if( !found)
                    JOptionPane.showMessageDialog(null, "Item(s) not found!", "Search Error", JOptionPane.ERROR_MESSAGE);

                searchfield.setText("");
            }
        }catch(IOException f){}
            }
        });
                
        display.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panel3.setVisible(true);    
                panel4.setVisible(false);
                panel5.setVisible(false);
                panel6.setVisible(false);
                panel8.setVisible(false);
                try {
                for (int r = 0; r < 100; r++) { //initializing row
                    for (int c = 0; c < 4; c++) { //initializing column
                        table1.setValueAt(null, r, c);
                    }
                }
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] item = new String[100];
                String[] temp;

                int x = 0;  //read item
                while ((item[x] = rdfile.readLine()) != null) {
                    temp = item[x].split("\t");
                    table1.setValueAt((1000 + x + 1), x, 0);// Pwede alisin para mawala yung index
                    for (int j = 1; j < 4; j++) {
                        table1.setValueAt(temp[j - 1], x, j);
                    }
                    x++;
                }
                rdfile.close();

            } catch (IOException f) {
            }
  
        }
        
      //tabpanel.setSelectedIndex(0);  
    });
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            try {
            if (del.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
             else {
                BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));

                String[] itemline = new String[100];
                String[] temp;
                String delete = del.getText();
                boolean found = false;
                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    temp = itemline[x].split("\t");

                    if (delete.equals(temp[0])) {
                        x = x + 0;
                        found = true;
                    } else 
                        x++;

                }

                rdfile.close();

                PrintWriter wrfile = new PrintWriter(new FileWriter("Inventoryitems.txt"));
                for (int j = 0; itemline[j] != null; j++) 
                    wrfile.println(itemline[j]);
                

                wrfile.close();

                if (!found) 
                    JOptionPane.showMessageDialog(null, "Item is already not in the list!", "Ooops!", JOptionPane.ERROR_MESSAGE);
                 else 
                    JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                

                del.setText("");
            }
        } catch (IOException f) {
        }
    
            }
        });
        
        
        purchase.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
            BufferedReader rdfile = new BufferedReader(new FileReader("Inventoryitems.txt"));
            String[] itemline = new String[100];
            String str;
            double price, total;
            int qty = 0, qty_prv = 0, qty_new = 0;
            boolean found = false, edited = false;
            int idx = (Integer.parseInt(pitem.getText())) - 1001;

            for (int x = 0; (str = rdfile.readLine()) != null; x++) {
                itemline[x] = str;
            }
            rdfile.close();

            int r = Row.getRow();
            for (int i = 0; itemline[i] != null; i++) {
                if (idx == i) {
                    found = true;
                    String[] temp = itemline[i].split("\t");
                    qty = Integer.parseInt(pqty.getText());
                    qty_prv = Integer.parseInt(temp[1]);
                    if ((qty > qty_prv) && (qty_prv != 0)) {
                        JOptionPane.showMessageDialog(null, "Item Shortage!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (qty_prv == 0) {
                        JOptionPane.showMessageDialog(null, "Out of Stock!", "Oops!", JOptionPane.WARNING_MESSAGE);
                    }
                    if ((qty <= qty_prv) && (qty_prv != 0)) {
                        qty_new = qty_prv - qty;
                        itemline[i] = temp[0] + "\t" + qty_new + "\t" + temp[2];
                        table5.setValueAt((1000 + i + 1), r, 0);
                        table5.setValueAt(temp[0], r, 1);
                        table5.setValueAt(qty+"x", r, 2);
                        price = Double.parseDouble(temp[2]);
                        total = qty * price;
                        table5.setValueAt(total, r, 3);
                        r++;
                        edited = true;
                    }
                }
                //Double.parseDouble(temp[2])

            }

            if (!found) {
                JOptionPane.showMessageDialog(null, pitem.getText() + ": Item Not Available!", "Oops!", JOptionPane.ERROR_MESSAGE);
            }
            if (edited) {
                PrintWriter wrfile = new PrintWriter(new FileWriter("Inventoryitems.txt"));
                for (int i = 0; itemline[i] != null; i++) {
                    wrfile.println(itemline[i]);
                }
                fpurchase.setEnabled(true);
                wrfile.close();
                Row.setRow();
            }
            pitem.setText("");
            pqty.setText("");

        } catch (IOException o) {
        } catch (NumberFormatException r) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Oops!", JOptionPane.ERROR_MESSAGE);

            pitem.setText("");
            pqty.setText("");
        }
            }
        });
        
       trans.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            purchase.setEnabled(true);
            fpurchase.setEnabled(true);
            pitem.setEnabled(true);
            pqty.setEnabled(true); 
            panel3.setVisible(true);
            }
        });
       fpurchase.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            pwdconfirm.setEnabled(true);
            cash.setEnabled(true);
            Confirm.setEnabled(true);
            
            try {
                int itms = 0, tmp;
                for (int r = 0; table5.getValueAt(r, 0) != null; r++) {
                    tmp = Integer.parseInt("" + table5.getValueAt(r, 0));
                    itms += tmp;
                }
                nitem.setText("" +(itms));
                double total = 0, tmp2;
                for (int r = 0; table5.getValueAt(r, 3) != null; r++) {
                    tmp2 = Double.parseDouble("" + table5.getValueAt(r, 3));
                    total += tmp2;
                }
                ftotal.setText("" + total);
            }catch (NumberFormatException k) {
                JOptionPane.showMessageDialog(null, "Invalid!", "", JOptionPane.ERROR_MESSAGE);
            }
            }
        });
       pwdconfirm.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               double total = 0, tmp2, cal = 0;
                for (int r = 0; table5.getValueAt(r, 3) != null; r++) {
                    tmp2 = Double.parseDouble("" + table5.getValueAt(r, 3));
                    total += tmp2;
                }
                cal = (total*10)/100;
                ftotal.setText("" + (total-cal));
            }
        });
       
       
       Confirm.addActionListener(new ActionListener(){
            @Override
            @SuppressWarnings("empty-statement")
            public void actionPerformed(ActionEvent e){
                double total = 0, cal = 0, cashs = 0;
     
                total = Double.parseDouble(ftotal.getText());
                cashs = Integer.parseInt(cash.getText());

                if (total < cashs){
                fcash.setText("" + cashs);
                fchange.setText("" + (cashs - total));
                
                fpurchase.setEnabled(false);
                purchase.setEnabled(false);
                clear.setEnabled(true);
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insufficient Cash!", null, JOptionPane.WARNING_MESSAGE);
                    }
                
//
//            } catch (NumberFormatException k) {
//                JOptionPane.showMessageDialog(null, "Invalid!", "", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//       itemSelect.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//              
//            String selectedItem = itemSelect.getSelectedItem().toString();
//            pitem.setText(selectedItem);
//            }
//        });
         }  
          });
       clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             for (int r = 0; r < 100; r++) //initializing row
        {
            for (int c = 0; c < 4; c++) //initializing column
            {
                table5.setValueAt(null, r, c);
            }
        }

        fpurchase.setEnabled(true);
        nitem.setText("");
        fcash.setText("");
        ftotal.setText("");
        fchange.setText("");
        cash.setText("");
        purchase.setEnabled(true);
        pwdconfirm.setEnabled(false);
        cash.setEnabled(false);
        Confirm.setEnabled(false);
        
    }                                         
        });
    } 
            

    public static void main(String[] args) throws IOException {
        
        InventoryParisian Parisianframe = new InventoryParisian();
        
    }
}

