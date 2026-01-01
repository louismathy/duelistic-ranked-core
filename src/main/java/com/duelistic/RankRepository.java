package com.duelistic;

import java.util.Set;

public interface RankRepository {
    /**
     * @return ranks to load
     */
    Set<Rank> loadAll();
}
