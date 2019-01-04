

class APICalypse {
    private var search = ""
    private var fields = ""
    private var exclude = ""
    private var limit = ""
    private var offset = ""
    private var sort = ""
    private var where = ""
    // TODO where, plan where class with functions

    fun sort(field: String, order: SortOrder): APICalypse {
        this.sort = "s $field ${order.apiName};"
        return this
    }

    fun fields(fields: String): APICalypse {
        this.fields = "f $fields;"
        return this
    }

    fun exclude(fields: String): APICalypse {
        this.exclude = "x $fields;"
        return this
    }

    fun limit(limit: Int): APICalypse {
        this.limit = "l $limit;"
        return this
    }

    fun offset(offset: Int): APICalypse {
        this.offset = "o $offset;"
        return this
    }

    fun search(searchQuery: String): APICalypse {
        this.search = "search \"$searchQuery\";"
        return this
    }

    fun where(where: String): APICalypse {
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

enum class SortOrder(val apiName: String) {
    ASCENDING("asc"), DESCENDING("desc")
}

