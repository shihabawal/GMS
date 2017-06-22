<%@page import="SystemLogic.*"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <link rel="stylesheet" type = "text/css" href="garbagehomepage.css"/>


    <head>

        <meta name="viewport" content="width=device-width">
        <title>Garbage monitoring system | welcome to the homepage</title>
        <style>
            #map {
                height: 400px;
                width: 100%;
            }

        </style>


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

                        <li > <a href="login.jsp"> logout</a> </li>

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

                </form>
            </div>

        </section>


        <section id="description"> 
            <aside id="desc"><h3>Full Garbage Bins </h3> </aside>
            <table id="table1">
                <tr><th>Bin ID: </th> 
                    <th>Emirate: </th>
                    <th>Area: </th> 
                    <th>Status: </th>
                </tr>

                <%
                    GarbageBin g = new GarbageBin();
                    Object[][] bins = g.viewFullBins();
                    if (bins.length != 0) {
                        for (int i = 0; i < bins.length; i++) {
                            out.write("<tr><td>" + ((Integer) bins[i][0]).toString() + "</td>");
                            out.write("<td>" + bins[i][1] + "</td>");
                            out.write("<td>" + bins[i][2] + "</td>");
                            out.write("<td>" + ((Double) bins[i][5]).toString() + "</td></tr>");
                        }
                    }
                %>

                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>

        </section>
        <br><br><br><br><br>
        <section>
            <h3>Google Map View</h3>
            <div id="map"></div>
            <script>
                function initMap() {
                    var map = new google.maps.Map(document.getElementById('map'), {
                        zoom: 12,
                        center: {lat: 25.336244, lng: 55.478712}
                    });
                    var marker;
                    <%for (int i = 0; i <bins.length; i++) {%>
                        marker = new google.maps.Marker({
                            position: {lat: <%=((Double)bins[i][3]).doubleValue()%>, lng: <%=((Double)bins[i][4]).doubleValue()%>},
                            map: map
                        });
                    <%}%>
                }
            </script>
            <script async defer
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCrpKaiGqYJcUo3IG7crFITZjbn2yNZdJo&callback=initMap">
            </script>
        </section>

    </body>
</html>