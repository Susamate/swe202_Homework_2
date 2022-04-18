/*
B201202012
HALİL İBRAHİM ÜSTÜN
SWE202 SOFTWARE VERIFICATION AND VALIDATION
HOMEWORK 2
*/


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","10,4,2.5","12.5,5,2.5","10,2.5,4","12.5,2.5,5"})
    void collectionOfDivisions(double a, double b, double result){
        assertEquals(result, Calculator.divide(a,b));

    }

}