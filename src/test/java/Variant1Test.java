import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Variant1Test {

    @ParameterizedTest
    @MethodSource("provideToMeters")
    void toMeters(int input, int expected) {
        assertEquals(expected,Variant1.toMeters(input));
    }

    private static Stream<Arguments> provideToMeters(){
        return Stream.of(
                Arguments.of(0,0),
                Arguments.of(-2,0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIsPositive")
    void isPositive(int input, boolean expected) {
        assertEquals(expected,Variant1.isPositive(input));
    }

    private static Stream<Arguments> provideIsPositive(){
        return Stream.of(
                Arguments.of(100,true),
                Arguments.of(-2,false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIfPositive")
    void ifPositive(int input, int expected) {
        assertEquals(expected,Variant1.ifPositive(input));
    }

    private static Stream<Arguments> provideIfPositive(){
        return Stream.of(
                Arguments.of(100,101),
                Arguments.of(1,2)
        );
    }

    @Test
    void getDayByArray() {
    }

    @ParameterizedTest
    @MethodSource("provideGetDay")
    void getDay(int input, String expected) {
        assertEquals(expected,Variant1.getDay(input));
    }

    private static Stream<Arguments> provideGetDay(){
        return Stream.of(
                Arguments.of(1,"Monday"),
                Arguments.of(3,"Wednesday")
        );
    }

    @ParameterizedTest
    @MethodSource("provideGetNByK")
    void getNByK(int input1, int input2, int expected) {
        assertEquals(expected,Variant1.getNByK(input1,input2));
    }

    private static Stream<Arguments> provideGetNByK(){
        return Stream.of(
                Arguments.of(1,2,1),
                Arguments.of(3,5,3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideWhileAnBTask")
    void whileAnBTask(int input1,int input2, int expected) {
        assertEquals(expected,Variant1.whileAnBTask(input1,input2));
    }

    private static Stream<Arguments> provideWhileAnBTask(){
        return Stream.of(
                Arguments.of(5,3,2),
                Arguments.of(8,5,3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrayTask")
    void arrayTask(int[] input, int[] expected) {
        assertArrayEquals(expected,Variant1.arrayTask(input));
    }

    private static Stream<Arguments> provideArrayTask(){
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5},new int[]{1,3,5,7,9}),
                Arguments.of(new int[]{6, 7, 8, 9, 10},new int[]{1,3,5,7,9})
        );
    }

    @Test
    void matrixTask() {
    }
}