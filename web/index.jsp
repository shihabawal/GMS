<%-- 
    Document   : index
    Created on : Apr 4, 2017, 10:54:31 PM
    Author     : Shihab
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="database.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            MySQLDatabase db = new MySQLDatabase();
            String url = "jdbc:mysql://localhost:3306";
            String user = "shihab";
            String pass = "awalshihab";
            db.connectionDetails(url, user, pass);
            String query = "select * from sys.employee";
            Object table[][] = db.doQuery(query);
            int rows = table.length;
            int cols = table[0].length;
            System.out.println(rows + " " + cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(table[i][j] + " | ");
                }
                System.out.println();
            }
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    boolean t = true;
                    while (true) {
                        try {
                            MySQLDatabase db = new MySQLDatabase();
                            db.connectionDetails("jdbc:mysql://localhost:3306", "shihab", "awalshihab");

                            if (t) {
                                int res = db.doUpdate("UPDATE `sys`.`employee` SET `MID`='1' WHERE `ID`='1';");
                                //System.out.println(res + " 1");
                                t = false;
                            } else {
                                int res = db.doUpdate("UPDATE `sys`.`employee` SET `MID`=NULL WHERE `ID`='1';");
                                //System.out.println(res + " NULL");
                                t = true;
                            }

                            Thread.sleep(2500);
                        } catch (ClassNotFoundException ex) {
                        } catch (InterruptedException ex) {
                        } catch (SQLException ex) {
                        } catch (InstantiationException ex) {
                        } catch (IllegalAccessException ex) {
                        }
                    }
                }
            });
            t1.start();
        %>
        <p>
            <%=table[1][1]%>
        </p>
    </body>
</html>
