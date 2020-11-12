/*
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *
 * calc_centralized
 * br.ufrn.calc.model
 * CalculatorTest
 * 10/11/20
 */

package br.ufrn.calc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    /**
     * Simple sun operation calculate test
     */
    @Test
    public void sumTest(){
        Assertions.assertEquals(40, new Calculator().sum(10, 30));
    }

    /**
     * Simple sub operation calculate test
     */
    @Test
    void subTest() { Assertions.assertEquals(20, new Calculator().sub(30, 10));}

    /**
     * Simple multiply operation calculate test
     */
    @Test
    void multTest() { Assertions.assertEquals(90, new Calculator().mult(30, 3)); }

    /**
     * Simple divide operation calculate test
     */
    @Test
    void divTest() { Assertions.assertEquals(10, new Calculator().div(30, 3)); }

    /**
     * Division by zero operation calculate test
     */
    @Test
    void divByZeroTest() { Assertions.assertThrows(IllegalArgumentException.class, () -> { new Calculator().div(30, 0); }); }

    /**
     * Simple pow operation calculate test
     */
    @Test
    void powTest() { Assertions.assertEquals(9, new Calculator().pow(3, 2)); }

    /**
     * Simple root square operation calculate test
     */
    @Test
    void squareTest() { Assertions.assertEquals(3, new Calculator().square(9)); }

    /**
     * Simple exponential operation calculate test
     */
    @Test
    void expTest() { Assertions.assertEquals(20.085536923187668, new Calculator().exp(3)); }

    /**
     * Simple logarithm operation calculate test
     */
    @Test
    void logTest() { Assertions.assertEquals(3, new Calculator().log(20.085536923187668)); }

}