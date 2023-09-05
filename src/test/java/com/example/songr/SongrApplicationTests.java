package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	public void testAlbumConstructorAndGetters() {
		Album album = new Album("Clouds", "Fin Argus & Sabrina Carpenter", 5, 3600, "https://www.indiewire.com/wp-content/uploads/2020/10/clouds-disney-plus.jpg?w=1277&h=769&crop=1");

		assertEquals("Clouds", album.getTitle());
		assertEquals("Fin Argus & Sabrina Carpenter", album.getArtist());
		assertEquals(5, album.getSongCount());
		assertEquals(3600, album.getLength());
		assertEquals("https://www.indiewire.com/wp-content/uploads/2020/10/clouds-disney-plus.jpg?w=1277&h=769&crop=1", album.getImageUrl());
	}
	@Test
	public void testAlbumSetter()
	{
		Album album =new Album();
		album.setArtist("Fin Argus & Sabrina Carpenter");
		assertEquals("Fin Argus & Sabrina Carpenter",album.getArtist());
		album.setTitle("Clouds");
		assertEquals("Clouds",album.getTitle());
	}


}
