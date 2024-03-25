/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import hotelbookingsystem.Hotel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Santiago
 */
public class SearchGuest extends javax.swing.JFrame {
    Hotel hotel = new Hotel();
    /**
     * Creates new form SearchGuest
     */
    public SearchGuest() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgsearchg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sgtitle = new javax.swing.JLabel();
        sgsubtitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        auxL = new javax.swing.JTextField();
        backbtn = new javax.swing.JPanel();
        backtxt = new javax.swing.JLabel();
        searchgbtn = new javax.swing.JPanel();
        searchgtxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        glastname = new javax.swing.JTextField();
        gfirstname1 = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgsearchg.setBackground(new java.awt.Color(255, 255, 255));
        bgsearchg.setForeground(new java.awt.Color(102, 102, 102));
        bgsearchg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGOOO.png"))); // NOI18N
        bgsearchg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 140));

        jPanel1.setBackground(new java.awt.Color(0, 67, 67));

        sgtitle.setBackground(new java.awt.Color(255, 255, 255));
        sgtitle.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        sgtitle.setForeground(new java.awt.Color(255, 255, 255));
        sgtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sgtitle.setText("SEARCH GUEST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sgtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sgtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgsearchg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, 140));

        sgsubtitle.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        sgsubtitle.setForeground(new java.awt.Color(0, 102, 102));
        sgsubtitle.setText("SEARCH:");
        bgsearchg.add(sgsubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bgsearchg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 10));

        auxL.setBackground(new java.awt.Color(255, 255, 255));
        auxL.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        auxL.setForeground(new java.awt.Color(204, 204, 204));
        auxL.setBorder(null);
        auxL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                auxLMouseClicked(evt);
            }
        });
        auxL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auxLActionPerformed(evt);
            }
        });
        auxL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                auxLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                auxLKeyTyped(evt);
            }
        });
        bgsearchg.add(auxL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 10, -1));

        backbtn.setBackground(new java.awt.Color(0, 67, 67));

        backtxt.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        backtxt.setForeground(new java.awt.Color(255, 255, 255));
        backtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backtxt.setText("BACK");
        backtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backbtnLayout = new javax.swing.GroupLayout(backbtn);
        backbtn.setLayout(backbtnLayout);
        backbtnLayout.setHorizontalGroup(
            backbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backbtnLayout.setVerticalGroup(
            backbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgsearchg.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 130, 40));

        searchgbtn.setBackground(new java.awt.Color(0, 67, 67));

        searchgtxt.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        searchgtxt.setForeground(new java.awt.Color(255, 255, 255));
        searchgtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchgtxt.setText("SEARCH");
        searchgtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchgtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchgtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchgtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchgtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout searchgbtnLayout = new javax.swing.GroupLayout(searchgbtn);
        searchgbtn.setLayout(searchgbtnLayout);
        searchgbtnLayout.setHorizontalGroup(
            searchgbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchgtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchgbtnLayout.setVerticalGroup(
            searchgbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchgtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgsearchg.add(searchgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 130, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bgsearchg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 240, 10));

        glastname.setBackground(new java.awt.Color(255, 255, 255));
        glastname.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        glastname.setForeground(new java.awt.Color(0, 0, 0));
        glastname.setText("Enter the last name");
        glastname.setBorder(null);
        glastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                glastnameMouseClicked(evt);
            }
        });
        glastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glastnameActionPerformed(evt);
            }
        });
        glastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                glastnameKeyPressed(evt);
            }
        });
        bgsearchg.add(glastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 240, 50));

        gfirstname1.setBackground(new java.awt.Color(255, 255, 255));
        gfirstname1.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        gfirstname1.setForeground(new java.awt.Color(0, 0, 0));
        gfirstname1.setText("Enter the first name");
        gfirstname1.setBorder(null);
        gfirstname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gfirstname1MouseClicked(evt);
            }
        });
        gfirstname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gfirstname1ActionPerformed(evt);
            }
        });
        gfirstname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gfirstname1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gfirstname1KeyTyped(evt);
            }
        });
        bgsearchg.add(gfirstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 50));

        roomLabel.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(0, 102, 102));
        bgsearchg.add(roomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 540, 40));

        getContentPane().add(bgsearchg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auxLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auxLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auxLActionPerformed

    private void backtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtxtMouseClicked
        this.setVisible(false); 
        gfirstname1.setText("Enter the first name");
        glastname.setText("Enter the last name");
        roomLabel.setText("");
    }//GEN-LAST:event_backtxtMouseClicked

    private void backtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtxtMouseEntered
        backbtn.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_backtxtMouseEntered

    private void backtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtxtMouseExited
        backbtn.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_backtxtMouseExited

    private void searchgtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchgtxtMouseEntered
        searchgbtn.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_searchgtxtMouseEntered

    private void searchgtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchgtxtMouseExited
        searchgbtn.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_searchgtxtMouseExited

    private void searchgtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchgtxtMouseClicked
        String name = gfirstname1.getText();
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String lastName = glastname.getText();
        String capitalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        
        String roomID = hotel.checkGuest(capitalizedName, capitalizedLastName);
        if (roomID == null) {
            JOptionPane.showMessageDialog(null, "Guest not found");
        } else {
            roomLabel.setText("Room: "+roomID);
        }
        gfirstname1.setText("Enter the first name");
        glastname.setText("Enter the last name");
    }//GEN-LAST:event_searchgtxtMouseClicked

    private void auxLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_auxLMouseClicked
        
    }//GEN-LAST:event_auxLMouseClicked

    private void glastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glastnameActionPerformed
        
    }//GEN-LAST:event_glastnameActionPerformed

    private void glastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glastnameMouseClicked
       glastname.setText("");
    }//GEN-LAST:event_glastnameMouseClicked

    private void auxLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxLKeyPressed
        
    }//GEN-LAST:event_auxLKeyPressed

    private void glastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_glastnameKeyPressed
        
    }//GEN-LAST:event_glastnameKeyPressed

    private void auxLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxLKeyTyped
        
    }//GEN-LAST:event_auxLKeyTyped

    private void gfirstname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gfirstname1MouseClicked
        gfirstname1.setText("");
    }//GEN-LAST:event_gfirstname1MouseClicked

    private void gfirstname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gfirstname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gfirstname1ActionPerformed

    private void gfirstname1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfirstname1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gfirstname1KeyPressed

    private void gfirstname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gfirstname1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_gfirstname1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchGuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auxL;
    private javax.swing.JPanel backbtn;
    private javax.swing.JLabel backtxt;
    private javax.swing.JPanel bgsearchg;
    private javax.swing.JTextField gfirstname1;
    private javax.swing.JTextField glastname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JPanel searchgbtn;
    private javax.swing.JLabel searchgtxt;
    private javax.swing.JLabel sgsubtitle;
    private javax.swing.JLabel sgtitle;
    // End of variables declaration//GEN-END:variables
}
