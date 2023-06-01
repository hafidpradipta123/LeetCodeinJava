package org.LeetCodeExercise.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DesignBrowserHistory1472Test {
    @Test
    public void testBrowserHistory() {


        DesignBrowserHistory1472 browser = new DesignBrowserHistory1472("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        String back1 = browser.back(1);
        Assert.assertEquals("facebook.com", back1);

        String back2 = browser.back(1);
        Assert.assertEquals("google.com", back2);

        String forward1 = browser.forward(1);
        Assert.assertEquals("facebook.com", forward1);

        browser.visit("linkedin.com");


        String back3 = browser.back(7);
        Assert.assertEquals("leetcode.com", back3);
    }
}