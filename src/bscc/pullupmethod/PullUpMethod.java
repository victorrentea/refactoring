package bscc.pullupmethod;

public class PullUpMethod {
}


class Super {
    //@Autowired
    /*EntityManager*/private Object em;

    protected void m() {
        // acelasi lucru
        // 3 linii
    }
}

class A extends Super {
    public void n() {
        // em.persist
        m();
    }
}

class B extends Super {
    public void n2() {
        m();
    }
}