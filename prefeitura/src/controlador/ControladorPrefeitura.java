/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.PrefeituraDao;
import javax.swing.JOptionPane;
import modelo.Prefeitura;
import tela.manutencao.ManutencaoPrefeitura;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrador
 */
public class ControladorPrefeitura {
   
public static void inserir(ManutencaoPrefeitura man){
        Prefeitura objeto = new Prefeitura();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setNrdefuncionarios(Integer.parseInt(man.jtfNrdefuncionarios.getText()));

        
        boolean resultado = PrefeituraDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
