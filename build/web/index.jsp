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
                <nav id = "navmenu" > <ul>
                        <li class = "current"> <a href="index.jsp"> home</a> </li>
                        <li> <a href="login.jsp"> login</a>

                            <ul> 
                                <li> <a href="login.jsp">Employee Login</a> </li>
                                <li>  <a href="mgrLogin.jsp">Manager Login</a></li>

                            </ul>
                        </li>
                    </ul> </nav>

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
                <form method="POST">
                    <input name="garbageDetails" placeholder ="Enter Bin ID, area, emirate ...">
                    <button name="searchBinBtn" type="submit" class ="button2"> Submit </button>
                </form>
            </div>
        </section>


        <section id="description"> 
            <aside id="desc"><h3>Garbage Bin Description </h3> </aside>
            <table id="table1">
                <tr><th>Bin ID: </th> 
                    <th>Emirate: </th>
                    <th>Area: </th> 
                    <th>Status: </th>
                </tr>
                <%
                GarbageBin g = new GarbageBin();
                int singleMarker = -1;
                Object[][] bins = new Object[0][0];
                if (request.getMethod()=="POST"){
                    try {
                        singleMarker = 1;
                        Integer ID = Integer.parseInt(request.getParameter("garbageDetails"));
                        if(g.viewBin(ID)){
                            out.write("<tr><td>" + ((Integer) g.getID()).toString() + "</td>");
                            out.write("<td>" + g.getEmirate() + "</td>");
                            out.write("<td>" + g.getArea() + "</td>");
                            out.write("<td>" + ((Double) g.getPercentage()).toString() + "</td></tr>");
                        }
                        else {
                            out.write("Not Found!");
                        }
                    } catch (NumberFormatException e) {
                        singleMarker = 0;
                        String area = request.getParameter("garbageDetails");
                        bins = g.viewBinByArea(area);
                        if (bins.length != 0) {
                            for (int i = 0; i < bins.length; i++) {
                                out.write("<tr><td>" + ((Integer) bins[i][0]).toString() + "</td>");
                                out.write("<td>" + bins[i][1] + "</td>");
                                out.write("<td>" + bins[i][2] + "</td>");
                                out.write("<td>" + ((Double) bins[i][5]).toString() + "</td></tr>");
                            }
                        } else {
                            out.write("Not Found!");
                        }
                    }                    
                }
                %>
            </table>

        </section>

        <style>
            #map {
                height: 400px;
                width: 100%;
            }
        </style>
    </head>
<body>
    <h3>Google Map View</h3>
    <div id="map"></div>
    <script>
        function initMap() {
            var m = {lat:25.0000, lng:55.0000};
            <%if(singleMarker == 1){%>
                m = {lat: <%=g.getLng()%>, lng: <%=g.getLat()%>};
                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 15,
                    center: m
                });
                var marker = new google.maps.Marker({
                    position: m,
                    map: map
                });
            <%} else if (singleMarker == 0){%>
                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 12,
                    center: {lat:25.3, lng:55.4}
                });
                <%
                for (int i = 0; i <bins.length; i++) {
                %>
                    m = {lat: <%=bins[i][3]%>, lng: <%=bins[i][4]%>};
                    var marker = new google.maps.Marker({
                        position: m,
                        map: map
                    });
                <%}
            } else {%>
                m = {lat: 25.0000, lng: 55.0000};
                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 11,
                    center: m
                });
            <%}%>
        }
    </script>
    <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCrpKaiGqYJcUo3IG7crFITZjbn2yNZdJo&callback=initMap">
    </script>


</body>
</html>