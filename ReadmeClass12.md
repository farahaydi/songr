# Songr Lab12
- I'm start with setup the **application.properties** file by connect my project to database and select a database name **songr** and put the username and password for my
postgres 
- in the model i just use the @Entity annotation it's convert from java object to database 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) it's make a id (praimary Key for a database)
- then start to set up my Repository Layer -> create an Interface called **SongrReopsitores** and extends another interface **JpaRepository** it's take 
class(Model) and a data type of Id we create in model.
- in controller i complete work on my previous controller **AlbumController**
1- use **@Autowired** This annotation is used for automatic dependency injection I'm telling Spring to automatically inject (provide) the required dependency into that field, constructor, or method parameter.
2- create an object from **SongrReopsitores**
3- create new method from type RedirectView called **createAlbum** and send all the feild as parametre to this method
- this method will create this data in the database then redirect to the index page
- we can access this with this route **/create-Album**
4- create second method called **getAlbum** from type String to return all the album we store in database and return html page wtih all data called : getAllData.html
- 