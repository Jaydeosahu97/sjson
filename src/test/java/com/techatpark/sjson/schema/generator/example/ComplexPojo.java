package com.techatpark.sjson.schema.generator.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class ComplexPojo {
    private int integerValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringValue;
    private List<String> stringList;
//    private Map<String, Integer> stringIntegerMap;
//    private NestedObject nestedObject;
    private int[] intArray;
    private Integer[] intWrapperArray;
    private BigInteger[] bigIntegerArray;
//    private NestedObject[] nestedObjectArray;
    private long[] longArray;
    private Long[] longWrapperArray;
    private char[] charArray;
    private Character[] characterArray;
    private float[] floatArray;
    private Float[] floatWrapperArray;
    private  double[] doubleArray;
    private Double[] doubleWrapperArray;
    private String[] stringArray;
    // Constructors, getters, and setters can be added as needed.
    private BigDecimal[] bigDecimalArray;
    public static class NestedObject {
        private String nestedStringValue;
        private boolean nestedBooleanValue;

        // Constructors, getters, and setters can be added as needed.
    }
}
