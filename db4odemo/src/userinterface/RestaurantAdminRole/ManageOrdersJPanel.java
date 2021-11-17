/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohithparvataneni
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    DefaultTableModel model;
    int row,col;
    private  Restaurant restaurant;
    public ManageOrdersJPanel(JPanel userProcessContainer, EcoSystem system, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.restaurant = restaurant;
        model = (DefaultTableModel) tableOrder.getModel();
        populateTableOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Item", "Availability", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tableOrder);

        btnAccept.setText("Accept");

        btnReject.setText("Reject");

        btnAssign.setText("Assign");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAccept)
                        .addGap(45, 45, 45)
                        .addComponent(btnReject)
                        .addGap(31, 31, 31)
                        .addComponent(btnAssign)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnReject)
                    .addComponent(btnAssign))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    public void populateTableOrder()
    {
        model.setRowCount(0);
        WorkQueue workQueue = restaurant.getWorkQueue();
        
        for(WorkRequest workRequest : workQueue.getWorkRequestList() ){
            Order order = (Order) workRequest;
            Object[] objs = {workRequest.getReceiver().getUsername(),order.getFoodItemName(),order.getPrice(),workRequest.getStatus()};
            model.addRow(objs);
        }
        
        
          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOrder;
    // End of variables declaration//GEN-END:variables
}
