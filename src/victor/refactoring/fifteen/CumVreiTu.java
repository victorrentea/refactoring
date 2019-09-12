package victor.refactoring.fifteen;

import java.util.HashMap;
import java.util.Map;

class CumVreiTu {
    private String name;
    private Map<String, Object> params;
    private String query;

    public CumVreiTu(String name) {
        this.name = name;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getQuery() {
        return query;
    }

    public CumVreiTu invoke() {
        params = new HashMap<>();
        query = "SELECT e FROM Person e WHERE 1 = 1 ";

        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        if (name != null) {
            query += "   AND e.name = :name    ";
            params.put("name", name);
        } // + 20 similar
        return this;
    }
}
