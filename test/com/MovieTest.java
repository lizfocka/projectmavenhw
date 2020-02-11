/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import itexps.com.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author focka
 */
public class MovieTest {
    Movie movie;
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         movie = new Movie ();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testmovie() {
     movie.setYear(2013);
     movie.setId("00000012");
     movie.setTitle("A beautiful dream");
     
     assertEquals(2013, movie.getYear());
     assertEquals("00000012", movie.getId());
     assertEquals("A beautiful dream", movie.getTitle());
     }
}
