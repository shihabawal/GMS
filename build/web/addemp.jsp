<%@page import="SystemLogic.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <link rel="stylesheet" type = "text/css" href="garbagehomepage.css"/>


    <head>

        <meta name="viewport" content="width=device-width">
        <title>Garbage monitoring system | welcome to the homepage</title>



    </head>
    <body>

        <header> 
            <div class="container"> <div id="branding"> 
                    <h1><span class = "highlight">  Array</span> of Programmers</h1>

                </div>


                <nav id="navmenu"> 
                    <ul>
                        <li> <a href="mgrpage.jsp"> home</a> </li>

                        <li class = "current"> <a href="mgrpage.jsp"> Manage Employee</a> 
                            <ul> 
                                <li> <a href="addemp.jsp">add an  Employee</a> </li>
                                <li>  <a href="deleteemp.jsp">delete an  Employee</a></li>
                                <li>  <a href="editemp.jsp">edit an  Employee</a></li>
                            </ul>
                        </li>

                        <li > <a href="index.jsp"> logout</a> </li>



                    </ul>

                </nav>

            </div> 
        </header>

        <section id="showcase"> 
            <div>

                <form action="moreInfo.jsp">
                    <h1>Garbage Monitoring System</h1>
                    <p id="para1"> The system we have designed is one that performs garbage monitoring at an extensive scale. It  employs  sensors  within  multiple  garbage  disposals  and  collects  information  regarding  the occupancy  of  the  garbage  bin.  Occupancy  is  divided  into  three  sections:  low,  moderate  and high</p>
                    <button  type="info" class ="button1"> <span >More Info</span> </button>
                </form>

            </div>

        </section>

        <section id="container">
            <div class ="container">
                <h1>Search for a Garbage Bin</h1>
                <form>
                    <input type="garbage" placeholder ="Enter Bin ID...">
                    <button type="submit" class ="button2"> Submit </button>
                </form>
            </div>
        </section>

        <section id="description"> 
            <aside id="desc"><h3>Add an Employee </h3> </aside>

            <div id ="addbin">

                <form  method="POST">
                    <fieldset  >
                        <legend>Employee Information :</legend>
                        <%
                            if (request.getMethod()=="POST"){
                                Manager g = new Manager();
                                g.setID(Integer.parseInt(request.getParameter("id")));
                                 g.setFname(request.getParameter("fname"));
                                g.setLname(request.getParameter("lname"));
                                g.setPassword(request.getParameter("pass"));
                                g.setEmail(request.getParameter("email"));
                                g.setCountry(request.getParameter("cont"));
                                g.setMID(Integer.parseInt(request.getParameter("mid")));
                                if(g.insertEmp())
                                    out.write("<p>Inserted successfully</p>");
                                else
                                    out.write("<p>Failed</p>");
                            }
                        %>

                        Employee ID:<br>
                        <input type="text" name="id" value="5">
                        <br>
                        Employee First Name:<br>
                        <input type="text" name="fname" value="bashayer">
                        <br>
                        Employee Last Name:<br>
                        <input type="text" name="lname" value="alshehhi">
                        <br>
                        Email :<br>
                        <input type="text" name="email" value="bashayer@gmail.com">
                        <br>

                        Country:<br>
                        <input type="text" name="cont" value="United Arab Emirates">
                        <br>

                        Password :<br>
                        <input type="password" name="pass" value="bashayer<3">
                        <br>
                        
                        Manager ID :<br>
                        <input type="text" name="mid" value="3">
                        <br>
                        <input type="submit" value="Submit">
                    </fieldset>
                </form>
            </div>

        </section>






    </body>
</html>