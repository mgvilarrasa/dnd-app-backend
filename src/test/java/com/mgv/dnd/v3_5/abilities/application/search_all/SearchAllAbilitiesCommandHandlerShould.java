package com.mgv.dnd.v3_5.abilities.application.search_all;

import com.mgv.dnd.v3_5.abilities.AbilitiesModuleUnitTestCase;
import com.mgv.dnd.v3_5.abilities.application.response.AbilitiesResponse;
import com.mgv.dnd.v3_5.abilities.domain.AbilitiesResponseMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchAllAbilitiesCommandHandlerShould extends AbilitiesModuleUnitTestCase {
    private SearchAllAbilitiesQueryHandler handler;

    @BeforeEach
    protected void setUp(){
        super.setUp();
        handler = new SearchAllAbilitiesQueryHandler(new AllAbilitiesSearcher(repository));
    }

    @Test
    void search_all_abilities(){
        AbilitiesResponse response = AbilitiesResponseMother.random(3);
        SearchAllAbilitiesQuery query = new SearchAllAbilitiesQuery();
        try{
            shouldAsk(query, response);
        } catch (Exception e){
            //Some exception
        }
    }
}
