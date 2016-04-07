/**
 * Generated by Creer at 03:34AM on April 07, 2016 UTC, git hash: 'e7ec4e35c89d7556b9e07d4331ac34052ac011bd'
 * A location (node) connected to other Nests via Webs (edges) in the game that Spiders can converge on, regardless of owner.
 */
package games.spiders;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;

// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add addtional import(s) here
// <<-- /Creer-Merge: imports -->>

/**
 * A location (node) connected to other Nests via Webs (edges) in the game that Spiders can converge on, regardless of owner.
 */
public class Nest extends GameObject {
    /**
     * All the Spiders currently located on this Nest.
     */
    public List<Spider> spiders;

    /**
     * Webs that connect to this Nest.
     */
    public List<Web> webs;

    /**
     * The X coordinate of the Nest. Used for distance calculations.
     */
    public int x;

    /**
     * The Y coordinate of the Nest. Used for distance calculations.
     */
    public int y;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Nest. Used during game initialization, do not call directly.
     */
    public Nest() {
        super();
        this.spiders = new ArrayList<Spider>();
        this.webs = new ArrayList<Web>();
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
