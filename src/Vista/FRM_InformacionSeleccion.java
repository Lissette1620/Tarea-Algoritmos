/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author lissette
 */
public class FRM_InformacionSeleccion extends javax.swing.JFrame {

    /**
     * Creates new form FRM_InformacionSeleccion
     */
    public FRM_InformacionSeleccion() {
        initComponents();
        setLocation(750,200);
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
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(543, 270));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(203, 63, 119));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(1, 1, 1));
        jTextArea1.setRows(5);
        jTextArea1.setText("Consiste en encontrar el menor de todos los elementos \ndel arreglo o vector e intercambiarlo con el que está \nen la primera posición. \nLuego el segundo mas pequeño, y así sucesivamente \nhasta ordenarlo todo. \nSu implementación requiere O(n2) comparaciones \ne intercambios para ordenar una secuencia de \nelementos.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(243, 8, 150), new java.awt.Color(239, 6, 142), new java.awt.Color(236, 19, 107), new java.awt.Color(201, 9, 113)));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 485, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iindice.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(610, 348));
        jLabel1.setMinimumSize(new java.awt.Dimension(610, 348));
        jLabel1.setPreferredSize(new java.awt.Dimension(610, 348));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
