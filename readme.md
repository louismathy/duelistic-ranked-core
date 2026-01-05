# duelistic-ranked-core

Core implementation of the Duelistic ranked system. This module wires the `duelistic-ranked-api` with a default set of ranks (Bronze → Master) and provides a simple entry point to obtain a ready-to-use `RankedAPI` instance.

## Requirements

- Java 21
- Maven

## Install

This module depends on `com.duelistic:duelistic-ranked-api:1.0-SNAPSHOT`. Ensure that artifact is available in your local/remote Maven repository before building.

```bash
mvn clean install
```

## Usage

```java
import com.duelistic.RankedSystem;
import com.duelistic.RankedAPI;

RankedSystem system = new RankedSystem();
RankedAPI api = system.getRankedAPI();
```

## Custom ranks

Provide your own repository by implementing `RankRepository` and passing it to `RankedSystem`:

```java
import com.duelistic.Rank;
import com.duelistic.RankRepository;
import com.duelistic.RankedSystem;

import java.util.Set;

class MyRanks implements RankRepository {
    @Override
    public Set<Rank> loadAll() {
        return Set.of(/* custom Rank instances */);
    }
}

RankedSystem system = new RankedSystem(new MyRanks());
```

## Default ranks

- Bronze: 0–799
- Silver: 800–999
- Gold: 1000–1199
- Platinum: 1200–1399
- Diamond: 1400–1599
- Master: 1600+
