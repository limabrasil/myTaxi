package com.mytaxi.android_demo.utils;

import android.support.test.espresso.ViewInteraction;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

// Finder method responsible for improving the wait for objects, so that we dont use Waits directly
// Searches for the object multiple times, with a defined timeout

public class Finder {

    private static boolean waitForElementUntilDisplayed(ViewInteraction element) {
        int i = 0;
        while (i++ < 150) {
            try {
                element.check(matches(isDisplayed()));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Thread.sleep(5000);
                } catch (Exception e1) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static ViewInteraction findById(int itemId) {
        ViewInteraction element = onView(withId(itemId));
        waitForElementUntilDisplayed(element);
        return element;
    }

    public static ViewInteraction findByText(String itemText) {
        ViewInteraction element = onView(withText(itemText));
        waitForElementUntilDisplayed(element);
        return element;
    }
}
