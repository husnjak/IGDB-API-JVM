package com.api.igdb.apicalypse

/**
 * The ApiCalypse class uses it's functions to build out the query
 */
class ApiCalypse {
    private var search = ""
    private var fields = ""
    private var exclude = ""
    private var limit = ""
    private var offset = ""
    private var sort = ""
    private var where = ""

    /**
     * The ApiCalypse sort function
     *
     * @property field The field to sort by
     * @property order The sorting order; Ascending | Descending
     * @return ApiCalypse object with set sort query.
     */
    fun sort(field: String, order: Sort): ApiCalypse {
        this.sort = "s $field ${order.apiName};"
        return this
    }

    /**
     * The ApiCalypse fields function
     *
     * @property fields The fields to select
     * @return ApiCalypse object with set field query.
     */
    fun fields(fields: String): ApiCalypse {
        this.fields = "f $fields;"
        return this
    }

    /**
     * The ApiCalypse exclude function
     *
     * @property fields The fields to exclude
     * @return ApiCalypse object with set exclude query.
     */
    fun exclude(fields: String): ApiCalypse {
        this.exclude = "x $fields;"
        return this
    }

    /**
     * The ApiCalypse limit function
     *
     * @property limit The number of items in the query
     * @return ApiCalypse object with set limit query.
     */
    fun limit(limit: Int): ApiCalypse {
        this.limit = "l $limit;"
        return this
    }

    /**
     * The ApiCalypse offset function
     *
     * @property offset The number of items to offset in the query
     * @return ApiCalypse object with set offset query.
     */
    fun offset(offset: Int): ApiCalypse {
        this.offset = "o $offset;"
        return this
    }

    /**
     * The ApiCalypse search function
     *
     * @property searchQuery The query to search for
     * @return ApiCalypse object with set search query.
     */
    fun search(searchQuery: String): ApiCalypse {
        this.search = "search \"$searchQuery\";"
        return this
    }

    /**
     * The ApiCalypse where function
     *
     * @property where The logic to filter the request by
     * @return ApiCalypse object with set where query.
     */
    fun where(where: String): ApiCalypse {
        if (where.contains("where ") || where.contains("w ")) {
            this.where = where
        } else {
            if (where.contains(";"))
                this.where = "w $where"
            else
                this.where = "w $where;"
        }
        return this
    }

    /**
     * The buildQuery function builds the ApiCalypse object to a String query.
     *
     * @return String query based on the ApiCalypse object.
     */
    fun buildQuery(): String {
        var query = ""
        if (search.isNotBlank())
            query += search
        if (fields.isNotBlank())
            query += fields
        if (exclude.isNotBlank())
            query += exclude
        if (limit.isNotBlank())
            query += limit
        if (offset.isNotBlank())
            query += offset
        if (sort.isNotBlank())
            query += sort
        // TODO where
        if (where.isNotBlank())
            query += where

        return query
    }
}
