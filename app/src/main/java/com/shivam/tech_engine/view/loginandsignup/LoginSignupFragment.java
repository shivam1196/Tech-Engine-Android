package com.shivam.tech_engine.view.loginandsignup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.shivam.tech_engine.R;

public class LoginSignupFragment extends Fragment implements View.OnClickListener {

    private Context loginSignUpContext;
    private TextView subtitleMessage, welcomeHeading;
    private ImageView welcomeIcon;
    private Button btnLogin, btnSignUp;
    private View loginView;
    private View signUpView;
    private View areaOfInterest;

    /********************************Login View Variables*********************/
    private EditText etUserName, etPassword;
    private Button btnSubmitButton;

    /******************************* Sign Up View Variables ********************/
    private EditText etFirstName, etLastName, etRegisterUserName, etRegisterPassword, etConfirmPassowrd;
    private Button btnSubmitSignUp;

    /*************************** Area of Interest Variables ********************/
    private CheckedTextView tvAndroid, tvCoding, tvAlgorithms, tvDataStructures, tvJava, tvBackend, tvProblemSolving;
    private Button btnSubmitAreaOfInterest;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            loginSignUpContext = context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_signup, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpMainView(view);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void setUpMainView(View view) {
        btnLogin = view.findViewById(R.id.btn_login);
        btnSignUp = view.findViewById(R.id.btn_signup);
        loginView = view.findViewById(R.id.layout_login);
        signUpView = view.findViewById(R.id.layout_signup);
        areaOfInterest = view.findViewById(R.id.layout_area_of_interest);
        subtitleMessage = view.findViewById(R.id.tv_login_subtitle);
        welcomeHeading = view.findViewById(R.id.tv_login_welcome_msg);
        welcomeIcon = view.findViewById(R.id.iv_welcome_screen_icon);
        btnLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    private void setUpSignUpView(View view) {
        etFirstName = view.findViewById(R.id.edt_firstname_field);
        etLastName = view.findViewById(R.id.edt_secondname_field);
        etRegisterUserName = view.findViewById(R.id.edt_username_reg_field);
        etRegisterPassword = view.findViewById(R.id.edt_password_reg_field);
        etConfirmPassowrd = view.findViewById(R.id.edt_confirm_password_reg_field);
        btnSubmitSignUp = view.findViewById(R.id.btn_signup_next);
        btnSubmitSignUp.setOnClickListener(this);

    }

    private void showSignUpView() {
        hideLandingWidgets();
        signUpView.setVisibility(View.VISIBLE);
    }

    private void setUpLoginView(View view) {
        etUserName = view.findViewById(R.id.edt_username_field);
        etPassword = view.findViewById(R.id.edt_password_field);
        btnSubmitButton = view.findViewById(R.id.btn_login_submit);
        btnSubmitButton.setOnClickListener(this);
    }

    private void showLoginView() {
        hideLandingWidgets();
        loginView.setVisibility(View.VISIBLE);
    }

    private void hideLandingWidgets() {
        btnLogin.setVisibility(View.GONE);
        btnSignUp.setVisibility(View.GONE);
        subtitleMessage.setVisibility(View.GONE);
        welcomeIcon.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {

        if (v == btnLogin) {
            showLoginView();
            setUpLoginView(loginView);
        } else if (v == btnSignUp) {
            showSignUpView();
            setUpSignUpView(signUpView);

        } else if (v == btnSubmitSignUp) {

        } else if (v == btnSubmitButton) {

        }
    }
}
