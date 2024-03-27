/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;

/**
 *
 * @author Angel
 */
public class Menu extends javax.swing.JFrame {

    SearchGuest searchGuest = new SearchGuest();
    SearchRes searchRes = new SearchRes();
    History history = new History();
    CheckIn checkIn = new CheckIn();
    CheckOut checkOut = new CheckOut();
    
    public Menu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        BAR = new javax.swing.JPanel();
        BTNSEARCHCLIENT = new javax.swing.JPanel();
        TXTSEARCHCLIENT = new javax.swing.JLabel();
        BTNSEARCHRESERVATION = new javax.swing.JPanel();
        TXTSEARCHRESERVATION = new javax.swing.JLabel();
        BTNROOMHISTORY = new javax.swing.JPanel();
        TXTROOMHISTORY = new javax.swing.JLabel();
        BTNCHECKIN = new javax.swing.JPanel();
        TXTCHECKIN = new javax.swing.JLabel();
        BTNCHECKOUT = new javax.swing.JPanel();
        TXTCHECKOUT = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        bed = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Title1Descript = new javax.swing.JLabel();
        im1 = new javax.swing.JLabel();
        im2 = new javax.swing.JLabel();
        im3 = new javax.swing.JLabel();
        authors = new javax.swing.JLabel();
        corner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGOOO.png"))); // NOI18N
        logo.setText(" ");
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 140));

        BAR.setBackground(new java.awt.Color(2, 199, 133));

        BTNSEARCHCLIENT.setBackground(new java.awt.Color(0, 67, 67));

        TXTSEARCHCLIENT.setBackground(new java.awt.Color(0, 0, 0));
        TXTSEARCHCLIENT.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        TXTSEARCHCLIENT.setForeground(new java.awt.Color(255, 255, 255));
        TXTSEARCHCLIENT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTSEARCHCLIENT.setText("Search Guest");
        TXTSEARCHCLIENT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXTSEARCHCLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTSEARCHCLIENTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTSEARCHCLIENTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTSEARCHCLIENTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNSEARCHCLIENTLayout = new javax.swing.GroupLayout(BTNSEARCHCLIENT);
        BTNSEARCHCLIENT.setLayout(BTNSEARCHCLIENTLayout);
        BTNSEARCHCLIENTLayout.setHorizontalGroup(
            BTNSEARCHCLIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNSEARCHCLIENTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXTSEARCHCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BTNSEARCHCLIENTLayout.setVerticalGroup(
            BTNSEARCHCLIENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTSEARCHCLIENT, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        BTNSEARCHRESERVATION.setBackground(new java.awt.Color(0, 67, 67));

        TXTSEARCHRESERVATION.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        TXTSEARCHRESERVATION.setForeground(new java.awt.Color(255, 255, 255));
        TXTSEARCHRESERVATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTSEARCHRESERVATION.setText("Search Reservation");
        TXTSEARCHRESERVATION.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXTSEARCHRESERVATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTSEARCHRESERVATIONMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTSEARCHRESERVATIONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTSEARCHRESERVATIONMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNSEARCHRESERVATIONLayout = new javax.swing.GroupLayout(BTNSEARCHRESERVATION);
        BTNSEARCHRESERVATION.setLayout(BTNSEARCHRESERVATIONLayout);
        BTNSEARCHRESERVATIONLayout.setHorizontalGroup(
            BTNSEARCHRESERVATIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNSEARCHRESERVATIONLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXTSEARCHRESERVATION, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BTNSEARCHRESERVATIONLayout.setVerticalGroup(
            BTNSEARCHRESERVATIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BTNSEARCHRESERVATIONLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXTSEARCHRESERVATION, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BTNROOMHISTORY.setBackground(new java.awt.Color(0, 67, 67));

        TXTROOMHISTORY.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        TXTROOMHISTORY.setForeground(new java.awt.Color(255, 255, 255));
        TXTROOMHISTORY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTROOMHISTORY.setText("Room History");
        TXTROOMHISTORY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXTROOMHISTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTROOMHISTORYMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTROOMHISTORYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTROOMHISTORYMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNROOMHISTORYLayout = new javax.swing.GroupLayout(BTNROOMHISTORY);
        BTNROOMHISTORY.setLayout(BTNROOMHISTORYLayout);
        BTNROOMHISTORYLayout.setHorizontalGroup(
            BTNROOMHISTORYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTROOMHISTORY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BTNROOMHISTORYLayout.setVerticalGroup(
            BTNROOMHISTORYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTROOMHISTORY, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        BTNCHECKIN.setBackground(new java.awt.Color(0, 67, 67));

        TXTCHECKIN.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        TXTCHECKIN.setForeground(new java.awt.Color(255, 255, 255));
        TXTCHECKIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTCHECKIN.setText("Check-In");
        TXTCHECKIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXTCHECKIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTCHECKINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTCHECKINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTCHECKINMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNCHECKINLayout = new javax.swing.GroupLayout(BTNCHECKIN);
        BTNCHECKIN.setLayout(BTNCHECKINLayout);
        BTNCHECKINLayout.setHorizontalGroup(
            BTNCHECKINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTCHECKIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BTNCHECKINLayout.setVerticalGroup(
            BTNCHECKINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTCHECKIN, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        BTNCHECKOUT.setBackground(new java.awt.Color(0, 67, 67));

        TXTCHECKOUT.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        TXTCHECKOUT.setForeground(new java.awt.Color(255, 255, 255));
        TXTCHECKOUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTCHECKOUT.setText("Check-Out");
        TXTCHECKOUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXTCHECKOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXTCHECKOUTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTCHECKOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTCHECKOUTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BTNCHECKOUTLayout = new javax.swing.GroupLayout(BTNCHECKOUT);
        BTNCHECKOUT.setLayout(BTNCHECKOUTLayout);
        BTNCHECKOUTLayout.setHorizontalGroup(
            BTNCHECKOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTCHECKOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BTNCHECKOUTLayout.setVerticalGroup(
            BTNCHECKOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXTCHECKOUT, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BARLayout = new javax.swing.GroupLayout(BAR);
        BAR.setLayout(BARLayout);
        BARLayout.setHorizontalGroup(
            BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BARLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTNCHECKOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNCHECKIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNROOMHISTORY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNSEARCHRESERVATION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNSEARCHCLIENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        BARLayout.setVerticalGroup(
            BARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BARLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BTNSEARCHCLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNSEARCHRESERVATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNROOMHISTORY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNCHECKIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNCHECKOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        bg.add(BAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 460));

        slogan.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        slogan.setForeground(new java.awt.Color(0, 51, 51));
        slogan.setText("Where luxury meets comfort, creating unforgettable moments.");
        bg.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        bed.setForeground(new java.awt.Color(255, 255, 255));
        bed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cama.png"))); // NOI18N
        bed.setText(" ");
        bg.add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, -1));

        Title1.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 102, 102));
        Title1.setText("Discover a new place");
        bg.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        Title1Descript.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Title1Descript.setForeground(new java.awt.Color(0, 0, 0));
        Title1Descript.setText("Explore our premier destinations and embark on a new adventure");
        bg.add(Title1Descript, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/im1enter.png"))); // NOI18N
        im1.setText(" ");
        im1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        im1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                im1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                im1MouseExited(evt);
            }
        });
        bg.add(im1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 200, 200));

        im2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/im2.png"))); // NOI18N
        im2.setText(" ");
        im2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(im2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 200, 200));

        im3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/im3.png"))); // NOI18N
        im3.setText(" ");
        im3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(im3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 200, 200));

        authors.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        authors.setForeground(new java.awt.Color(0, 0, 0));
        authors.setText("Made by: Santiago Del Castillo, Angel Garcia, Vicente Tralci.");
        bg.add(authors, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, -1, -1));

        corner.setText(" ");
        bg.add(corner, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 580, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTSEARCHCLIENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHCLIENTMouseEntered
        BTNSEARCHCLIENT.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_TXTSEARCHCLIENTMouseEntered

    private void TXTSEARCHCLIENTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHCLIENTMouseExited
        BTNSEARCHCLIENT.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_TXTSEARCHCLIENTMouseExited

    private void im1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_im1MouseEntered
        
    }//GEN-LAST:event_im1MouseEntered

    private void im1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_im1MouseExited
        
    }//GEN-LAST:event_im1MouseExited

    private void TXTSEARCHRESERVATIONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHRESERVATIONMouseEntered
        BTNSEARCHRESERVATION.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_TXTSEARCHRESERVATIONMouseEntered

    private void TXTSEARCHRESERVATIONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHRESERVATIONMouseExited
        BTNSEARCHRESERVATION.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_TXTSEARCHRESERVATIONMouseExited

    private void TXTROOMHISTORYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTROOMHISTORYMouseEntered
        BTNROOMHISTORY.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_TXTROOMHISTORYMouseEntered

    private void TXTROOMHISTORYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTROOMHISTORYMouseExited
        BTNROOMHISTORY.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_TXTROOMHISTORYMouseExited

    private void TXTCHECKINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKINMouseEntered
        BTNCHECKIN.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_TXTCHECKINMouseEntered

    private void TXTCHECKINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKINMouseExited
        BTNCHECKIN.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_TXTCHECKINMouseExited

    private void TXTCHECKOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKOUTMouseEntered
        BTNCHECKOUT.setBackground(new Color(0,160,133));
    }//GEN-LAST:event_TXTCHECKOUTMouseEntered

    private void TXTCHECKOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKOUTMouseExited
        BTNCHECKOUT.setBackground(new Color(0,67,67));
    }//GEN-LAST:event_TXTCHECKOUTMouseExited

    private void TXTSEARCHCLIENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHCLIENTMouseClicked
        searchGuest.setVisible(true);
    }//GEN-LAST:event_TXTSEARCHCLIENTMouseClicked

    private void TXTSEARCHRESERVATIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTSEARCHRESERVATIONMouseClicked
        searchRes.setVisible(true);
    }//GEN-LAST:event_TXTSEARCHRESERVATIONMouseClicked

    private void TXTROOMHISTORYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTROOMHISTORYMouseClicked
        history.setVisible(true);
    }//GEN-LAST:event_TXTROOMHISTORYMouseClicked

    private void TXTCHECKINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKINMouseClicked
        checkIn.setVisible(true);
    }//GEN-LAST:event_TXTCHECKINMouseClicked

    private void TXTCHECKOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCHECKOUTMouseClicked
        checkOut.setVisible(true);
    }//GEN-LAST:event_TXTCHECKOUTMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BAR;
    private javax.swing.JPanel BTNCHECKIN;
    private javax.swing.JPanel BTNCHECKOUT;
    private javax.swing.JPanel BTNROOMHISTORY;
    private javax.swing.JPanel BTNSEARCHCLIENT;
    private javax.swing.JPanel BTNSEARCHRESERVATION;
    private javax.swing.JLabel TXTCHECKIN;
    private javax.swing.JLabel TXTCHECKOUT;
    private javax.swing.JLabel TXTROOMHISTORY;
    private javax.swing.JLabel TXTSEARCHCLIENT;
    private javax.swing.JLabel TXTSEARCHRESERVATION;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title1Descript;
    private javax.swing.JLabel authors;
    private javax.swing.JLabel bed;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel corner;
    private javax.swing.JLabel im1;
    private javax.swing.JLabel im2;
    private javax.swing.JLabel im3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
