/**
 * Generated by Creer at 03:31PM on April 06, 2016 UTC, git hash: 'e7ec4e35c89d7556b9e07d4331ac34052ac011bd'
 * The Spider Queen. She alone can spawn Spiderlings for each Player, and if she dies the owner loses.
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
 * The Spider Queen. She alone can spawn Spiderlings for each Player, and if she dies the owner loses.
 */
public class BroodMother extends Spider {
    /**
     * How many eggs the BroodMother has to spawn Spiderlings this turn.
     */
    public float eggs;

    /**
     * How much health this BroodMother has left. When it reaches 0, she dies and her owner loses.
     */
    public int health;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a BroodMother. Used during game initialization, do not call directly.
     */
    public BroodMother() {
        super();
    }

    /**
     * Consumes a Spiderling of the same owner to regain some eggs to spawn more Spiderlings.
     *
     * @param   spiderling  The Spiderling to consume. It must be on the same Nest as this BroodMother.
     * @return True if the Spiderling was consumed. False otherwise.
     */
    public boolean consume(Spiderling spiderling) {
        JSONObject args = new JSONObject();
        args.put("spiderling", Client.getInstance().gameManager.serializeSafe(spiderling));
        return (boolean)this.runOnServer("consume", args);
    }

    /**
     * Spawns a new Spiderling on the same Nest as this BroodMother, consuming an egg.
     *
     * @param   spiderlingType  The string name of the Spiderling class you want to Spawn. Must be 'Spitter', 'Weaver', or 'Cutter'.
     * @return The newly spwaned Spiderling if successful. Null otherwise.
     */
    public Spiderling spawn(String spiderlingType) {
        JSONObject args = new JSONObject();
        args.put("spiderlingType", Client.getInstance().gameManager.serializeSafe(spiderlingType));
        return (Spiderling)this.runOnServer("spawn", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
