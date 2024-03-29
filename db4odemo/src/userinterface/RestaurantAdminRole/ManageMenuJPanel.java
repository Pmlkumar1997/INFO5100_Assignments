/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.FoodItem.Item;
import Business.FoodItem.Menu;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohithparvataneni
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private JPanel userProcessContainer;
    private Restaurant restaurant;
    DefaultTableModel model;
    //private Menu menu;
    int row,col;
    
    public ManageMenuJPanel(JPanel userProcessContainer, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.restaurant = restaurant;
        model = (DefaultTableModel) tableItem.getModel();
        btnGroupAvail.add(btnYes);
        btnGroupAvail.add(btnNo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAvail = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnYes = new javax.swing.JRadioButton();
        btnNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewItems = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("Item");

        jLabel2.setText("Price");

        jLabel3.setText("Availability");

        btnYes.setText("Yes");

        btnNo.setText("No");

        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Availability"
            }
        ));
        tableItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableItem);

        btnAddItem.setBackground(new java.awt.Color(102, 204, 255));
        btnAddItem.setText("Add");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setBackground(new java.awt.Color(102, 204, 255));
        btnUpdateItem.setText("Update");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setBackground(new java.awt.Color(102, 204, 255));
        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 204, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewItems.setBackground(new java.awt.Color(102, 204, 255));
        btnViewItems.setText("View");
        btnViewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Manage Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateItem)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteItem)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewItems))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNo))
                                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnBack)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnUpdateItem)
                    .addComponent(btnDeleteItem)
                    .addComponent(btnViewItems))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        
       String itemName = txtItem.getText();
       String strPrice = txtPrice.getText();
       String avail = getAvailability();
       
       if (itemName.isEmpty()||strPrice.isEmpty() || avail.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
            return;
        }
        
        if (!isNumber(strPrice))
        {
            JOptionPane.showMessageDialog(this,"Invalid Price. Please insert a number","Invalid price",2);
            return;
        }
        
        if (!restaurant.getMenu().checkIfItemExist(itemName))
        {
            JOptionPane.showMessageDialog(this,"Item already exist in menu","Item exists",2);
            return;
        }
        
        double price = Double.parseDouble(strPrice);
        
        Item item = new Item(itemName,price,avail);
        restaurant.getMenu().addItem(item);
        
        displayMenu(restaurant.getMenu().getItemsList());
        
        JOptionPane.showMessageDialog(this,"Item added successfully..!");
        clearField();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        
        String updateitemName = txtItem.getText();
        String updatestrPrice = txtPrice.getText();
        String updateavail = getAvailability();
        
        if (updateitemName.isEmpty()||updatestrPrice.isEmpty() || updateavail.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "One or More fields are empty..!", "Empty Fields", 2);
            return;
        }
        
        if (!isNumber(updatestrPrice))
        {
            JOptionPane.showMessageDialog(this,"Invalid Price. Please insert a number");
            return;
        }
        
        double updatePrice = Double.parseDouble(updatestrPrice);
        
        Item item = new Item(updateitemName,updatePrice,updateavail);
        
        Menu menu = restaurant.getMenu();
        menu.getItemsList().get(row).setItemName(updateitemName);
        menu.getItemsList().get(row).setPrice(updatePrice);
        menu.getItemsList().get(row).setAvailability(updateavail);

        displayMenu(menu.getItemsList());

        JOptionPane.showMessageDialog(this, "Restaurant menu updated successfully.!!", "updated menu",1);
        clearField();
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnViewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemsActionPerformed
        
        Menu menu = restaurant.getMenu();
        displayMenu(menu.getItemsList());
    }//GEN-LAST:event_btnViewItemsActionPerformed

    private void tableItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableItemMouseClicked
        
        row = tableItem.getSelectedRow();
        col = tableItem.getColumnCount();
        
        txtItem.setText(model.getValueAt(row, 0).toString());
        txtPrice.setText(model.getValueAt(row, 1).toString());
        if (model.getValueAt(row, 2).toString().equals("Yes"))
        {
            btnYes.doClick();
        }
        if (model.getValueAt(row, 2).toString().equals("No"))
        {
            btnNo.doClick();
        }
    }//GEN-LAST:event_tableItemMouseClicked

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0)
        {
            row = tableItem.getSelectedRow();
            model.removeRow(row);
            Menu menu = restaurant.getMenu();
            menu.getItemsList().remove(row);
            displayMenu(menu.getItemsList());
            clearField();
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    
     public String getAvailability(){
        
        if(btnYes.isSelected()) return "Yes";
        else if(btnNo.isSelected()) return "No";
        return "";
    }
     
    private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
    }
    
    public void displayMenu(List<Item> items)
    {
        model.setRowCount(0);
        for (Item item : items)
        {
        Object objs[] = {item.getItemName(),item.getPrice(),item.getAvailability()};
        model.addRow(objs);
        }
    }
    
    public void clearField()
    {
        txtItem.setText("");
        txtPrice.setText("");
        btnGroupAvail.clearSelection();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.ButtonGroup btnGroupAvail;
    private javax.swing.JRadioButton btnNo;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JButton btnViewItems;
    private javax.swing.JRadioButton btnYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableItem;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
