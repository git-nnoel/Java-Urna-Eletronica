package javaapplication1;

import java.sql.Connection;
 
import java.sql.DriverManager;
import java.sql.ResultSet;
 
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class MainSystem {
    
    public int[] cod = new int[3];
    public boolean ValidVote = false;
    public int[] votos = new int[6];
    
    public void MainSystem(){
        //DB candidatos está em:
        //nomecandidato (string), numeleitoral (int), numvotos (int), cargo(string), idade(tinyint)
        //valores válidos para numeleitoral:
        // 787, 112, 892 || 456, 222, 955
        
        //recebe total de votos
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
  
            Connection con=DriverManager.getConnection(  
            "","","");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from candidato");
            
            int i = 0;
            while(rs.next()){
                this.votos[i] = Integer.parseInt(rs.getString(3));
                i++;
            }
            for (int j = 0; j < 6; j++)
                System.out.print(votos[j] + ", ");
            con.close();  
        }catch(Exception e){ System.out.println(e);}
        
        //converte array do candidato para uma string, e depois para um int
        String codString = "";
        for(int i = 0; i<3; i++){
        codString = codString + Integer.toString(this.cod[i]);
        }
        int codInt = Integer.parseInt(codString);
        System.out.println(codInt);
        
        
        //verifica se o candidato existe
        try{
            PreparedStatement statement, statvotes ,statupdate;
            Class.forName("com.mysql.cj.jdbc.Driver");
  
            Connection con=DriverManager.getConnection(  
            "","",""); 
            
            statement = con.prepareStatement("select * from candidato where numeleitoral = ?");
            statement.setInt(1, codInt);
            statvotes = con.prepareStatement("select numvotos from candidato where numeleitoral = ?");
            statvotes.setInt(1, codInt);
            statupdate = con.prepareStatement("update candidato set numvotos = ? where numeleitoral = ?");
            statupdate.setInt(2, codInt);
            
            ResultSet rs = statement.executeQuery();
            System.out.println("1");
            
 
           
//            Statement stmt=con.createStatement();  
//            ResultSet rs=stmt.executeQuery("select * from candidato where numeleitoral = ?");
            
            if (rs.next() == false) {
                System.out.println("Candidato 1 não registrado");
            } else {

                do {
                    ResultSet rss = statvotes.executeQuery();
                    System.out.println("2");
                    
                    
                    int VotosUpdate = 0;
                    while(rss.next())
                    VotosUpdate = rss.getInt(1) + 1;
                    System.out.println("VotosUpdate:" + VotosUpdate);
                    
                    statupdate.setInt(1, VotosUpdate);
                    statupdate.executeUpdate();
                    System.out.println("3");
                    
                } while (rs.next());
            }
            con.close();  
        }catch(ClassNotFoundException | SQLException e){ System.out.println(e);}
        
    }
    
    public void SetCod(int botao) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(  
                "","","")) {
            PreparedStatement stmt;
            stmt = con.prepareStatement("select * from candidato where numeleitoral = ?");
            
            for(int i = 0; i < 3; i++){
            
            if (this.cod[i] == 0){
            this.cod[i] = botao;
            i = 3;
            }
        
            }
            if (this.cod[2] != 0){
            // mostra o voto
                this.ValidVote = true;
                String codString = "";
                for(int i = 0; i<3; i++){
                    codString = codString + Integer.toString(this.cod[i]);
                }
                int codInt = Integer.parseInt(codString);
                System.out.println("COD p INT: " + codInt);
                stmt.setInt(1, codInt);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    System.out.println("PASSO 2 PARA: " + codInt);
                    String nomecandidato = rs.getString("nomecandidato");
                    String idade = Integer.toString(rs.getInt("idade"));
                    String numeleitoral = Integer.toString(rs.getInt("numeleitoral"));
                    String cargo = rs.getString("cargo");
                    
                    String img = numeleitoral + ".png";
                    
                    if("Presidente".equals(cargo)){
                    System.out.println("PASSO 3.1 PARA: " + codInt);
                    PrimeiroCargo PC = new PrimeiroCargo();
                    PC.setInfo(nomecandidato, idade, img);
                    }
                    else if("Vice-Presidente".equals(cargo)){
                    System.out.println("PASSO 3.2 PARA: " + codInt);
                    SegundoCargo SC = new SegundoCargo();
                    SC.setInfo(nomecandidato, idade, img);
                    }
                
                System.out.println("PASSO 4 PARA: " + codInt);
                    
                    
                }
                
            
            }
            con.close();  
        }
    }
    
    public void AddVote(){
        if (this.ValidVote){
            //fazer query para verificar se o candidato está cadastrado
            //se sim adiciona o voto
            MainSystem();
            
        
            new SegundoCargo().setVisible(true);
            this.ValidVote = false;
            ClearVote();
        }
        else{
            JOptionPane.showMessageDialog(null, "Candidato Inválido");
            ClearVote();
            new PrimeiroCargo().setVisible(true);
        }
    }
    
    public void AddVote2() throws SQLException, ClassNotFoundException{
        if (this.ValidVote){
            //fazer query para verificar se o candidato está cadastrado (vice)
            //se sim adiciona o voto (vice)
            MainSystem();
            
            
            new TelaContagem().setVisible(true);
            this.ValidVote = false;
            ClearVote();
        }
        else{
            JOptionPane.showMessageDialog(null, "Candidato Inválido");
            ClearVote();
            new SegundoCargo().setVisible(true);
        }
    }
    
    public void ClearVote(){
        this.cod[0] = 0;
        this.cod[1] = 0;
        this.cod[2] = 0;
        this.ValidVote = false;
    }
    
    public void VotoBranco(){
        //query para voto branco
        this.ValidVote = false;
        ClearVote();
    }

    public String getDias() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Dias'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }

    public String getMarcelo() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Marcelo'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }

    public String getTavarel() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Tavarel'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }

    public String getArmael() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Armael'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }

    public String getDonny() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Donny'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }

    public String getEduardo() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
  
        Connection con=DriverManager.getConnection(  
        "","","");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from candidato where nomecandidato = 'Eduardo'");
            
        String str = "";
        while(rs.next())
            str = rs.getString(3);
        con.close();
            
        return str;
    }
    
    
}
