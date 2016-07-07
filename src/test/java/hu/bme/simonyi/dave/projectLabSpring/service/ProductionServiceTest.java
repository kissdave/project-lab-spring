package hu.bme.simonyi.dave.projectlabspring.service;

import hu.bme.simonyi.dave.projectlabspring.model.Production;
import hu.bme.simonyi.dave.projectlabspring.repository.ProductionRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

/**
 * Created by dkiss on 2016. 07. 06..
 */
public class ProductionServiceTest {
    public ProductionServiceTest() {

    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
    }

    @Mock
    ProductionRepository productionRepository;

    @Test
    public void testProductionService() {
        ProductionService ps = new ProductionService();
        ps.TestingFunction();
        assertEquals(12.0, ps.TestingFunction(), 0.00001);
    }
}
