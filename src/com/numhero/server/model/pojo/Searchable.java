package com.numhero.server.model.pojo;

import javax.jdo.annotations.*;
import java.io.Serializable;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "false")
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public abstract class Searchable extends Versionable implements Serializable {
    public static final String ATTRIBUTE_STARTS_WITH_SEARCH = "lowerCaseForByStartsWithSearch";
    public static final String ATTRIBUTE_WORD_SEARCH = "wordsForSearch";

    private static final long serialVersionUID = 7061738459445476514L;

    @Persistent
    private String lowerCaseForByStartsWithSearch;

    @Persistent
    private List<String> wordsForSearch;

    public String getLowerCaseForByStartsWithSearch() {
        return lowerCaseForByStartsWithSearch;
    }

    public void setLowerCaseForByStartsWithSearch(String lowerCaseForByStartsWithSearch) {
        this.lowerCaseForByStartsWithSearch = lowerCaseForByStartsWithSearch;
    }

    public List<String> getWordsForSearch() {
        return wordsForSearch;
    }

    public void setWordsForSearch(List<String> wordsForSearch) {
        this.wordsForSearch = wordsForSearch;
    }
}
