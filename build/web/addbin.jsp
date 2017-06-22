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
                        <li> <a href="empPage.jsp"> home</a> </li>

                        <li class = "current"> <a href="empPage.jsp"> Manage Garbage Bin</a> 
                            <ul> 




                                <li> <a href="addbin.jsp">add garbage bin</a> </li>
                                <li>  <a href="deletebin.jsp">delete garbage bin</a></li>
                                <li>  <a href="editbin.jsp">edit garbage bin</a></li>
                                <li>  <a href="notification.jsp">notifications</a></li>
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
            <aside id="desc"><h3>Add a Garbage Bin </h3> </aside>

            <div id ="addbin">

                <form  method="POST">
                    <fieldset  >
                        <legend>Garbage Bin Information :</legend>
                        <%
                            if (request.getMethod()=="POST"){
                                GarbageBin g = new GarbageBin();
                                g.setID(Integer.parseInt(request.getParameter("id")));
                                g.setEmirate(request.getParameter("emirate"));
                                g.setArea(request.getParameter("area"));
                                g.setLng(Double.parseDouble(request.getParameter("lng")));
                                g.setLat(Double.parseDouble(request.getParameter("lat")));
                                g.setPercentage(0.0);
                                if(g.insertBin())
                                    out.write("<p>Inserted successfully</p>");
                                else
                                    out.write("<p>Failed</p>");
                            }
                        %>
                        Bin ID:<br>
                        <input type="text" name="id" value="5">
                        <br>
                        Emirate:<br>
                        <input type="text" name="emirate" value="Sharjah">
                        <br>

                        Area:<br>
                        <input type="text" name="area" value="University City">
                        <br>

                        Latitude:<br>
                        <input type="text" name="lat" value="52.32223">
                        <br>
                        
                        Longitude:<br>
                        <input type="text" name="lng" value="25.32233">
                        <br>
                        <input type="submit" value="Submit">
                    </fieldset>
                </form>
            </div>

        </section>






    </body>
</html>