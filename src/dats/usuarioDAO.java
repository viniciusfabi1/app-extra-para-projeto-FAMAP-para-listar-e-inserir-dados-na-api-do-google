
package dats;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.registroassalto;
import dats.datasource;
import java.sql.Connection;
import modelo.registroassaltoarmado;
import modelo.registrofurto;
import modelo.registroroubocarro;
import modelo.registrorouboestabelecimento;
import modelo.registrotraficointenso;
import modelo.registromapa;

public class usuarioDAO{
    public Connection connection;
    
    public usuarioDAO(){
        this.connection = new datasource().getConnection();
    }
    public ArrayList<registroassalto> readAll(){
        try{
            
            String sql = "Select * FROM registroassalto";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registroassalto> lista = new ArrayList<registroassalto>();
            
            while(rs.next()){                    
                
            registroassalto us = new registroassalto();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               lista.add(us);
            }
            ps.close();
            return lista;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ArrayList<registroassaltoarmado>readALL(){
        try{
            
            String sql = "Select * FROM registroassaltoarmado";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registroassaltoarmado> listaassaltoarmado = new ArrayList<registroassaltoarmado>();
            
            while(rs.next()){                    
                
            registroassaltoarmado us = new registroassaltoarmado();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               listaassaltoarmado.add(us);
            }
            ps.close();
            return listaassaltoarmado;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;
    }
    public ArrayList<registrofurto>readALl(){
        try{
            
            String sql = "Select * FROM registrofurto";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registrofurto> listafurto = new ArrayList<registrofurto>();
            
            while(rs.next()){                    
                
            registrofurto us = new registrofurto();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               listafurto.add(us);
            }
            ps.close();
            return listafurto;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;
    }
    public ArrayList<registroroubocarro> readA(){
        try{
            
            String sql = "Select * FROM registroroubocarro";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registroroubocarro> listaroubocarro = new ArrayList<registroroubocarro>();
            
            while(rs.next()){                    
                
            registroroubocarro us = new registroroubocarro();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               listaroubocarro.add(us);
            }
            ps.close();
            return listaroubocarro;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;
    }
    public ArrayList<registrorouboestabelecimento> read(){
        try{
            
            String sql = "Select * FROM registrorouboestabelecimento";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registrorouboestabelecimento> listarouboestabelecimento = new ArrayList<registrorouboestabelecimento>();
            
            while(rs.next()){                    
                
            registrorouboestabelecimento us = new registrorouboestabelecimento();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               listarouboestabelecimento.add(us);
            }
            ps.close();
            return listarouboestabelecimento;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;
    }
    public ArrayList<registrotraficointenso> readt(){
        try{
            
            String sql = "Select * FROM registrotraficointenso";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<registrotraficointenso> listatraficointenso = new ArrayList<registrotraficointenso>();
            
            while(rs.next()){                    
                
            registrotraficointenso us = new registrotraficointenso();
            us.setDenuncia(rs.getString("denuncia"));
            us.setNome(rs.getString("nome"));
            us.setDat(rs.getDate("dat"));                   
            us.setEmail(rs.getString("email"));
            us.setBairro(rs.getString("bairro"));
            us.setCep(rs.getInt("cep"));
            us.setRua(rs.getString("rua"));
            us.setPriority(rs.getString("priority"));        
            us.setMensagem(rs.getString("mensagem"));
               listatraficointenso.add(us);
            }
            ps.close();
            return listatraficointenso;
            
        }
        
        catch(SQLException ex){
            System.err.println("Erro ao recuperar"+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        return null;

    }
    public void adiciona(registromapa usuario){ 
        try {
            String sql = "INSERT INTO markers(name,address,lat,lng,type) VALUES(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, usuario.getName());
            ps.setString(2, usuario.getAddress());
            ps.setString(3, usuario.getLat());
            ps.setString(4, usuario.getLng());
            ps.setString(5, usuario.getType());

            ps.execute();
            ps.close();
        } 
         catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    } 
}
