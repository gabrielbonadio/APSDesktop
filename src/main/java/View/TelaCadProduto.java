/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProdutoDAO;
import Model.Produto;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class TelaCadProduto extends javax.swing.JFrame {

    ProdutoDAO produtoDAO;

    public TelaCadProduto() {
        initComponents();
        produtoDAO = new ProdutoDAO();
    }

    private void popularTalbela(List<Produto> listProdutos) {

        DefaultTableModel tableModel = (DefaultTableModel) jTableProduto.getModel();

        for (Produto p : listProdutos) {

            tableModel.addRow(makeTableRow(p));

        }

    }

    private Object[] makeTableRow(Produto produto) {
        Object dados[] = new Object[3];
        dados[0] = produto.getIdProduto();
        dados[1] = produto.getDescricao();
        dados[2] = produto.getPreco();

        return dados;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCadNome = new javax.swing.JTextField();
        jTextFieldCadPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonImagem = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButtonNovo.setText("Novo");
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(12, 50, 75, 23);

        jButtonSalvar.setText("Salvar");
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(12, 79, 75, 23);

        jButtonCancelar.setText("Cancelar");
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(12, 108, 75, 23);

        jButtonEditar.setText("Editar");
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(12, 137, 75, 23);

        jButtonExcluir.setText("Excluir");
        jPanel1.add(jButtonExcluir);
        jButtonExcluir.setBounds(12, 166, 75, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camiseta", "Tenis", "Blusa", " " }));

        jLabel4.setText("Preço :");

        jLabel2.setText("nome :");

        jTextCadNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCadNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Categoria :");

        jButtonImagem.setText("Imagem");
        jButtonImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCadPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonImagem)
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(97, 13, 459, 120);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar);
        jButtonBuscar.setBounds(12, 21, 75, 23);

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Descrição", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 150, 452, 200);

        jLabel5.setText("Produtos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 130, 60, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(32, 44, 568, 358);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(207, 11, 157, 22);

        setSize(new java.awt.Dimension(642, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCadNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCadNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCadNomeActionPerformed

    private void jButtonImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);

        File file = chooser.getSelectedFile();
        String fileName = file.getName();
        jLabelImagem.setText(fileName);
    }//GEN-LAST:event_jButtonImagemActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            List<Produto> todosProdutos = produtoDAO.getTodosProdutos();
            popularTalbela(todosProdutos);
            popularTalbela(todosProdutos);
            popularTalbela(todosProdutos);
            popularTalbela(todosProdutos);
            popularTalbela(todosProdutos);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImagem;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextCadNome;
    private javax.swing.JTextField jTextFieldCadPreco;
    // End of variables declaration//GEN-END:variables
}
