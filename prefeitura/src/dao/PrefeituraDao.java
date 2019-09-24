/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Prefeitura;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrador
 */
public class PrefeituraDao {
     public static boolean inserir(Prefeitura objeto) {
        String sql = "INSERT INTO prefeitura ( codigo, nome, endereco, nrdefuncionarios) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            
            ps.setInt(1, objeto.getCodigo());
            ps.setString(2, objeto.getNome());
            ps.setString(3, objeto.getEndereco());
            ps.setInt(4, objeto.getNrdefuncionarios());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
     public static void main(String[] args) {
        Prefeitura objeto = new Prefeitura();
        objeto.setCodigo(1);
        objeto.setNome("PM Espumoso");
        objeto.setEndereco("Espumoso/RS");                
        objeto.setNrdefuncionarios(1);

        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
     public static List<Prefeitura> consultar() {
        List<Prefeitura> resultados = new ArrayList<>();
        //editar o SQL conforme a entidade
        String sql = "SELECT codigo, nome, endereco, nrdefuncionarios FROM prefeitura";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prefeitura objeto = new Prefeitura();
                //definir um set para cada atributo da entidade, cuidado com o tipo
                objeto.setCodigo(rs.getInt("CÓDIGO"));
                objeto.setNome(rs.getString("NOME"));
                objeto.setEndereco(rs.getString("ENDEREÇO"));
                objeto.setNrdefuncionarios(rs.getInt("FUNCIONÁRIOS"));

                
                resultados.add(objeto);//não mexa nesse, ele adiciona o objeto na lista
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
}
}
