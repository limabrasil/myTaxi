package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;
import com.mytaxi.android_demo.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.utils.Finder.findById;

public class Call {

    public Call()
    {

        // Looking for the Call Button
        findById(R.id.fab);

        //Click the Call Button
        onView(withId(R.id.fab)).perform(ViewActions.click());


    }
}
