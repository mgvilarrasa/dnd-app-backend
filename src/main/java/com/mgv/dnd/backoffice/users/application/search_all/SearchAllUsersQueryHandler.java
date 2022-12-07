package com.mgv.dnd.backoffice.users.application.search_all;

import com.mgv.dnd.backoffice.users.application.response.UsersResponse;
import com.mgv.dnd.shared.domain.bus.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class SearchAllUsersQueryHandler implements QueryHandler<UsersResponse, SearchAllUsersQuery> {
    private final AllUsersSearcher searcher;

    public SearchAllUsersQueryHandler(AllUsersSearcher searcher){
        this.searcher = searcher;
    }

    @Override
    public UsersResponse ask(SearchAllUsersQuery query) throws Exception {
        return searcher.findAll();
    }
}
