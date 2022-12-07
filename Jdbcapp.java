
import java.sql.*;
import java.util.Scanner;
class UtilData
{
    public static Connection getJdbcConnection() throws SQLException
    {
        //Resource used in jdbc
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        //establishing the connection.
        String url="jdbc:mysql://localhost:3306/inventory";
        String userName="root";
        String password="RvDB@202211";
            connection=DriverManager.getConnection(url,userName,password);
            if(connection!=null)
            {
                return connection;
            }
        return connection;
    }
    public static void closeConnection(ResultSet resultSet,PreparedStatement preparedStatement,Connection connection) throws SQLException {
            if(resultSet!=null)
            {
                resultSet.close();
            }
            if(preparedStatement!=null)
            {
                preparedStatement.close();
            }
            if(connection!=null)
            {
                connection.close();
            }
            System.out.println("ALL USED RESOURCES ARE CLOSED ");
    }
}
public class Jdbcapp extends UtilData
{
    public static void main(String[] args) throws Exception {
            main_menu();
    }
    public static void main_menu() throws Exception {
        int mainMenuSelection;
        Scanner scanner=new Scanner((System.in));
        System.out.println("\t  WELCOME TO THE DATABASE\n");
        System.out.println("\tPRESS 1 TO READ THE DATA.");
        System.out.println("\tPRESS 2 TO ADD THE  DATA.");
        System.out.println("\tPRESS 3 TO UPDATE THE DATA.");
        System.out.println("\tPRESS 4 TO DELETE THE DATA.");
        mainMenuSelection=scanner.nextInt();
        switch (mainMenuSelection)
        {
            case 1:
            {
                readData();
                break;
            }
            case 2:
            {
                addData();
                break;
            }
            case 3:
            {
                updateData();
                break;
            }
            case 4:
            {
                deleteData();
                break;
            }
        }
    }
    public static void readData()throws Exception
    {
            Connection connection=null;
            PreparedStatement preparedStatement=null;
            ResultSet resultSet=null;
            String selectSqlQuery="select SNAME,SAGE from student where Sid=?";

            try
            {
                connection= UtilData.getJdbcConnection();
                if(connection!=null) {
                    //2.Creating statement object to communication with the database.
                    preparedStatement= connection.prepareStatement(selectSqlQuery);
                    if(preparedStatement!=null)
                    {
                        String executeSqlQuery ="select SID,SNAME,SAGE from student ";
                        //3.using statement object to execute query
                        resultSet= preparedStatement.executeQuery(executeSqlQuery);
                        if(resultSet!=null)
                        {
                            //4.processing the resultset object
                            while(resultSet.next())
                            {
                                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3));
                            }
                        }
                    }
                }
            }
            catch(SQLException S)
            {
                S.printStackTrace();
            }
            catch (Exception E)
            {
                E.printStackTrace();
            }
            finally {
                UtilData.closeConnection(resultSet,preparedStatement,connection);
            }
    }
    public static void addData() throws SQLException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        //CREATING SCANNER OVJECT TO GET INPUT FROM USER.
          Scanner scanner=new Scanner(System.in);
        System.out.println("GIVE THE NAME NEED TO ADD :");
        String addName=scanner.nextLine();
        System.out.println("GIVE THE AGE NEED TO ADD :");
        int addAge=scanner.nextInt();

        String insertSqlQuery= "insert into student (SNAME,SAGE)values (?,?)";
        try
        {
            connection=UtilData.getJdbcConnection();
            if(connection!=null)
            {
                preparedStatement=connection.prepareStatement(insertSqlQuery);
                if(preparedStatement!=null)
                {
                    preparedStatement.setString(1,addName);
                    preparedStatement.setInt(2,addAge);
                    int noOfRows=preparedStatement.executeUpdate();
                    System.out.println("NO OF ROWS ADDED : "+noOfRows);
                }
            }
        }
        catch (SQLException S)
        {
            S.printStackTrace();
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
        finally
        {
            UtilData.closeConnection(null,preparedStatement,connection);
            if(scanner!=null)
            {
                scanner.close();
            }
        }
    }
    public static void updateData() throws SQLException {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE SID :");
        int sid=scanner.nextInt();
        System.out.println("ENTER THE NAME :");
        String sname=scanner.nextLine();
        String updateSqlQuery="update student set SAGE=? where SID=?";
        connection=UtilData.getJdbcConnection();
        if(connection!=null)
        {
            preparedStatement=connection.prepareStatement(updateSqlQuery);
            if(preparedStatement!=null)
            {
                preparedStatement.setInt(1,sid);
                preparedStatement.setString(2,sname);
                int noOfRows=preparedStatement.executeUpdate();
                System.out.println("NO OF ROWS UPDATED :"+noOfRows);
            }
        }
    }
    public static void deleteData () throws SQLException
    {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String deleteSqlQuery="delete from student where SID=?";
        //CREATING SCANNER OBJECT TO GET INPUT FROM USER.
        Scanner scanner=new Scanner(System.in);
        System.out.println("GIVE THE SID NEED TO DELETE :");
         int sid=scanner.nextInt();
        //Establishing the connection.
       try
       {
           connection=UtilData.getJdbcConnection();
           if(connection!=null)
           {
               preparedStatement=connection.prepareStatement(deleteSqlQuery);
               if(preparedStatement!=null)
               {
                   preparedStatement.setInt(1,sid);
                   int noOfRows=preparedStatement.executeUpdate();
                   System.out.println("NO OF ROWS DELETED : "+noOfRows);
               }
           }
       }
       catch (SQLException S)
       {
           S.printStackTrace();
       }
       catch(Exception E)
       {
           E.printStackTrace();
       }
       finally {
           UtilData.closeConnection(null,preparedStatement,connection);
           if(scanner!=null)
           {
               scanner.close();
           }
       }

    }
}


