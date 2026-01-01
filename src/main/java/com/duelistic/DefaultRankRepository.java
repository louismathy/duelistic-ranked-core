package com.duelistic;

import com.duelistic.ranks.*;

import java.util.Set;

public class DefaultRankRepository implements RankRepository{
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
