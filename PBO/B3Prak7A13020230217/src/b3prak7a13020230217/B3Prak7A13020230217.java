package b3prak7a13020230217;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class BookServices extends javax.swing.JFrame {
    
    private String menu = "";
    private ArrayList<String> bookName = new ArrayList<>();
    private ArrayList<String> authorName = new ArrayList<>();
    
    private void changeAllVisible(boolean value){
        fieldBookName.setVisible(value);
        fieldAuthorName.setVisible(value);
        fieldId.setVisible(false);
        btnSet.setVisible(value);
    }
    
    private void changeAllVisibleUpdate(boolean value){
        fieldBookName.setVisible(value);
        fieldAuthorName.setVisible(value);
        fieldId.setVisible(value);
        
        btnSet.setVisible(value);
    }
    
    void changeBookNameVisible(boolean value){
        changeAllVisible(false);
        fieldBookName.setVisible(value);
        btnSet.setVisible(value);
    }
    
    void addBookk(){
        bookName.add(fieldBookName.getText());
        authorName.add(fieldAuthorName.getText());
    }
    
    void findListBook(){
        DefaultListModel<String> model = new DefaultListModel<>();
        
        for (int i = 0; i < bookName.size(); i++){
            String outputText = "";
            outputText += (i + 1) + ". ";
            outputText += "Nama Buku: " + bookName.get(i) + ", ";
            outputText += "Nama Author: " + authorName.get(i) + ", ";
            model.addElement(outputText);
            
            jList1.setModel(model);
        }
        
        jList1.setModel(model);
    }
    
    void findListBookById(int i){
        DefaultListModel<String> model = new DefaultListModel<>();
        
        String outputText = "";
        outputText += (i) + ". ";
        outputText += "Nama Buku: " + bookName.get(i - 1) + ", ";
        outputText += "Nama Author: " + authorName.get(i - 1);
        model.addElement(outputText);
        
        jList1.setModel(model);
    }
    
    void deleteBook(int i){
        bookName.remove(i - 1);
    }
    
    void changeMenu(String menu){
        this.menu = menu;
    }
    
    void updateBook(int i){
        bookName.remove(i - 1);
    }
    
    public BookServices() {
        initComponents();
        changeAllVisible(false);
        panelOutput.setVisible(true);
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt){
        fieldBookName.setText("Book name");
        changeBookNamevisible(false);
        changeAllVisible(true);
        changeMenu("add");
    }
            
}
