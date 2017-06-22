<%@page import="SystemLogic.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <link rel="stylesheet" type = "text/css" href="garbagehomepage.css"/>


    <head>

        <meta name="viewport" content="width=device-width">
        <title>Garbage monitoring system | Login</title>



    </head>

    <body>

        <header> 
            <div class="container"> <div id="branding"> 
                    <h1><span class = "highlight">  Array</span> of Programmers</h1>

                </div>
                <nav id="navmenu"> <ul>
                        <li> <a href="garbagehomepage.jsp"> home</a> </li>
                        <li class = "current"> <a href="login.jsp"> login</a> 
                            <ul> 
                                <li> <a href="login.jsp">Employee Login</a> </li>
                                <li>  <a href="loginmanager.jsp">Manager Login</a></li>

                            </ul>
                        </li>
                    </ul> </nav>

            </div> 
        </header>

        <section id="showcase"> 
            <div>

                <form action="moreInfo.jsp">
                    <h1>Garbage Monitoring System</h1>
                    <p id='para1'> The system we have designed is one that performs garbage monitoring at an extensive scale. It  employs  sensors  within  multiple  garbage  disposals  and  collects  information  regarding  the occupancy  of  the  garbage  bin.  Occupancy  is  divided  into  three  sections:  low,  moderate  and high</p>
                    <button type="info" class ="button1"> <span >More Info</span> </button>
                </form>

            </div>

        </section>

        <section class="container2">
            <div class="login">
                <h1>Login to Your Account</h1>
                <h2>Manager</h2>
                <%
              System.out.println(request.getMethod());
              if (request.getMethod()=="POST"){
                  Employee e = new Employee();
                  String user = request.getParameter("user");
                  String pass = request.getParameter("pass");
                  if(e.login(user,pass))
                      response.sendRedirect("empPage.jsp");
                  else
                      out.write("<p>Please Enter correct credentials</p>");
              }
                %>
                <form method="post">
                    <p><input type="text" name="user" value="" placeholder="Username or Email"></p>
                    <p><input type="password" name="pass" value="" placeholder="Password"></p>
                    <p class="remember_me">
                        <label>
                            <input type="checkbox" name="remember_me" id="remember_me">
                            Remember me on this computer
                        </label>
                    </p>
                    <p class="submit"><input type="submit" name="loginBtn" value="Login"></p>
                </form>
            </div>

            <div class="login-help">
                <p>Forgot your password? <a href="index.jsp">Click here to reset it</a>.</p>
            </div>
        </section>

    </body>
</html>




