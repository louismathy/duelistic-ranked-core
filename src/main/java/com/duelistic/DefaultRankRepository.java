package com.duelistic;

import com.duelistic.ranks.*;

import java.util.Set;

public class DefaultRankRepository implements RankRepository{
    /**
     * Loads all the default ranks
     * @return default ranks
     */
    @Override
    public Set<Rank> loadAll() {
        return Set.of(
                new BronzeRank(),
                new SilverRank(),
                new GoldRank(),
                new PlatinumRank(),
                new Diamond(),
                new MasterRank()
        );
    }
}
