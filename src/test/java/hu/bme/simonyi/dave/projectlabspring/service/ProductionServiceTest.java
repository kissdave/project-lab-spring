package hu.bme.simonyi.dave.projectlabspring.service;

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
    @Mock
    ProductionRepository productionRepository;

    public ProductionServiceTest() {
        // Blank, no need to set up
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        // No teardown operation right now.
    }

    @Test
    public void testProductionService() {
        ProductionService ps = new ProductionService();
        assertEquals(12.0, ps.testingFunction(), 0.00001);
    }
}
