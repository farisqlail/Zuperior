package com.example.sicapin.LoginRegister;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SessionAuth {

        private SharedPreferences prefs;

        public SessionAuth(Context cntx) {
            // TODO Auto-generated constructor stub
            prefs = PreferenceManager.getDefaultSharedPreferences(cntx);
        }

        public void setusename(String usename) {
            prefs.edit().putString("usename", usename).commit();
        }

        public String getusename() {
            String usename = prefs.getString("usename","");
            return usename;
        }

        public void setpassword(String password) {
            prefs.edit().putString("password", password).commit();
        }

        public String getpassword() {
            String password = prefs.getString("password","");
            return password;
        }
    }
