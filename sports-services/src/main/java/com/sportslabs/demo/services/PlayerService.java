package com.sportslabs.demo.services;

import com.sportslabs.demo.models.ImageAsset;
import com.sportslabs.demo.models.Player;
import com.sportslabs.demo.utils.ImageUtils;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

public class PlayerService {

    @Inject
    private ImageUtils imageUtils;
    private Set<Player> players;

    public void addPlayer(Player player) {
        if(players == null) players = new HashSet<Player>();
        players.add(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Player getByUniformNumber(Integer number) {
        if(players == null || number == null) return null;

        for(Player player : players) {
            if(player != null && number == player.getUniformNumber())
                return player;
        }

        return null;
    }

    public ImageAsset getThumbnailForPlayer(Player player) {
        ImageAsset thumbnail = new ImageAsset();
        imageUtils.resizeImage(thumbnail, 100, 100);
        return thumbnail;
    }

    public void setImageUtils(ImageUtils imageUtils) {
        this.imageUtils = imageUtils;
    }
}
