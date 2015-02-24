package com.numhero.shared.datacargo;

import com.google.gwt.user.client.rpc.IsSerializable;

public abstract class SearcheableListCommandRequest extends CommandRequest implements IsSerializable {
//    private int startIndex;

//TODO pagination, it should be:
    // private String currentKey   <-this could be null (for first page in ascOder, last in descOrder)
    //                                or the last result of current page (for next page in ascOrder)
    //                                or the first result of current page (for prev page in descOrder)
    // private boolean ascendingOrder <-ascOder or descOrder
    //
    // private String orderBy --- maybe enum but it could be on specific commands... dunno



    private int maxResults;
    private String searchString;
    private String suggestString;

//    public int getStartIndex() {
//        return startIndex;
//    }
//
//    public void setStartIndex(int startIndex) {
//        this.startIndex = startIndex;
//    }




    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public String getSuggestString() {
        return suggestString;
    }

    public void setSuggestString(String suggestString) {
        this.suggestString = suggestString;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
