# Songr LAB 13
## Main
on this lab I'm start dealing with Relation (Many-To-One):
- I'm creating a new Model for Song Class this model contain some attribute and contain an object from class Album
and using the Annotion @ManyToOne in this model cause many song belong to one album, so the many from the song
- then I'm creating a Repository called SongRepository it's also extends from JpaRepository
- I'm creating a new package called exception it's contain a java file to handel an error from album
- last thing I'm creating a SongsController in this controller we take an object from the 2 Repository 
- and create 2 methods :
> **getSongs** will return all data we added on song like title and track num and so on
> **addSongs** it's take all attribute on model as parameter for this method
- create an object from model and assign the repo value to this object
- then I'm start searching about the album id in database using findBy method if the id is not found will cause an error
- else will save the song data on database and redirect to index page.

## Test

in the test I'm using integration tests for your hello world route to check if it's return Hello World ! or not.