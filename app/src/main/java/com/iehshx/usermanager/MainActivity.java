package com.iehshx.usermanager;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PersistableBundle accountOptions = new PersistableBundle();
//        UserManager manager = null;
//        try {
//            Method getMethod = UserManager.class.getMethod("get", Context.class);
//            manager = (UserManager) getMethod.invoke(null,this);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        try {
//         Method createUser =   UserManager.class.getMethod("createUser",String.class,int.class);
//         createUser.invoke(manager,"iehshx",1);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
        try {
            setAppEnabled(getPackageName(),true,10);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        getApplicationContext().startac
//        startActivityAsUser(1);
//        startactivity
//        ActivityManager am = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
//        am.sstar
    }



    private void setAppEnabled(String packageName, boolean enabled,int userId) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

//                    devicePolicyManager.enableSystemApp(
//                            BasicDeviceAdminReceiver.getComponentName(activity), packageName);

//        int userId = UserHandle.myUserId();
        Method getMethod = PackageManager.class.getMethod("installExistingPackageAsUser", String.class,int.class);
        int result = (int) getMethod.invoke(getPackageManager(),packageName,10);
//        getPackageManager().installExistingPackageAsUser(packageName, userId);
    }


    }
