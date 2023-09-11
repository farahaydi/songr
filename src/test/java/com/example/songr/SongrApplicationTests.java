package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
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

	//******************************************************************************************************************

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testHelloWorld() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World !"));
	}


//	String artist, int songCount, int length, String imageUrl
@Test
public void testCreateAlbum() throws Exception{
	mockMvc.perform(
					post("/create-Album")
							.contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
							.param("title","Let's See")
							.param("artist","Farah")
							.param("songCount","3")
							.param("length","3000")
							.param("imageUrl","MyImage")
			)
			.andExpect(redirectedUrl("/"))
			.andExpect(status().isFound());
}




}
