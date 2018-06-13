package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;
import android.support.test.runner.AndroidJUnit4;
import com.mytaxi.android_demo.R;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.utils.Finder.findById;


@RunWith(AndroidJUnit4.class)

public class Login {

    public Login(String username, String password)
    {

        String usr = username;
        String pass = password;

       //Search for the username field
        findById(R.id.edt_username);

       //Type in username
        onView(withId(R.id.edt_username)).perform(ViewActions.typeText(usr));

        //Type in password
        onView(withId(R.id.edt_password)).perform(ViewActions.typeText(pass));

        //Click the Login Button
        onView(withId(R.id.btn_login)).perform(click());

    }
}

