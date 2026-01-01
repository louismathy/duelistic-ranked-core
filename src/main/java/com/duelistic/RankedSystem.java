package com.duelistic;


public class RankedSystem {
    private final RankedAPI rankedAPI;

    public RankedSystem() {
        this(new DefaultRankRepository());
    }

    public RankedSystem(RankRepository repository) {
        this.rankedAPI = new RankedAPI(repository.loadAll().toArray(new Rank[0]));
    }

    public RankedAPI getRankedAPI() {
        return rankedAPI;
    }
}
