package com.mgv.dnd.v3_5.abilities.application.search_all;

import com.mgv.dnd.shared.domain.bus.QueryHandler;
import com.mgv.dnd.v3_5.abilities.application.response.AbilitiesResponse;
import org.springframework.stereotype.Component;

@Component
public class SearchAllAbilitiesQueryHandler implements QueryHandler<AbilitiesResponse, SearchAllAbilitiesQuery> {
    private final AllAbilitiesSearcher searcher;

    public SearchAllAbilitiesQueryHandler(AllAbilitiesSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public AbilitiesResponse ask(SearchAllAbilitiesQuery query) throws Exception {
        return searcher.findAll();
    }
}
