package com.dotuian.dp2.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    private Map<String, Integer> voteMap = new HashMap<String, Integer>();

    private VoteState voteState;

    public void vote(String username) {
        Integer count = 1;
        if (voteMap.containsKey(username)) {
            count = voteMap.get(username);
            count++;
        }
        voteMap.put(username, count);

        if (count == 1) {
            this.setVoteState(new NormalVoteState());
        } else if (count >= 2 && count <= 3) {
            this.setVoteState(new RepeatVoteState());
        } else if (count >= 4 && count <= 5) {
            this.setVoteState(new SpiteVoteState());
        } else if (count >= 6) {
            this.setVoteState(new BlackVoteState());
        }

        System.out.print(String.format("vote count (%s) : %d --> ", username, count));
        voteState.vote();

    }

    public VoteState getVoteState() {
        return voteState;
    }

    public void setVoteState(VoteState voteState) {
        this.voteState = voteState;
    }

}
