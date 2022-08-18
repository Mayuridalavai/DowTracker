package com.analyzer.stock;

import com.analyzer.model.DowAnalyzer;
import com.analyzer.model.Stock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class DowAnalyzerTest {
    DowAnalyzer analyzer;

    @Before
    public void setUp() {
      analyzer= new DowAnalyzer();
    }


    @Test
    public void findStock_ShouldReturn_CorrectStock_WhenTickerFound(){
        Stock stockFound= analyzer.findStock("AAPL");
        assertEquals("AAPL", stockFound.getTicker());

    }
    @Test
    public void findStock_ShouldReturn_Null_WhenTickerNotFound(){
        Stock stockFound= analyzer.findStock("GOOG");
        assertNull(stockFound);

    }

}