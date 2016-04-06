/**
 * Generated by Creer at 03:31PM on April 06, 2016 UTC, git hash: 'e7ec4e35c89d7556b9e07d4331ac34052ac011bd'
 * A Spider spawned by the BroodMother.
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
 * A Spider spawned by the BroodMother.
 */
public class Spiderling extends Spider {
    /**
     * When empty string this Spiderling is not busy, and can act. Otherwise a string representing what it is busy with, e.g. 'Moving', 'Attacking'.
     */
    public boolean busy;

    /**
     * How much damage this Spiderling does to the BroodMother.
     */
    public int damage;

    /**
     * The Web this Spiderling is using to move. Null if it is not moving.
     */
    public Web movingOnWeb;

    /**
     * The Nest this Spiderling is moving to. Null if it is not moving.
     */
    public Nest movingToNest;

    /**
     * How much distance this Spiderling covers per turn when moving across Webs.
     */
    public float speed;

    /**
     * The number of turns remaining for this Spiderling's current task.
     */
    public int turnsRemaining;

    /**
     * How heavy this spider is. Webs it moves across must have enough strength to support it in addition to existing Spiderlings.
     */
    public int weight;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Spiderling. Used during game initialization, do not call directly.
     */
    public Spiderling() {
        super();
    }

    /**
     * Attacks another Spiderling
     *
     * @param   spiderling  The Spiderling to attack.
     * @return True if the attack was successful, false otherwise.
     */
    public boolean attack(Spiderling spiderling) {
        JSONObject args = new JSONObject();
        args.put("spiderling", Client.getInstance().gameManager.serializeSafe(spiderling));
        return (boolean)this.runOnServer("attack", args);
    }

    /**
     * Starts moving the Spiderling across a Web to another Nest.
     *
     * @param   web  The Web you want to move across to the other Nest.
     * @return True if the move was successful, false otherwise.
     */
    public boolean move(Web web) {
        JSONObject args = new JSONObject();
        args.put("web", Client.getInstance().gameManager.serializeSafe(web));
        return (boolean)this.runOnServer("move", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
