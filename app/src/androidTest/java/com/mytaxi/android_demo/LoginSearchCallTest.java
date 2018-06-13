package com.mytaxi.android_demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.activities.Call;
import com.mytaxi.android_demo.activities.Login;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.activities.Search;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.Is.is;

@RunWith(AndroidJUnit4.class)

public class LoginSearchCallTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    private MainActivity mActivity = null;

    @Before
    public void setActivity() {
        mActivity = mActivityRule.getActivity();
    }

    @Test

    //Please note that the mytaxiTest represents the Test Case requested.
    //It calls 3 Activities: Login, Search and Call.
    // The activities were created in order to provide reusability to the code

    public void mytaxiTest() throws InterruptedException {

    //Creating a list of parameters so that we can parameterize our methods for future changes
    //e.g. a new set of username/password is needed

        ArrayList<String> testData = new ArrayList<String>();
        String s1 ="whiteelephant261";
        String s2 ="video1";
        String s3 ="sa";
        String s4 ="Sarah Friedrich";
        testData.add(s1);
        testData.add(s2);
        testData.add(s3);
        testData.add(s4);

//      Below are the calls for the Test Steps, each for one specific Activity

//      Step 1 - Login Activity
        Login login = new Login(testData.get(0), testData.get(1));

//      Step 2 - Search Activity call
        Search search = new Search(testData.get(2));

        // Searches for the dynamic driver name text
         onView(withText(testData.get(3))).inRoot(withDecorView(not(is(mActivity.getWindow().getDecorView()))))
                   .perform(click());

//      Step 3 - Click on Call Driver Activity
        Call call = new Call();

    }


}





