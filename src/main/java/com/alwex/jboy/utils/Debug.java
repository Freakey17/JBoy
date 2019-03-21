package com.alwex.jboy.utils;

import org.apache.log4j.Logger;

/**
 *
 * @author Alex
 */
public class Debug
{


    protected static Logger logger;

    public static String toHex(short value)
    {
        String out = Integer.toHexString(value & 0xffff).toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 4)
        {
            stringBuilder.insert(0, "0");
        }
        out = stringBuilder.toString();
        return out;
    }

    public static String toHex(byte value)
    {
        String out = Integer.toHexString(value & 0xff).toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 2)
        {
            stringBuilder.insert(0, "0");
        }
        out = stringBuilder.toString();
        return out;
    }

    public static String toBin(byte value)
    {
        String out = Integer.toBinaryString(value & 0xff);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(out);
        while (stringBuilder.length() < 8)
        {
            stringBuilder.insert(0, "0");
        }
        out = stringBuilder.toString();
        return out;
    }

    public static void dumpRom(byte[] m, int from, int to)
    {

        for (int i = from; i < to; i++)
        {
            if ((i) % 16 == 0)
            {
                logger.info("");
                logger.info("(" + Integer.toHexString(i) + ") ");
            }
            logger.info(toHex(m[i]) + " ");
        }
        logger.info("");
    }
}
