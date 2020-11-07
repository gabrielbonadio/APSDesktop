/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CategoriaDAO;
import Controller.ProdutoDAO;
import Model.Categoria;
import Model.Produto;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gabri
 */
public class TelaCadProduto extends javax.swing.JFrame {

    ProdutoDAO produtoDAO;
    CategoriaDAO categoriaDAO;
    Produto produto;

    public TelaCadProduto() {
        initComponents();
        produtoDAO = new ProdutoDAO();
        categoriaDAO = new CategoriaDAO();
        produto = new Produto();
        
        popularComboBox();

    }
    
    private void popularComboBox(){
        
        try {
            List<Categoria> todasCategorias = categoriaDAO.getTodasCategorias();
        
            todasCategorias.forEach((cat)->jComboBoxCategoria.addItem(cat));
            
        } catch (Exception ex) {
            Logger.getLogger(TelaCadProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popularTabela(List<Produto> listProdutos) {

        DefaultTableModel tableModel = (DefaultTableModel) jTableProduto.getModel();
   
        tableModel.setRowCount(0);

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
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
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
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(10, 50, 90, 30);

        jButtonCancelar.setText("Cancelar");
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(10, 80, 90, 30);

        jButtonEditar.setText("Editar");
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(10, 110, 90, 30);

        jButtonExcluir.setText("Excluir");
        jPanel1.add(jButtonExcluir);
        jButtonExcluir.setBounds(10, 140, 90, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel4.setText("Preço :");

        jLabel2.setText("Nome :");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCadPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonImagem)
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 10, 459, 120);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar);
        jButtonBuscar.setBounds(10, 20, 90, 30);

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
        jScrollPane1.setBounds(120, 160, 460, 200);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Produtos");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 140, 60, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(11, 44, 600, 380);

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
        produto.setImg(encodeFileToBase64(file));
   
    }//GEN-LAST:event_jButtonImagemActionPerformed
        private static String encodeFileToBase64(File file) {
    try {
        byte[] fileContent = Files.readAllBytes(file.toPath());
        return Base64.getEncoder().encodeToString(fileContent);
    } catch (IOException e) {
        throw new IllegalStateException("could not read file " + file, e);
    }
}
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
            atualizaTabela();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    
    private void atualizaTabela(){
        
        List<Produto> todosProdutos;
        try {
            todosProdutos = produtoDAO.getTodosProdutos();
            popularTabela(todosProdutos);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        produto.setDescricao(jTextCadNome.getText());
        produto.setPreco(Double.parseDouble(jTextFieldCadPreco.getText()));
        
        Categoria categoria = (Categoria)jComboBoxCategoria.getSelectedItem();
        produto.setIdCategoria(categoria.getIdCategoria());
        
        try {
            produtoDAO.novoProduto(produto);
            atualizaTabela();
            
        } catch (Exception ex) {
            Logger.getLogger(TelaCadProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

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
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
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
