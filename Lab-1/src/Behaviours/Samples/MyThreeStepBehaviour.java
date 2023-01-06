package Behaviours.Samples;

import jade.core.behaviours.Behaviour;

public class MyThreeStepBehaviour extends Behaviour {
    private int step = 0;
    @Override
    public void action() {
        switch (step) {
            case 0 ->
                // TO-DO Something
                step++;
            case 1 ->
                // To-Do Something
                step++;
            case 2 ->
                // To-Do Something
                step++;
        }
    }

    @Override
    public boolean done() {
        return step == 3;
    }
}
