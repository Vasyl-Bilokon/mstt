package AgentBehaviours;

// JADE libraries
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class TickerBehaviourAgent extends Agent {
    @Override
	
    protected void setup() {
        addBehaviour(new TickerBehaviour(this, 10000) {
            @Override
			
            protected void onTick() {
                // TO-DO something
            }
        });
    }
}
