package ch.heigvd.mcr.bridgehack.player.races;

import ch.heigvd.mcr.bridgehack.game.Map;
import ch.heigvd.mcr.bridgehack.player.Player;
import ch.heigvd.mcr.bridgehack.player.roles.Role;
import org.newdawn.slick.SlickException;

/**
 * Race specialization: Dwarf
 */
public class Dwarf extends Player {
    /**
     * Constructor for the players character.
     *
     * @param role the initial role of the character
     * @param map  a reference to the map for collision detection
     * @throws SlickException if a problem occurred building the animations
     */
    public Dwarf(Role role, Map map) throws SlickException {
        super(role, map);
    }
}