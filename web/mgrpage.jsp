<html>
<link rel="stylesheet" type = "text/css" href="E:\Desktop\garbagewebsite\garbagehomepage.css"/>


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
<li> <a href="garbagehomepage.html"> home</a> </li>

<li class = "current"> <a href="mgrpage.html"> Manage Employee</a> 
<ul> 
 <li> <a href="addemp.html">add an  Employee</a> </li>
<li>  <a href="deleteemp.html">delete an  Employee</a></li>
  <li>  <a href="editemp.html">edit an  Employee</a></li>
  </ul>
</li>

<li > <a href="empPage.html"> logout</a> </li>

</ul>

 </nav>

</div> 
</header>

<section id="showcase"> 
<div>
    
<form action="moreInfo.html">
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
<input type "garbage" placeholder ="Enter Area...">
<button type="submit" class ="button2"> Submit </button>
</form>
	</div>
</section>

<section id="description"> 
<aside id="desc"><h3>Grabage Bin Description </h3> </aside>
  <table id="table1">
<tr><th>Bin ID: </th> 
<td>00912</td>
</tr>

<tr><th>Emirate: </th>
<td>Sharjah</td>
 </tr>
<tr><th>Area: </th> 
<td>University City </td></tr>
<tr><th>Status: </th> 
<td>Full !</td>
</tr>
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
        var uluru = {lat: 23.4241, lng: 53.8478};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCrpKaiGqYJcUo3IG7crFITZjbn2yNZdJo&callback=initMap">
    </script>


</body>
</html>