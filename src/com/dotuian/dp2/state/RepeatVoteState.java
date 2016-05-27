package com.dotuian.dp2.state;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RepeatVoteState implements VoteState {
    
    @Override
    public void vote() {
        System.out.println("Repeat Vote");
    }

}
