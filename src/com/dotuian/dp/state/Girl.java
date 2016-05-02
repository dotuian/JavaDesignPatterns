package com.dotuian.dp.state;

public class Girl {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }

}
