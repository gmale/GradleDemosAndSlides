package com.sportslabs.demo.services;

import com.sportslabs.demo.models.ImageAsset;
import com.sportslabs.demo.models.Player;
import com.sportslabs.demo.utils.ImageUtils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class PlayerServiceTest {

    private PlayerService playerService;

    @Before
    public void setUp() throws Exception {
        playerService = new PlayerService();
        playerService.setImageUtils( new ImageUtils() );
    }

    @Test
    public void testAddEvent() throws Exception {
        assertNull(playerService.getPlayers());
        playerService.addPlayer(new Player("Lebron", "James", 23));
        assertNotNull(playerService.getPlayers());
        assertNotEquals(0, playerService.getPlayers().size());
    }

    @Test
    public void testGetByUniformNumber() throws Exception {
        playerService.addPlayer(new Player("Lebron", "James", 23));
        playerService.addPlayer(new Player("DeWayne", "Wade", 3));
        Player lebron = playerService.getByUniformNumber(23);
        assertEquals("Lebron", lebron.getFirstName());
    }

    @Test
    public void testGetThumbnailForPlayer() throws Exception {
        Player lebron = new Player("Lebron", "James", 23);
        playerService.addPlayer(lebron);
        ImageAsset thumbnail = playerService.getThumbnailForPlayer(lebron);
        assertNotNull(thumbnail);
        assertEquals(100, thumbnail.getWidth());
    }
}
