package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.R;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.utils.Finder.findById;
import static com.mytaxi.android_demo.utils.Finder.findByText;




@RunWith(AndroidJUnit4.class)

public class Search {
/*
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    private MainActivity mActivity = null;

    @Before

    public void setActivity() {
        mActivity = mActivityRule.getActivity();
    }
*/

    public Search(String driver) throws InterruptedException {

        String driv = driver;

        // Looking for the Search Field
        findById(R.id.textSearch);

        // Type in the Search criteria to find the driver
        onView(withId(R.id.textSearch)).perform(ViewActions.typeText(driv));

        //Check if text is available
        String text;
        text = "sa";
        findByText(text);


    }
}

