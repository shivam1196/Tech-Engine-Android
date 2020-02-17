package com.shivam.tech_engine;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.shivam.tech_engine.utils.Constants;
import com.shivam.tech_engine.view.loginandsignup.LoginSignupFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchFragments(Constants.LOGIN_SIGN_UP,null,false);
    }


    private void launchFragments(String fragmentName, @Nullable Bundle bundle, boolean addToBackStack){
        if (fragmentName.equalsIgnoreCase(Constants.LOGIN_SIGN_UP)){
            LoginSignupFragment loginSignupFragment = new LoginSignupFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,loginSignupFragment)
                    .commitAllowingStateLoss();
        }
    }
}
