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
public class FRM_InformacionShell extends javax.swing.JFrame {

    /**
     * Creates new form FRM_InformacionShell
     */
    public FRM_InformacionShell() {
        initComponents();
        setLocation(750,205);
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
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(620, 350));
        setMinimumSize(new java.awt.Dimension(620, 350));
        setPreferredSize(new java.awt.Dimension(620, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(211, 96, 166));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(10, 3, 3));
        jTextArea1.setRows(5);
        jTextArea1.setText("El algoritmo se parece al algoritmo de ordenación por inserción. \nEn el algoritmo de inserción, cada elemento se compara con los elementos\ncontiguos de su izquierda de uno en uno, pero con el algoritmo de Shell \nla comparación se hace con intervalos mayores a uno, logrando con ello \nque la ordenación sea más rápida. \nGeneralmente se toma como intervalo inicial n div 2, siendo n la cantidad de \nelementos de la lista a ordenar, luego se reduce los intervalos a la mitad hasta\n que el intervalo llegue a ser uno.\nCuando la ordenación de la lista se hace con un intervalo de 1 el algoritmo se \ncomporta como el algoritmo de inserción, pero con la ventaja de que al tener \nuna lista casi ordenada, debido a los ordenamientos por intervalos \nanteriores, el ordenamiento se hará más rápido.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 560, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/poligonos-morado-hd-fondos.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}