package com.alwex.jboy.utils;

/**
 *
 * @author alex
 */
public class UnsignedByte
{
    /**
     * valeur de l'octet
     */
    byte value;

    public UnsignedByte(byte aValue)
    {
        this.value = aValue;
    }

    public byte shiftLeft(int shift)
    {
        return (byte) (this.value << shift);
    }

    public byte shiftRight(int shift)
    {
        return (byte) (this.value >> shift);
    }

    public void bitwise()
    {
        /*
        * Ist leer, aber keine Ahnung wieso
         */
    }

    public int combine(byte a, byte b)
    {
        return  ((((a << 8) & 0xffff | b & 0xff) & 0x0000ffff) & 0xffff);
    }

    @Override
    public String toString()
    {
        String out = Integer.toHexString(this.value & 0xff).toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 2)
        {
            stringBuilder.insert(0, "0");
            //out = "0" + out;
        }
        out = stringBuilder.toString();
        return out;
    }

    public int getValue()
    {
        return this.value & 0xff;
    }
}
