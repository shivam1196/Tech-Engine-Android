package com.shivam.tech_engine.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.shivam.tech_engine.BuildConfig;

public class SharedPrefsDetails  {
    private Context context;
    private SharedPreferences mSharedPreferences;
    private static SharedPrefsDetails sSharedPrefsDetails;


    private SharedPrefsDetails(Context context){
        this.context = context;
        mSharedPreferences = context.getSharedPreferences(BuildConfig.SHARED_PREFS_NAME,Context.MODE_PRIVATE);
    }

    public static void getInstance(Context context){
        if(sSharedPrefsDetails == null){
            sSharedPrefsDetails = new SharedPrefsDetails(context);
        }
    }


    private void setString(String key,String value){
        mSharedPreferences.edit().putString(key,value).commit();
    }

    private void setBoolean(String key,boolean
                            value){
        mSharedPreferences.edit().putBoolean(key, value).commit();
    }

    private void setInt(String key, int value){
        mSharedPreferences.edit().putInt(key,value).commit();
    }

    public void setIsLoginSuccessful(String key,boolean value){
        setBoolean(key, value);
    }

    public boolean getIsLoginSuccessful(String key){
       return mSharedPreferences.getBoolean(key,false);
    }
}
