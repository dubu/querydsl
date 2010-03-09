package com.mysema.query.hsqldb;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.mysema.query.Connections;
import com.mysema.query.InsertBaseTest;
import com.mysema.query.Target;
import com.mysema.query.sql.HSQLDBTemplates;
import com.mysema.testutil.FilteringTestRunner;
import com.mysema.testutil.Label;

@RunWith(FilteringTestRunner.class)
@Label(Target.HSQLDB)
public class InsertHsqldbTest extends InsertBaseTest{
    
    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initHSQL();
    }

    @Before
    public void setUpForTest() {
        dialect = new HSQLDBTemplates().newLineToSingleSpace();
    }

}
