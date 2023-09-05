# songr Lab11
we start dealing with Spring :
- We use Spring Initializr and using some Dependancy (Spring Boot Div Tools, Thymeleaf,..)
- we start applaing the lab requirment 
- -create package called **Controller** and then create our first class ->HelloWorldClass
- this class will print hello world, we can access this class using this route -> /hello
- second Class -> capitalizeClass this class will convert any String to UpperCase ,and here we using html page to display the String 
we can access this class using this route /capitalize/{upper} -> inside {} we can put any string we want to capitalize.
- then we starting with Album Class-> 
- we create a new package called **model** and create a java class called album, this java class contain data we want to use in controller
(title, an artist, a songCount, a length (in seconds), and an imageUrl) with getter an setter
- in controller package we create AlbumController and from this controller we display and access this album as a route
- we create an array that contains three albums, and then display those three on the page
- we can access this data using this route -> /albums
- we create a html and css to display data in clear way.