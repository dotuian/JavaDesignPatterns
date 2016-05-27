package com.dotuian.dp2.state;

public class NormalVoteState implements VoteState {

    @Override
    public void vote() {
        System.out.println("Normal Vote");
    }

}
