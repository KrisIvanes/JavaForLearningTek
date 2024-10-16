package com.cristiancern.variablesandcomments;

public class VariablesAndComments {

    public static void main(String[] args) {

        // Declare Section

        boolean falseBooleanVariable;
        boolean trueBooleanVariable;
        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

//        Initialization of the above variables
        falseBooleanVariable = false;
        trueBooleanVariable = true;
        lowerLimitOfByteDataType = -128;
        upperLimitOfByteDataType = 127;
        lowerLimitOfShortDataType = -32768;
        upperLimitOfShortDataType = 32767;
        lowerLimitOfIntDataType = -2147483648;
        upperLimitOfIntDataType = 2147483647;
        lowerLimitOfLongDataType = -9223372036854775808L;
        upperLimitOfLongDataType = 9223372036854775807L;
        lowerLimitOfFloatDataType = 3.4E-38F;
        upperLimitOfFloatDataType = 3.4E+38F;
        lowerLimitOfDoubleDataType = -1.7E+308D;
        upperLimitOfDoubleDataType = 1.7E+305;

        System.out.println(lowerLimitOfByteDataType);
    }
}