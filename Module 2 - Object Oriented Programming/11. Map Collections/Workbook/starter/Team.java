import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        // TODO
        setName(this.name);
        this.players = new HashMap<>();
    }

    public String getName() {
        // TODO
        return this.name;
    }

    public void setName(String name) {
        // TODO
        this.name = name;
    }

    public String getPlayer(String position) {
        // TODO
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        // TODO
        this.players.put(position, player);
    }

}
