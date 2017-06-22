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

<li class = "current"> <a href="empPage.html"> Manage Garbage Bin</a> 
<ul> 
 <li> <a href="addbin.html">add garbage bin</a> </li>
<li>  <a href="deletebin.html">delete garbage bin</a></li>
  <li>  <a href="editbin.html">edit garbage bin</a></li>
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
<aside id="desc"><h3>Edit a Garbage Bin </h3> </aside>

<div id ="addbin">

<form  action="/action_page.php">
  <fieldset  >
    <legend>Garbage Bin Information :</legend>
    Bin ID:<br>
    <input type="text" name="id" value="00123">
    <br>
    Emirate :<br>
    <input type="text" name="lastname" value="Sharjah">
    <br><br>

     Area:<br>
    <input type="text" name="id" value="University City">
    <br>

     Coordinates :<br>
    <input type="text" name="id" value="52.32223 25.32233">
    <br>
    <input type="submit" value="Submit">
  </fieldset>
</form>
</div>

</section>






</body>
</html>