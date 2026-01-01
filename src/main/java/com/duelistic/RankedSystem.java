package com.duelistic;

/**
 * Main class of the ranked core system based on the RankedAPI
 */
public class RankedSystem {
    private final RankedAPI rankedAPI;
    /**
     * Constructs the system with the default repository
     */
    public RankedSystem() {
        this(new DefaultRankRepository());
    }

    /**
     * Constructs the system for custom repositories
     */
    public RankedSystem(RankRepository repository) {
        this.rankedAPI = new RankedAPI(repository.loadAll().toArray(new Rank[0]));
    }

    /**
     * @return Main ranked API
     */
    public RankedAPI getRankedAPI() {
        return rankedAPI;
    }
}
