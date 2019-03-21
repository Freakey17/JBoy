package com.alwex.jboy.utils;



/**
 *
 * @author Alex
 */
public class ByteUtil
{
    private ByteUtil(){
        throw new IllegalStateException("Utility Class");
    }

    public static int UByte(byte value)
    {
        return value & 0xff;
    }

    public static int UShort(short value)
    {
        return value & 0xffff;
    }

    public static String toBin(byte value)
    {
        return Integer.toBinaryString(value);
    }

    public static String toBin(short value)
    {
        return Integer.toBinaryString(value);
    }
    
    public static String toHex(byte value)
    {
        String out = Integer.toHexString(UByte(value)).toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 2)
        {
            stringBuilder.append("0" + out);
        }
        return stringBuilder.toString();
    }

    public static String toHex(short value)
    {
        String out = Integer.toHexString(UShort(value)).toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 4)
        {
            stringBuilder.insert(0, "0");

        }
        out = stringBuilder.toString();
        return out;
    }

    public static int getBit(byte b, int pos)
    {
        if ((b & (1 << pos)) != 0)
        {
            return 1;
        }
        return 0;
    }
    
    /**
     * combine 2 octets tels que
     * 0x12 | 0x34 => 0x1234
     *
     * @param a
     * @param b
     * @return
     */
    public static int combine(byte a, byte b)
    {
        return ((((a << 8) & 0xffff | b & 0xff) & 0x0000ffff) & 0xffff);
    }

    public static byte[] split(int aValue)
    {
        byte[] out = new byte[2];

        out[0] = (byte) (aValue >> 8 & 0xFF);
        out[1] = (byte) (aValue & 0xFF);
        
        return out;
    }
}
