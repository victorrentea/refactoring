package bscc.refactoringpatterns;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccumulationToCollecting {
    public static void main(String[] args) {
        QueryBuilder qb = new QueryBuilder();
        StringBuilder sb = new StringBuilder();
        Map<String, Object> map = new HashMap<>();

        qb.buildSql(sb, map);
        String sql = qb.getSql();
    }
}


//@Service
class Step1 {

    public void process(ExecutionParameters execParams) {
        execParams.setParam("date.pt.urmatorul.pas", 13L);
    }
}


// @Service
class QueryBuilder {

    // @Autowired / @Inject

//    private String sql = "SELECT * FROM KK WHERE 1=1 ";
//    private Map<String, Object> params = new HashMap<>();

    public String getSql() {
        return sql;
    }

    public void buildSql(/*criteria*/ StringBuilder sqlDePanaAcum, Map<String, Object> params) {
        if (criteria.blabla) {
            sqlDePanaAcum.append(" AND k.siPasta = ? ");
            params.put("kiki",  criteria.kiki);
        }
    }
    public void buildWhereForUser(/*criteria*/) {
        if (criteria.blabla) {
            sql += " AND u.siPasta = ? ";
        }
    }

    public String addUserCriteria(userCriteria) {
        if (userCritera.ceva) {
            return " AND User...." ;
        } else {
            return "";
        }
    }



    {
        String sql = "";
        sql += addUserCriteria(userCriteria);
        sql = addUserCriteria(sql, userCriteria);
        sql = addUserCriteria(sql, userCriteria);
        sql = addUserCriteria(sql, userCriteria);
        sql = addUserCriteria(sql, userCriteria);


        BigDecimal ten = BigDecimal.TEN;
        BigDecimal twenty = ten.add(ten);
    }
}

class ImmutableBuilder {
    private final String userpartName;
    private final String userAddress;

    ImmutableBuilder(String userpartName, String userAddress) {
        this.userpartName = userpartName;
        this.userAddress = userAddress;
    }

    public ImmutableBuilder withAddress(String address) {
        return new ImmutableBuilder(userpartName, address);
    }

//    public ChestieDeConstruit build() {
//        new ChestieDeConstruit
//    }
}

