package com.kd.utils.string.test;

import com.kd.utils.string.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hanke on 11/27/16.
 */

public class StringUtilsTest {

    @Test
    public void testIsNullOrBlank() {
        String str1 = null;
        String str2 = "";

        Assert.assertTrue(StringUtils.isNullOrBlank(str1));
        Assert.assertTrue(StringUtils.isNullOrBlank(str2));
    }
}
